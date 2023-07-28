package Test;

import Views.ConversorMedidas;
import Views.ConversorTemperatura;
import Views.ConvesorMonedas;
import Views.Input;
import Views.MenuPrincipal;
import Views.ValorConversion;

public class Test {

    private float valorConvertido;

    private void llamarConvertidores(int i, String entrada) {

        if (i == 1) {
            ConvesorMonedas convesorMonedas = new ConvesorMonedas();
            convesorMonedas.obtenerSeleccion(Integer.parseInt(entrada));
            ValorConversion valorConversion = new ValorConversion(convesorMonedas.getConversion());
        } else if (i == 2) {
            ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
        } else if (i == 3) {
            ConversorMedidas conversorMedidas = new ConversorMedidas();
        }
    }

    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.comprobarSeleccion();
        Input input = new Input();
        Test test = new Test();
        test.llamarConvertidores(menuPrincipal.comprobarSeleccion(), input.getEntrada());
    }
}
