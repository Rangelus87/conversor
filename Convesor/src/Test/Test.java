package Test;

import Views.MenuPrincipal;
import javax.swing.JFrame;

public class Test extends JFrame {

    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
//        Test test = new Test();
        menuPrincipal.setTitle("Menu");
        menuPrincipal.setBounds(100, 100, 350, 120);
        menuPrincipal.setVisible(true);
        menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
