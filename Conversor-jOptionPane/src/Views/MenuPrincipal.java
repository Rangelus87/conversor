package Views;

import javax.swing.JOptionPane;

public class MenuPrincipal {

    private Object[] opcionesMenuPrincipal;
    private Object seleccionar;

    public MenuPrincipal() {
        opcionesMenuPrincipal = new Object[]{
            "Seleccione una Opcion",
            "Convestor de Monedas",
            "Convesor de Temperatura",
            "Convesor de Medidas"
        };
        seleccionar = JOptionPane.showInputDialog(
                null,
                "Selecciones la opcion deseada: ",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, opcionesMenuPrincipal,
                opcionesMenuPrincipal[0]
        );
    }

    // comprobamos la seleccion y llamamos al imput para la entrada de valores
    public int comprobarSeleccion() {

        if (seleccionar.equals(opcionesMenuPrincipal[0])) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.comprobarSeleccion();
        } else {
            if (seleccionar.equals(opcionesMenuPrincipal[1])) {
                return 1;
            } else if (seleccionar.equals(opcionesMenuPrincipal[2])) {
                return 2;
            } else if (seleccionar.equals(opcionesMenuPrincipal[3])) {
                return 3;
            }
        }
        return 0;
    }
}
