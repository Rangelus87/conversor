package Views;

import javax.swing.JOptionPane;

public class ConversorMedidas {

    private enum OpcionesConversion {
        SELECCIONE_UNA_OPCION,
        MILIMETRO_A_DECIMETRO,
        MILIMETRO_A_CENTIMETRO,
        MILIMETRO_A_METRO,
        DECIMETRO_A_MILIMETRO,
        DECIMETRO_A_CENTIMETRO,
        DECIMETRO_A_METRO,
        CENTIMETRO_A_MILIMETRO,
        CENTIMETRO_A_DECIMETRO,
        CENTIMETRO_A_METRO,
        METRO_A_MILIMETRO,
        METRO_A_DECIMETRO,
        METRO_A_CENTIMETRO;
    }

    protected OpcionesConversion seleccionConversion;

    public ConversorMedidas() {
        OpcionesConversion[] tiposConversion = OpcionesConversion.values();
        seleccionConversion = (OpcionesConversion) JOptionPane.showInputDialog(
                null,
                "Tipo de Cambio: ",
                "Medidas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                tiposConversion,
                tiposConversion[0]
        );
    }

}
