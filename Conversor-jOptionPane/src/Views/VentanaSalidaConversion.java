package Views;

import javax.swing.JOptionPane;

/**
 * La clase ventana de salida es la encargada de mostrar los resultados de las
 * conversiones de los diferentes convertidores
 *
 * @author rangelus
 */
public class VentanaSalidaConversion {

    /**
     * Ventada donde se informa los resultados de la conversion
     *
     * @param valorEntrada
     * @param unidad de medida de entrada
     * @param valorConvertido
     * @param unidad de medida de salida
     */
    public VentanaSalidaConversion(float valorEntrada, String inicio, float valorConvertido, String sFinal) {

        String mensaje = String.format("%.1f %s son: %.1f %s", valorEntrada, inicio, valorConvertido, sFinal);

        JOptionPane.showMessageDialog(
                null,
                mensaje,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE,
                null);
    }

}
