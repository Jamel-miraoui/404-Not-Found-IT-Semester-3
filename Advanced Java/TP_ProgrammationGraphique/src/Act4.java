import javax.swing.JFrame;
import javax.swing.JLabel;

public class Act4 extends JFrame {

    public Act4() {
        // initialisation de la fenêtre
        setTitle("Mon programme Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initialisation du label
        JLabel label = new JLabel("Hello, world!");
        add(label);
    }

    public static void main(String[] args) {
        Act4 ssp = new Act4();
        ssp.setVisible(true);
    }
}