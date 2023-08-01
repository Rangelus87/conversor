package Views;

import javax.swing.JOptionPane;

/**
 * La clase ConversorTemperatura representa un conversor de temperaturas que
 * permite convertir entre diferentes unidades de temperatura, como Celsius,
 * Fahrenheit y Kelvin.
 *
 * @author rangelus
 */
public class ConversorTemperatura {

    /**
     * Enum TiposConversion define las opciones disponibles para la conversión
     * de temperaturas.
     */
    private enum TiposConversion {
        SELECCIONE_UNA_OPCION("null", "null"),
        CELSIUS_A_FAHRENHEIT("grados celsius", "grados fahrenheit"),
        CELSIUS_A_KELVIN("grados celsius", "kelvin"),
        FAHRENHEIT_A_CELSIUS("grados fahrenheit", "grados celsius"),
        FAHRENHEIT_A_KELVIN("grados fahrenheit", "kelvin"),
        KELVIN_A_CELSIUS("kelvin", "grados celsius"),
        KELVIN_A_FAHRENHEIT("kelvin", "grados fahrenheit");

        private final String unidadEntrada;
        private final String unidadSalida;

        private TiposConversion(String unidadEntrada, String unidadSalida) {
            this.unidadEntrada = unidadEntrada;
            this.unidadSalida = unidadSalida;
        }

        public String getUnidadEntrada() {
            return unidadEntrada;
        }

        public String getUnidadSalida() {
            return unidadSalida;
        }

    }

    private TiposConversion seleccionConversion;
    private float valorConvertido;

    /**
     * Constructor de la clase ConversorTemperatura. Muestra un cuadro de
     * diálogo para que el usuario seleccione una opción de conversión.
     */
    public ConversorTemperatura() {
        TiposConversion[] tiposConversion = TiposConversion.values();
        seleccionConversion = (TiposConversion) JOptionPane.showInputDialog(
                null,
                "Seleccione el tipo de conversion",
                "Temperatura",
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
        return seleccionConversion == null ? -1 : 1;
    }

    /**
     * Realiza la conversión del valor proporcionado según la opción
     * seleccionada.
     *
     * @param num El valor numérico que se convertirá.
     */
    public void obtenerSeleccion(float num) {

        switch (seleccionConversion) {
            case CELSIUS_A_FAHRENHEIT:
                valorConvertido = (num * 1.8F) + 32;
                break;
            case CELSIUS_A_KELVIN:
                valorConvertido = num + 273.15F;
                break;
            case FAHRENHEIT_A_CELSIUS:
                valorConvertido = (num - 32) / 1.8F;
                break;
            case FAHRENHEIT_A_KELVIN:
                valorConvertido = ((num - 32) / 1.8F) + 273.15F;
                break;
            case KELVIN_A_CELSIUS:
                valorConvertido = num - 273.15F;
                break;
            case KELVIN_A_FAHRENHEIT:
                valorConvertido = ((num - 273.15F) * 1.8F) + 32;
                break;
        }
    }

    /**
     * Obtiene el valor resultante después de la conversión.
     *
     * @return El valor convertido.
     */
    public float getValorConvertido() {
        return valorConvertido;
    }

    /**
     * Obtiene la unidad de medida base
     *
     * @return la unidad de medida base
     */
    public String getUnidadEntrada() {
        return seleccionConversion.getUnidadEntrada();
    }

    /**
     * Obtiene la unidad de medida de dalida
     *
     * @return la unidad de medida de salida
     */
    public String getUnidadSalida() {
        return seleccionConversion.getUnidadSalida();
    }
}
