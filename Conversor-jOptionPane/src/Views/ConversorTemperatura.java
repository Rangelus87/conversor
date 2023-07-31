package Views;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

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

    public float getValorConvertido() {
        return valorConvertido;
    }
}
