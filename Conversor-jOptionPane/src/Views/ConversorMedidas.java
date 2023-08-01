package Views;

import javax.swing.JOptionPane;

/**
 * La clase ConversorMedidas representa un conversor de medidas que permite
 * convertir entre diferentes unidades de longitud, como milímetros,
 * centímetros, decímetros y metros.
 *
 * @author rangelus
 */
public class ConversorMedidas {

    /**
     * Enum OpcionesConversion define las opciones disponibles para la
     * conversión de medidas. Cada opción tiene asociado un valor de conversión.
     */
    private enum OpcionesConversion {
        SELECCIONE_UNA_OPCION(0, "null", "null"),
        MILIMETRO_A_CENTIMETRO(10, "milimetros", "centimetros"),
        MILIMETRO_A_DECIMETRO(100, "milimetros", "decimetros"),
        MILIMETRO_A_METRO(1000, "milimetros", "metros"),
        CENTIMETRO_A_MILIMETRO(10, "centimetros", "milimetros"),
        CENTIMETRO_A_DECIMETRO(10, "centimetros", "decimetros"),
        CENTIMETRO_A_METRO(100, "centimetros", "metros"),
        DECIMETRO_A_MILIMETRO(100, "decimetros", "milimetros"),
        DECIMETRO_A_CENTIMETRO(10, "decimetros", "centimetros"),
        DECIMETRO_A_METRO(10, "decimetros", "metros"),
        METRO_A_MILIMETRO(1000, "metros", "milimetros"),
        METRO_A_CENTIMETRO(100, "metros", "centimetros"),
        METRO_A_DECIMETRO(10, "metros", "decimetros");

        private final int valor;
        private final String unidadEntrada;
        private final String unidadSalida;

        private OpcionesConversion(int valor, String unidadEntrada, String unidadSalida) {
            this.valor = valor;
            this.unidadEntrada = unidadEntrada;
            this.unidadSalida = unidadSalida;
        }

        public int getValor() {
            return valor;
        }

        public String getUnidadEntrada() {
            return unidadEntrada;
        }

        public String getUnidadSalida() {
            return unidadSalida;
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
        return seleccionConversion != null ? 1 : -1;
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

    /**
     * Obrtinene la unidad de medida base
     *
     * @return unidad de medida base
     */
    public String getUnidadEntrada() {
        return seleccionConversion.getUnidadEntrada();
    }

    /**
     * Obrtinene la unidad de medida final
     *
     * @return unidad de medida final
     */
    public String getUnidadSalida() {
        return seleccionConversion.getUnidadSalida();
    }

}
