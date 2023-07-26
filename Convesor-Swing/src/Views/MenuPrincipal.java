package Views;

import javax.swing.DefaultComboBoxModel;
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
        // crear ventana
        setLayout(null);
        setTitle("Menu");
        setBounds(100, 100, 350, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Seleccione una opcion de conversión");
        label1.setBounds(20, 20, 300, 30);
        add(this.label1);

        combo1 = new JComboBox<String>();
        combo1.setBounds(20, 50, 300, 30);
        add(this.combo1);
        combo1.setModel(new DefaultComboBoxModel<>(new String[]{
            "Convestor de Monedas",
            "Convesor de Temperatura",
            "Convesor de Medidas"
        }));
    }

}
