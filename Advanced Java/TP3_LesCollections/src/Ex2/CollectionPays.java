package Ex2;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CollectionPays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub*
		int answer; 
		ArrayList<String> collPays = new ArrayList<String>();
		collPays.add("Tunisia");
		collPays.add("France");
		collPays.add("Algeria");
		do {
			try {
				answer = Integer.parseInt(JOptionPane.showInputDialog("Menu General \n 1.Ajouter un pays \n 2.Supprimer un pays \n 3.Vider la liste \n 4.Trier la liste \n 5.Consulter la liste \n 6.Quitter \n \n Enter votre choix (1..6)"));
				}
				catch(Exception e) {
					answer = Integer.parseInt(JOptionPane.showInputDialog("Pls enter a number \n \n Menu General \n 1.Ajouter un pays \n 2.Supprimer un pays \n 3.Vider la liste \n 4.Trier la liste \n 5.Consulter la liste \n 6.Quitter \n \n Enter votre choix (1..6)"));
				}
			switch (answer) {
			case 1:
				String answer1 = JOptionPane.showInputDialog("Ajouter un pays");
				if (collPays.contains(answer1)) {JOptionPane.showMessageDialog(null,"pays déjà existant");}
				else {collPays.add(answer1); JOptionPane.showMessageDialog(null,"l’opération est bien déroulée");}
			case 2:
				String answer2 = JOptionPane.showInputDialog("Supprimer un pays");
				if (collPays.remove(answer2)) {;JOptionPane.showMessageDialog(null,"l’opération est bien déroulée");}
				else {JOptionPane.showMessageDialog(null,"Error pays inexistant,");}
			}
		} while (answer != 6);
	}
}
