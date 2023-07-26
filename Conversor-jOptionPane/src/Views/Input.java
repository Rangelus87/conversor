package Views;

import javax.swing.JOptionPane;

public class Input {

    protected static String entrada;

    public Input() {
        entrada = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir:", "Entrada", JOptionPane.QUESTION_MESSAGE);
    }

    // validar que el valor ingresado sea un numero y no otro caracter
    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    // comprobar y ejecutar el convertidor correspondiente
    protected void ejecutarConvertidor(int i) {

        while (entrada != null && !isNumber(entrada)) {
            entrada = JOptionPane.showInputDialog(null, "NUMERO INVALIDO! \n ingrese un valor numerico");
        }
        if (entrada == null) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
        } else {
            if (i == 1) {
                TipoDeCambio tipoDeCambio = new TipoDeCambio();
            } else if (i == 2) {
                ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
            } else if (i == 3) {
                ConversorMedidas conversorMedidas = new ConversorMedidas();
            }
        }

    }

}
