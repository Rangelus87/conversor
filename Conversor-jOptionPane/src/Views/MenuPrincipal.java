package Views;

import javax.swing.JOptionPane;

/**
 * La clase MenuPrincipal representa el menú principal de la aplicación. Permite
 * al usuario seleccionar entre diferentes opciones, como el conversor de
 * monedas, el conversor de medidas y el conversor de temperatura.
 *
 * @author rangelus
 */
public class MenuPrincipal {

    /**
     * Enum OpcionesMenu define las opciones disponibles en el menú principal.
     */
    private enum OpcionesMenu {
        SELECCIONE_UNA_OPCION,
        CONVERSOR_DE_MONEDAS,
        CONVERSOR_DE_MEDIDAS,
        CONVERSOR_DE_TEMPERATURA

    }

    private OpcionesMenu seleccionMenu;

    /**
     * Constructor de la clase MenuPrincipal. Muestra un cuadro de diálogo para
     * que el usuario seleccione una opción del menú. Si no se selecciona
     * ninguna opción, muestra un mensaje de error y vuelve a solicitar la
     * selección.
     */
    public MenuPrincipal() {
        OpcionesMenu[] opciones = OpcionesMenu.values();
        seleccionMenu = (OpcionesMenu) JOptionPane.showInputDialog(
                null,
                "Seleccione una Opcion",
                "Menu", JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        while (seleccionMenu == OpcionesMenu.SELECCIONE_UNA_OPCION || seleccionMenu != null) {
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

    /**
     * Obtiene la opción seleccionada por el usuario.
     *
     * @return 1 si se selecciona CONVERSOR_DE_MONEDAS, 2 si se selecciona
     * CONVERSOR_DE_MEDIDAS, 3 si se selecciona CONVERSOR_DE_TEMPERATURA, 0 si
     * no se selecciona ninguna opción.
     */
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
