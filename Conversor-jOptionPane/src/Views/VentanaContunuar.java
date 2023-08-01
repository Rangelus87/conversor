package Views;

import javax.swing.JOptionPane;

/**
 * La clase ventana continual es la que valida la salida del programa
 *
 * @author rangelus
 */
public class VentanaContunuar {

    private static int salir;

    /**
     * contructor con la ventana de dialogo de salir si o no
     */
    public VentanaContunuar() {
        salir = JOptionPane.showConfirmDialog(
                null,
                "Desea realizar otra conversion?",
                "Desea salir?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

    }

    /**
     * validamos la respuesta del usuario
     *
     * @return true false segun la seleccion del usuario
     */
    public boolean validarSalir() {
        return salir == 0 ? false : true;
    }
}
