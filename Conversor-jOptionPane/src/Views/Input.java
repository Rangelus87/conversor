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

        return Float.parseFloat(ValorAConvertir);
    }

    public int validarNull() {
        if (ValorAConvertir == null) {
            return -1;
        } else {
            return 1;
        }

    }

    // validar que el valor ingresado sea un numero y no otro caracter
    private boolean isNumber(String s) {
        try {
            Integer.valueOf(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
