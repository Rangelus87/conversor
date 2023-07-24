package Views;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author rangelus
 */
public class MenuPrincipal extends JFrame {

    protected JLabel label1;
    protected JComboBox<String> combo1;
    protected JButton btnOk, btnCancelar;

    public MenuPrincipal() {
        setLayout(null);
        this.label1 = new JLabel("Seleccione una opcion de conversión");
        this.label1.setBounds(20, 20, 300, 30);
        add(this.label1);

        // crear Combo
        this.combo1 = new JComboBox<String>();
        this.combo1.setBounds(20, 50, 300, 30);
        add(this.combo1);
        this.combo1.addItem("Convestor de Monedas");
        this.combo1.addItem("Convesor de Temperatura");
        this.combo1.addItem("Convesor de Medidas");
    }

}
