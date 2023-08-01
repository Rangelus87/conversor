package Views;

import javax.swing.JOptionPane;

/**
 * La clase ConvesorMonedas representa un convertidor de monedas que permite
 * realizar conversiones entre diferentes tipos de monedas, de Peso a Dólar,
 * Euro, Libra, Yen o Won Coreano y a la inversa. La conversión se realiza
 * mediante una selección del tipo de cambio y una cantidad a convertir.
 */
public class ConvesorMonedas {

    /**
     * Enum TipoCambio define los tipos de cambio disponibles para la
     * conversión. Cada tipo de cambio tiene un valor asociado que representa la
     * tasa de conversión.
     */
    private enum TipoCambio {
        SELECCIONE_UNA_OPCION(0),
        PESO_A_DOLAR(545),
        PESO_A_EURO(593),
        PESO_A_LIBRA(711.16F),
        PESO_A_YEN(1.94F),
        PESO_A_WON_COREANO(1.94F),
        DOLAR_A_PESO(545),
        EURO_A_PESO(593),
        LIBRA_A_PESO(711.16F),
        YEN_A_PESO(1.94F),
        WON_COREANO_A_PESO(1.94F);

        private final float valor;

        TipoCambio(float valor) {
            this.valor = valor;
        }

        public float getValor() {
            return valor;
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
}
