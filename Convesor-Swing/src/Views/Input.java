package Views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Input extends JFrame {

    protected JLabel label1;
    protected JTextField text1;
    protected JButton btnOk, btnCancelar;

    public Input() {
        setLayout(null);
        setTitle("Ingrese cantidad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 160);

        label1 = new JLabel("Ingrese la cantidad de dinero a convertir:");
        label1.setBounds(20, 20, 300, 30);
        add(label1);

        text1 = new JTextField();
        text1.setBounds(20, 50, 300, 30);
        add(text1);

        btnOk = new JButton("Ok");
        btnOk.setBounds(60, 90, 100, 30);
        add(btnOk);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(180, 90, 100, 30);
        add(btnCancelar);
    }
}
