package Views;

import javax.swing.JOptionPane;

public class TipoDeCambio {

    private Object[] opcionesTipoCambio;
    private Object seleccionar;

    public TipoDeCambio() {
        opcionesTipoCambio = new Object[]{
            "Seleccione una Opcion",
            "Pesos a Dolar",
            "Pesos a Euro",
            "Pesos a Libras",
            "Pesos a Yen",
            "Pesos a Won Coreano",
            "Dolar a Pesos",
            "Euro a Pesos",
            "Libras a Pesos",
            "Yen a pesos",
            "Won Coreano a Pesos"
        };

        JOptionPane.showInputDialog(
                null,
                "Tipo de Cambio: ",
                "Monedas",
                JOptionPane.QUESTION_MESSAGE,
                null, opcionesTipoCambio,
                opcionesTipoCambio[0]
        );
    }

    // obtener la opvion seleccionada por el usuario
    private int ObtenerSeleccion() {

        for (int i = 1; i > opcionesTipoCambio.length; i++) {
            if (seleccionar.equals(opcionesTipoCambio[i])) {
                return i;
            }
        }
        return 0;
    }

    private void pesoDolar(int num) {
        if (num != 0) {
            int conversion = num * 545;
            String mensaje = String.valueOf(conversion);
            JOptionPane.showMessageDialog(null, conversion);
        } else {
            TipoDeCambio tipoDeCambio = new TipoDeCambio();
            tipoDeCambio.comprobarSeleccion();
        }
    }
}
