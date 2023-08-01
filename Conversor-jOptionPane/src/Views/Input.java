package Views;

import javax.swing.JOptionPane;

/**
 * La clase Input representa una entrada de valor numérico proporcionada por el
 * usuario. Se utiliza para obtener un valor que se convertirá posteriormente en
 * el programa.
 */
public class Input {

    private String ValorAConvertir;

    /**
     * Constructor de la clase Input. Muestra un cuadro de diálogo para que el
     * usuario ingrese un valor numérico.
     */
    public Input() {
        ValorAConvertir = JOptionPane.showInputDialog(
                null,
                "Ingrese el valor a convertir:",
                "Entrada",
                JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Obtiene el valor numérico ingresado por el usuario. Si el valor ingresado
     * no es numérico, muestra un mensaje de error y solicita un nuevo valor
     * hasta que sea válido.
     *
     * @return El valor numérico ingresado por el usuario.
     */
    public float getEntrada() {
        while (ValorAConvertir != null && !isNumber(ValorAConvertir)) {
            JOptionPane.showMessageDialog(
                    null,
                    "valor Invalido \n Debe ingresar un valor numérico",
                    "Error", JOptionPane.ERROR_MESSAGE);

            ValorAConvertir = JOptionPane.showInputDialog(null,
                    "Ingrese un valor numerico");
        }

        // Convertir el valor válido ingresado en un número de tipo float
        return Float.parseFloat(ValorAConvertir);
    }

    /**
     * Valida si el valor ingresado es nulo (es decir, si el usuario ha
     * cancelado la entrada).
     *
     * @return 1 si el valor no es nulo, -1 si es nulo.
     */
    public int validarNull() {
        if (ValorAConvertir == null) {
            return -1;
        } else {
            return 1;
        }

    }

    /**
     * Valida si una cadena es un número o no.
     *
     * @param s La cadena a validar.
     * @return true si la cadena es un número, false si no lo es.
     */
    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
