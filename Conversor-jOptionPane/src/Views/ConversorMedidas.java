package Views;

import javax.swing.JOptionPane;

public class ConversorMedidas {

    protected Object[] opcionesMedidas;

    public ConversorMedidas() {
        opcionesMedidas = new Object[]{
            "Seleccione una Opcion",
            "Milimetro a Decimetro",
            "Milimetro a Centimetro",
            "Milimetro a Metro",
            "Decimetro a milimetro",
            "Decimetro a Centimetro",
            "Decimetro a Metro",
            "Centimetro a Milimetro",
            "Centimetro a Decimetro",
            "Centimetro a Metro",
            "Metro a milimetro",
            "Metro a Decimetro",
            "Metro a Centimetro"
        };
        Object seleccionar = JOptionPane.showInputDialog(
                null,
                "Tipo de Cambio: ",
                "Medidas",
                JOptionPane.QUESTION_MESSAGE,
                null, opcionesMedidas,
                opcionesMedidas[0]
        );
    }
}
