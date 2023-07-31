package Test;

import Views.ConversorMedidas;
import Views.ConversorTemperatura;
import Views.ConvesorMonedas;
import Views.Input;
import Views.MenuPrincipal;

public class Test {

    private void llamarConvertidor(int i) {
        Input input = new Input();
        float ValorIngresado = input.getEntrada();

        if (i == 1) {
            ConvesorMonedas convesorMonedas = new ConvesorMonedas();
            convesorMonedas.obtenerSeleccion(ValorIngresado);
            System.out.println(convesorMonedas.getConversion());
        } else if (i == 2) {
            ConversorMedidas conversorMedidas = new ConversorMedidas();
        } else if (i == 3) {
            ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
            conversorTemperatura.obtenerSeleccion(ValorIngresado);
            System.out.println(conversorTemperatura.getValorConvertido());
        }
    }

    private void valorConversion(int conversor, float valor) {

    }

    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        int seleccion = menuPrincipal.obtenerSeleccion();
        System.out.println("seleccion = " + seleccion);
        Test test = new Test();
        test.llamarConvertidor(seleccion);
    }
}
