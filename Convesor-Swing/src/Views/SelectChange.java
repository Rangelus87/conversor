package Views;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelectChange extends JFrame {

    protected JLabel text1;
    protected JComboBox<String> comboCambio;
    protected JButton btnOk, btnCancelar;

    public SelectChange() {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Seleccion de tipo de cambio");
        setBounds(100, 100, 350, 160);

        text1 = new JLabel("Elija el tipo de cambio");
        text1.setBounds(20, 20, 300, 30);
        add(text1);

        comboCambio = new JComboBox<String>();
        comboCambio.setBounds(20, 50, 300, 30);
        add(comboCambio);
        comboCambio.setModel(new DefaultComboBoxModel<>(new String[]{
            "Pesos a Dolar",
            "Pesos a Euro",
            "Pesos a Libras",
            "Pesos a Yen",
            "Pesos a Won Coreano",
            "Dolar a Pesos",
            "Euro a Pesos",
            "Libras a Pesos",
            "Yen a pesos",
            "Won Coreano a Pesos"
        }));

        btnOk = new JButton("Ok");
        btnOk.setBounds(60, 90, 100, 30);
        add(btnOk);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(180, 90, 100, 30);
        add(btnCancelar);

    }

}
