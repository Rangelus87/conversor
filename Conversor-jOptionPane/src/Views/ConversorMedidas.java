package Views;

import javax.swing.JOptionPane;

public class ConversorMedidas {

    private enum OpcionesConversion {
        SELECCIONE_UNA_OPCION(0),
        MILIMETRO_A_CENTIMETRO(10),
        MILIMETRO_A_DECIMETRO(100),
        MILIMETRO_A_METRO(1000),
        CENTIMETRO_A_MILIMETRO(10),
        CENTIMETRO_A_DECIMETRO(10),
        CENTIMETRO_A_METRO(100),
        DECIMETRO_A_MILIMETRO(100),
        DECIMETRO_A_CENTIMETRO(10),
        DECIMETRO_A_METRO(10),
        METRO_A_MILIMETRO(1000),
        METRO_A_CENTIMETRO(100),
        METRO_A_DECIMETRO(10);

        private final int valor;

        private OpcionesConversion(int valor) {
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }

    }

    protected OpcionesConversion seleccionConversion;
    private float conversion;

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

    public int isNull() {
        if (seleccionConversion == null) {
            return -1;
        } else {
            return 1;
        }
    }

    public void conversion(float num) {
        int valorConversion = seleccionConversion.getValor();

        switch (seleccionConversion) {
            case MILIMETRO_A_CENTIMETRO:
            case MILIMETRO_A_DECIMETRO:
            case MILIMETRO_A_METRO:
            case CENTIMETRO_A_DECIMETRO:
            case CENTIMETRO_A_METRO:
            case DECIMETRO_A_METRO:
                conversion = num / valorConversion;
                break;

            case CENTIMETRO_A_MILIMETRO:
            case DECIMETRO_A_CENTIMETRO:
            case DECIMETRO_A_MILIMETRO:
            case METRO_A_CENTIMETRO:
            case METRO_A_DECIMETRO:
            case METRO_A_MILIMETRO:
                conversion = num * valorConversion;
                break;
        }
    }

    public float getConversion() {
        return conversion;
    }

}
