package Views;

import javax.swing.JOptionPane;

public class MenuPrincipal {

    protected Object[] opcionesMenuPrincipal;
    protected Object seleccionar;

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

    public void comprobarSeleccion() {
        if (seleccionar.equals(opcionesMenuPrincipal[1])) {
            TipoDeCambio tipoDeCambio = new TipoDeCambio();
        } else if (seleccionar.equals(opcionesMenuPrincipal[2])) {
            ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
        } else if (seleccionar.equals(opcionesMenuPrincipal[3])) {
            ConversorMedidas conversorMedidas = new ConversorMedidas();
        }
    }
}
