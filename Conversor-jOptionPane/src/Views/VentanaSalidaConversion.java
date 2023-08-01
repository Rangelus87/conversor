package Views;

import javax.swing.JOptionPane;

public class VentanaSalidaConversion {

    public VentanaSalidaConversion(float conversion) {
        JOptionPane.showMessageDialog(
                null,
                conversion,
                "conversion",
                JOptionPane.INFORMATION_MESSAGE,
                null);
    }

}
