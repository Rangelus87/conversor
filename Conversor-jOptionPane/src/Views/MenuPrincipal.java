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

    private OpcionesMenu opcionesMenu;

    //constructor del menu
    public MenuPrincipal() {
        OpcionesMenu[] opciones = OpcionesMenu.values();
        opcionesMenu = (OpcionesMenu) JOptionPane.showInputDialog(
                null,
                "Seleccione una Opcion",
                "Menu", JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (opcionesMenu == OpcionesMenu.SELECCIONE_UNA_OPCION) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion");
        }
    }

    // obtener la opción seleccionada por el usuario
    public int obtenerSeleccion() {

        switch (opcionesMenu) {
            case CONVERSOR_DE_MONEDAS:
                return 1;
            case CONVERSOR_DE_MEDIDAS:
                return 2;
            case CONVERSOR_DE_TEMPERATURA:
                return 3;
            default:
                return 0;
        }
    }
