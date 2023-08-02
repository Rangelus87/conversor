package Principal;

import Views.ConversorMedidas;
import Views.ConversorTemperatura;
import Views.ConvesorMonedas;
import Views.Input;
import Views.MenuPrincipal;
import Views.VentanaContunuar;
import Views.VentanaSalidaConversion;
import javax.swing.JOptionPane;

/**
 * Clase pricipal del programa conversores donde se llaman y ejecutan todas las
 * clases creadas con los diferentes tipos de conversores
 *
 * @author rangelus
 */
public class Principal {

    private int seleccion;
    private float valorIngresado;
    private MenuPrincipal menuPrincipal;
    private Input input;
    private ConvesorMonedas convesorMonedas;
    private ConversorTemperatura conversorTemperatura;
    private ConversorMedidas conversorMedidas;
    private VentanaSalidaConversion ventana;

    // metodo que inicia el software y valida la entrada del usuario
    private void validacionNullInput() {
        menuPrincipal = new MenuPrincipal();
        input = new Input();
        if (input.validarNull() != -1) {
            seleccion = menuPrincipal.obtenerSeleccion();
            System.out.println("seleccion = " + seleccion);
            valorIngresado = input.getEntrada();
            System.out.println("Valor Ingresado: " + valorIngresado);
        } else {
            validacionNullInput();
        }

    }

    //comprobacion de la seleccion del usuario 
    private void validarNullConversorMonedas() {
        if (convesorMonedas.isNull() == -1) {
            llamadas();
        } else {
            convesorMonedas.seleccionarYConvertir(valorIngresado);
            ventana = new VentanaSalidaConversion(
                    valorIngresado,
                    convesorMonedas.getMonedaEntrada(),
                    convesorMonedas.getConversion(),
                    convesorMonedas.getMonedaSalida());

            System.out.println("Monedas convertidas: " + convesorMonedas.getConversion());
        }
    }

    //Comprobacion de la seleccion del usuario
    private void validarNullConversorTemperatura() {
        if (conversorTemperatura.isNull() == -1) {
            llamadas();
        } else {
            conversorTemperatura.obtenerSeleccion(valorIngresado);
            ventana = new VentanaSalidaConversion(
                    valorIngresado,
                    conversorTemperatura.getUnidadEntrada(),
                    conversorTemperatura.getValorConvertido(),
                    conversorTemperatura.getUnidadSalida());
            System.out.println("Temperatura convertida: " + conversorTemperatura.getValorConvertido());
        }
    }

    //Comprobacion de la seleccion del usuario
    private void validarNullConversorMedidas() {
        if (conversorMedidas.isNull() == -1) {
            llamadas();
        } else {
            conversorMedidas.conversion(valorIngresado);
            ventana = new VentanaSalidaConversion(
                    valorIngresado,
                    conversorMedidas.getUnidadEntrada(),
                    conversorMedidas.getConversion(),
                    conversorMedidas.getUnidadSalida());
            System.out.println("Medida convertida: " + conversorMedidas.getConversion());
        }
    }

    // Método para llamar al convertidor según la selección del menuPrincipal
    private void llamarConvertidor() {

        switch (seleccion) {
            case 1 -> {
                convesorMonedas = new ConvesorMonedas();
                validarNullConversorMonedas();
            }
            case 2 -> {
                conversorMedidas = new ConversorMedidas();
                validarNullConversorMedidas();
            }
            case 3 -> {
                conversorTemperatura = new ConversorTemperatura();
                validarNullConversorTemperatura();
            }
            default -> {
                System.out.println("No se que paso");
            }
        }
    }

    /**
     * El metodo llamadas como indica su nombre hace la llamada a los metodos
     * que inician el programa
     */
    private void llamadas() {
        Principal conversorPrincipal = new Principal();
        conversorPrincipal.validacionNullInput();
        conversorPrincipal.llamarConvertidor();
    }

    /**
     * El metodo salir comprueba si salir o continuar en el programa
     */
    private void salir() {
        VentanaContunuar continuar = new VentanaContunuar();
        while (!continuar.validarSalir()) {
            llamadas();
            new VentanaContunuar();
        }
    }

    /**
     * ventana que avisa la rerminacion del programa
     */
    private void terminado() {
        JOptionPane.showMessageDialog(null, "Programa terminado");
    }

    public static void main(String[] args) {

        Principal conversorPrincipal = new Principal();
        conversorPrincipal.llamadas();
        conversorPrincipal.salir();
        conversorPrincipal.terminado();
    }
}
