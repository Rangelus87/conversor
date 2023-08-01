package Views;

import javax.swing.JOptionPane;

/**
 * La clase ConvesorMonedas representa un convertidor de monedas que permite
 * realizar conversiones entre diferentes tipos de monedas, de Peso a Dólar,
 * Euro, Libra, Yen o Won Coreano y a la inversa. La conversión se realiza
 * mediante una selección del tipo de cambio y una cantidad a convertir.
 *
 * @author rangelus
 */
public class ConvesorMonedas {

    /**
     * Enum TipoCambio define los tipos de cambio disponibles para la
     * conversión. Cada tipo de cambio tiene un valor asociado que representa la
     * tasa de conversión.
     */
    private enum TipoCambio {
        SELECCIONE_UNA_OPCION(0, "null", "null"),
        PESO_A_DOLAR(545, "pesos", "dolares"),
        PESO_A_EURO(593, "pesos", "euros"),
        PESO_A_LIBRA(711.16F, "pesos", "libras"),
        PESO_A_YEN(1.94F, "pesos", "yenes"),
        PESO_A_WON_COREANO(1.94F, "pesos", "wones"),
        DOLAR_A_PESO(545, "dolares", "pesos"),
        EURO_A_PESO(593, "euros", "pesos"),
        LIBRA_A_PESO(711.16F, "libras", "pesos"),
        YEN_A_PESO(1.94F, "yenes", "pesos"),
        WON_COREANO_A_PESO(1.94F, "wones", "pesos");

        private final float valor;
        private final String monedaEntrada;
        private final String monedaSalida;

        TipoCambio(float valor, String monedaEntrada, String monedaSalida) {
            this.valor = valor;
            this.monedaEntrada = monedaEntrada;
            this.monedaSalida = monedaSalida;
        }

        public float getValor() {
            return valor;
        }

        public String getMonedaEntrada() {
            return monedaEntrada;
        }

        public String getMonedaSalida() {
            return monedaSalida;
        }

    }

    private TipoCambio ventanaCambio;
    private float conversion;

    /**
     * Constructor de la clase ConvesorMonedas. Muestra un cuadro de diálogo
     * para que el usuario seleccione el tipo de cambio deseado. Si no se
     * selecciona ningún tipo de cambio, muestra un mensaje de error y vuelve a
     * solicitar la selección.
     */
    public ConvesorMonedas() {
        TipoCambio[] listaCambios = TipoCambio.values();
        ventanaCambio = (TipoCambio) JOptionPane.showInputDialog(
                null,
                "Seleccione el tipo de cambio",
                "monedas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                listaCambios,
                listaCambios[0]
        );

        while (ventanaCambio == TipoCambio.SELECCIONE_UNA_OPCION) {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar un tipo de cambio");

            ventanaCambio = (TipoCambio) JOptionPane.showInputDialog(
                    null,
                    "Seleccione el tipo de cambio",
                    "monedas",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    listaCambios,
                    listaCambios[0]
            );
        }

    }

    /**
     * Verifica si el tipo de cambio seleccionado es nulo o se presiono
     * cancelar.
     *
     * @return 1 si el tipo de cambio no es nulo, -1 si es nulo.
     */
    public int isNull() {
        if (ventanaCambio == null) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Realiza la conversión de la cantidad num según el tipo de cambio
     * seleccionado.
     *
     * @param num La cantidad a convertir.
     */
    public void seleccionarYConvertir(float num) {
        float valorDeCambio = ventanaCambio.getValor();
        switch (ventanaCambio) {
            case PESO_A_DOLAR:
            case PESO_A_EURO:
            case PESO_A_LIBRA:
            case PESO_A_YEN:
            case PESO_A_WON_COREANO:
                conversion = num / valorDeCambio;
                break;

            case DOLAR_A_PESO:
            case EURO_A_PESO:
            case LIBRA_A_PESO:
            case YEN_A_PESO:
            case WON_COREANO_A_PESO:
                conversion = num * valorDeCambio;
                break;
        }
    }

    /**
     * Obtiene el resultado de la conversión realizada.
     *
     * @return El valor de la conversión.
     */
    public float getConversion() {
        return conversion;
    }

    /**
     * Obtine la moneda base que se va a cambiar
     *
     * @return moneda base
     */
    public String getMonedaEntrada() {
        return ventanaCambio.getMonedaEntrada();
    }

    /**
     * Obtine la moneda a la que se va a convertir
     *
     * @return moneda final
     */
    public String getMonedaSalida() {
        return ventanaCambio.getMonedaSalida();
    }
}
