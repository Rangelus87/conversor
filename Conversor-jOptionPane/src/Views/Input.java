package Views;

import javax.swing.JOptionPane;

public class Input {

    private String entrada;

    public Input() {
        entrada = JOptionPane.showInputDialog(
                null,
                "Ingrese el valor a convertir:",
                "Entrada",
                JOptionPane.QUESTION_MESSAGE);
    }

    public String getEntrada() {
        while (entrada != null && !isNumber(entrada)) {
            JOptionPane.showMessageDialog(
                    null,
                    "valor Invalido, \n debe ingresar un valor numérico",
                    "Error", JOptionPane.ERROR_MESSAGE);

            entrada = JOptionPane.showInputDialog(null,
                    "Ingrese un valor numerico");
        }
        if (entrada == null) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
        }

        return entrada;
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
    public void ejecutarConvertidor() {

    }

}
