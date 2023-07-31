package Views;

import javax.swing.JOptionPane;

public class Input {

    private String ValorAConvertir;

    public Input() {
        ValorAConvertir = JOptionPane.showInputDialog(
                null,
                "Ingrese el valor a convertir:",
                "Entrada",
                JOptionPane.QUESTION_MESSAGE);
    }

    public float getEntrada() {
        while (ValorAConvertir != null && !isNumber(ValorAConvertir)) {
            JOptionPane.showMessageDialog(
                    null,
                    "valor Invalido \n Debe ingresar un valor numérico",
                    "Error", JOptionPane.ERROR_MESSAGE);

            ValorAConvertir = JOptionPane.showInputDialog(null,
                    "Ingrese un valor numerico");
        }
        if (ValorAConvertir == null) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
        }

        float valorRetornado = Float.parseFloat(ValorAConvertir);
        return valorRetornado;
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
}
