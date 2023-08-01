package Views;

import javax.swing.JOptionPane;

/**
 * La clase ConversorTemperatura representa un conversor de temperaturas que
 * permite convertir entre diferentes unidades de temperatura, como Celsius,
 * Fahrenheit y Kelvin.
 */
public class ConversorTemperatura {

    /**
     * Enum TiposConversion define las opciones disponibles para la conversión
     * de temperaturas.
     */
    private enum TiposConversion {
        SELECCIONE_UNA_OPCION,
        CELSIUS_A_FAHRENHEIT,
        CELSIUS_A_KELVIN,
        FAHRENHEIT_A_CELSIUS,
        FAHRENHEIT_A_KELVIN,
        KELVIN_A_CELSIUS,
        KELVIN_A_FAHRENHEIT;
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
}
