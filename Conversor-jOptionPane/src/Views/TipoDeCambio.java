package Views;

import javax.swing.JOptionPane;

public class TipoDeCambio {

    private Object[] opcionesTipoCambio;

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

        Object seleccionar = JOptionPane.showInputDialog(
                null,
                "Selecciones tipo de cambio: ",
                "Tipo de Cambio",
                JOptionPane.QUESTION_MESSAGE,
                null, opcionesTipoCambio,
                opcionesTipoCambio[0]
        );
    }
}
