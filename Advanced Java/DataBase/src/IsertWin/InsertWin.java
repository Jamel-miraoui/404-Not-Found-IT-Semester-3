package IsertWin;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InsertWin extends JFrame implements ActionListener {
	
	JButton Cancel, Insert;
	JLabel prenomLabel, nomLabel, classeLabel, loginLabel, passwordLabel;
	JTextField prenom, nom, classe, login, password;

	public InsertWin() {
		prenomLabel = new JLabel("Prenom");
		nomLabel = new JLabel("Nom");
		classeLabel = new JLabel("Class");
		loginLabel = new JLabel("Login");
		passwordLabel = new JLabel("Password");

		prenom = new JTextField(10);
		nom = new JTextField(10);
		classe = new JTextField(10);
		login = new JTextField(10);
		password = new JTextField(10);

		Cancel = new JButton("Cancel");
		Cancel.addActionListener(this);
		Insert = new JButton("Insert");
		Insert.addActionListener(this);

		JPanel pano = new JPanel();
		pano.setLayout(new GridLayout(6, 2));
		pano.add(prenomLabel);
		pano.add(prenom);
		pano.add(nomLabel);
		pano.add(nom);
		pano.add(classeLabel);
		pano.add(classe);
		pano.add(loginLabel);
		pano.add(login);
		pano.add(passwordLabel);
		pano.add(password);
		pano.add(Insert);
		pano.add(Cancel);

		this.setContentPane(pano);
		this.setSize(600, 300);
		this.setTitle("test");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Insert) {
			String text = prenom.getText().toString();
			String text1 = nom.getText().toString();
			String text2 = classe.getText().toString();
			String text3 = login.getText().toString();
			String text4 = password.getText().toString();
			Etudiant etud = new Etudiant(text, text1, text2, text3, text4);
			JOptionPane.showMessageDialog(null, etud.toString());
			MySQLConnection b = new MySQLConnection();
		}

		if (e.getSource() == Cancel) {
			this.dispose();
			System.exit(0);
		}
	}

	public static void main(String args[]) {
		new InsertWin();
	}
}
