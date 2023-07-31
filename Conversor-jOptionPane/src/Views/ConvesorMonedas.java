package Views;

import javax.swing.JOptionPane;

public class ConvesorMonedas {

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

        if (ventanaCambio == TipoCambio.SELECCIONE_UNA_OPCION) {
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

    public int isNull() {
        if (ventanaCambio == null) {
            return -1;
        } else {
            return 1;
        }
    }

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

    public float getConversion() {
        return conversion;
    }
}
