package Views;

import javax.swing.JOptionPane;

/**
 * La clase ConversorMedidas representa un conversor de medidas que permite
 * convertir entre diferentes unidades de longitud, como milímetros,
 * centímetros, decímetros y metros.
 */
public class ConversorMedidas {

    /**
     * Enum OpcionesConversion define las opciones disponibles para la
     * conversión de medidas. Cada opción tiene asociado un valor de conversión.
     */
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

    /**
     * Constructor de la clase ConversorMedidas. Muestra un cuadro de diálogo
     * para que el usuario seleccione una opción de conversión.
     */
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

    /**
     * Verifica si la selección de conversión es nula (es decir, si el usuario
     * ha cancelado la selección).
     *
     * @return 1 si la selección no es nula, -1 si es nula.
     */
    public int isNull() {
        if (seleccionConversion == null) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Realiza la conversión del valor proporcionado según la opción
     * seleccionada.
     *
     * @param num El valor numérico que se convertirá.
     */
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

    /**
     * Obtiene el resultado de la conversión.
     *
     * @return El valor resultante después de la conversión.
     */
    public float getConversion() {
        return conversion;
    }

}
