package Views;

import javax.swing.JOptionPane;

public class ValorConversion {

    public ValorConversion(float conversion) {
        JOptionPane.showMessageDialog(
                null,
                conversion, "conversion",
                JOptionPane.INFORMATION_MESSAGE,
                null);
    }

}
