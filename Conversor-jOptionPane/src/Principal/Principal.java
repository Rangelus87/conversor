package Principal;

import Views.ConversorMedidas;
import Views.ConversorTemperatura;
import Views.ConvesorMonedas;
import Views.Input;
import Views.MenuPrincipal;

public class Principal {

    private int seleccion;
    private float valorIngresado;
    private MenuPrincipal menuPrincipal;
    private Input input;
    private ConvesorMonedas convesorMonedas;
    private ConversorTemperatura conversorTemperatura;
    private ConversorMedidas conversorMedidas;

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

    private void validarNullConversorMonedas() {
        if (convesorMonedas.isNull() == -1) {
            llamadas();
        } else {
            convesorMonedas.seleccionarYConvertir(valorIngresado);
            System.out.println("Monedas convertidas: " + convesorMonedas.getConversion());
        }
    }

    private void validarNullConversorTemperatura() {
        if (conversorTemperatura.isNull() == -1) {
            llamadas();
        } else {
            conversorTemperatura.obtenerSeleccion(valorIngresado);
            System.out.println("Temperatura convertida: " + conversorTemperatura.getValorConvertido());
        }
    }

    private void validarNullConversorMedidas() {
        if (conversorTemperatura.isNull() == -1) {
            llamadas();
        } else {
            conversorMedidas.conversion(valorIngresado);
            System.out.println("Medida convertida: " + conversorMedidas.getConversion());
        }
    }

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

    private void valorConversion(int conversor, float valor) {

    }

    private void llamadas() {
        Principal test = new Principal();
        test.validacionNullInput();
        test.llamarConvertidor();
    }

    public static void main(String[] args) {

        Principal test = new Principal();
        test.llamadas();
    }
}
