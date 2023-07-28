package Views;

import javax.swing.JOptionPane;

public class ConvesorMonedas {

    // Definir tipos de cambio como enum
    private enum TipoCambio {
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

    private TipoCambio tipoCambio;
    private float conversion;

    public ConvesorMonedas() {
        TipoCambio[] opcionesTipoCambio = TipoCambio.values();
        tipoCambio = (TipoCambio) JOptionPane.showInputDialog(
                null,
                "Tipo de Cambio: ",
                "Monedas",
                JOptionPane.QUESTION_MESSAGE,
                null, opcionesTipoCambio,
                opcionesTipoCambio[0]
        );

        if (tipoCambio == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de cambio válido.");
        }
    }

    // obtener la opción seleccionada por el usuario
    public void obtenerSeleccion(int num) {
        float valorCambio = tipoCambio.getValor();
        switch (tipoCambio) {
            case PESO_A_DOLAR:
                conversion = num / valorCambio;
                break;
            case PESO_A_EURO:
            case PESO_A_LIBRA:
            case PESO_A_YEN:
            case PESO_A_WON_COREANO:
                conversion = num * valorCambio;
                break;
            case DOLAR_A_PESO:
            case EURO_A_PESO:
            case LIBRA_A_PESO:
            case YEN_A_PESO:
            case WON_COREANO_A_PESO:
                conversion = num * valorCambio;
                break;
        }
    }

    public float getConversion() {
        return conversion;
    }
}

//package Views;
//
//import javax.swing.JOptionPane;
//
//public class ConvesorMonedas {
//
//    private Object[] opcionesTipoCambio;
//    private Object seleccionar;
//    private float conversion;
//
//    public ConvesorMonedas() {
//        opcionesTipoCambio = new Object[]{
//            "Seleccione una Opcion",
//            "Pesos a Dolar",
//            "Pesos a Euro",
//            "Pesos a Libras",
//            "Pesos a Yen",
//            "Pesos a Won Coreano",
//            "Dolar a Pesos",
//            "Euro a Pesos",
//            "Libras a Pesos",
//            "Yen a pesos",
//            "Won Coreano a Pesos"
//        };
//
//        seleccionar = JOptionPane.showInputDialog(
//                null,
//                "Tipo de Cambio: ",
//                "Monedas",
//                JOptionPane.QUESTION_MESSAGE,
//                null, opcionesTipoCambio,
//                opcionesTipoCambio[0]
//        );
//    }
//
//    // obtener la opcion seleccionada por el usuario
//    public void obtenerSeleccion(int i) {
//
//        if (seleccionar.equals(opcionesTipoCambio[1])) {
//            pesoDolar(i);
//        } else if (seleccionar.equals(opcionesTipoCambio[2])) {
//            pesoEuro(i);
//        } else if (seleccionar.equals(opcionesTipoCambio[3])) {
//            pesoLibra(i);
//        } else if (seleccionar.equals(opcionesTipoCambio[4])) {
//            pesoYen(i);
//        } else if (seleccionar.equals(opcionesTipoCambio[5])) {
//            pesoWon(i);
//        } else if (seleccionar.equals(opcionesTipoCambio[6])) {
//            dolarPeso(i);
//        } else if (seleccionar.equals(opcionesTipoCambio[7])) {
//            euroPeso(i);
//        } else if (seleccionar.equals(opcionesTipoCambio[8])) {
//            libraPeso(i);
//        } else if (seleccionar.equals(opcionesTipoCambio[9])) {
//            yenPeso(i);
//        } else if (seleccionar.equals(opcionesTipoCambio[10])) {
//            wonPeso(i);
//        }
//    }
//
//    public float getConversion() {
//        return conversion;
//    }
//
//    private void pesoDolar(int num) {
//        int valorDolar = 545;
//        conversion = num / valorDolar;
//    }
//
//    private void dolarPeso(int num) {
//        int valorDolar = 545;
//        conversion = num * valorDolar;
//    }
//
//    private void pesoEuro(int num) {
//        int valorEuro = 593;
//        conversion = num / valorEuro;
//    }
//
//    private void euroPeso(int num) {
//        int valorEuro = 593;
//        conversion = num / valorEuro;
//    }
//
//    private void pesoLibra(int num) {
//        float valorLibra = 711.16F;
//        conversion = num * valorLibra;
//    }
//
//    private void libraPeso(int num) {
//        float valorLibra = 711.16F;
//        conversion = num * valorLibra;
//    }
//
//    private void pesoYen(int num) {
//        float valorYen = 1.94F;
//        conversion = num / valorYen;
//    }
//
//    private void yenPeso(int num) {
//        float valorYen = 1.94F;
//        conversion = num * valorYen;
//    }
//
//    private void pesoWon(float num) {
//        float valorWon = 1.94F;
//        conversion = num / valorWon;
//    }
//
//    private void wonPeso(float num) {
//        float valorWon = 1.94F;
//        conversion = num * valorWon;
//    }
//}
