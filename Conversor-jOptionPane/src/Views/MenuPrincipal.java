package Views;

import javax.swing.JOptionPane;

public class MenuPrincipal {

    //definicion de la clase enum para las opciones del menu
    private enum OpcionesMenu {
        SELECCIONE_UNA_OPCION,
        CONVERSOR_DE_MONEDAS,
        CONVERSOR_DE_MEDIDAS,
        CONVERSOR_DE_TEMPERATURA

    }

    private OpcionesMenu seleccionMenu;

    //constructor del menu
    public MenuPrincipal() {
        OpcionesMenu[] opciones = OpcionesMenu.values();
        seleccionMenu = (OpcionesMenu) JOptionPane.showInputDialog(
                null,
                "Seleccione una Opcion",
                "Menu", JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        while (seleccionMenu == OpcionesMenu.SELECCIONE_UNA_OPCION) {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar una opcion");

            seleccionMenu = (OpcionesMenu) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una Opcion",
                    "Menu", JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);
        }
    }

    // obtener la opción seleccionada por el usuario
    public int obtenerSeleccion() {

        return switch (seleccionMenu) {
            case CONVERSOR_DE_MONEDAS ->
                1;
            case CONVERSOR_DE_MEDIDAS ->
                2;
            case CONVERSOR_DE_TEMPERATURA ->
                3;
            default ->
                0;
        };
    }
}
