package Ex2;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Capitales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer ; 
        HashMap<String, String> collPays = new HashMap<>();
        do {
			try {
				answer = Integer.parseInt(JOptionPane.showInputDialog("Menu General \n 1.Ajouter un entréé \n 2.Rechercher une capitale \n 3.Supprimer une entrée \n 4.Vide la liste \n 5.Consulter la liste \n 6.Quitter \n \n Enter votre choix (1..6)"));
				}
				catch(Exception e) {
					answer = Integer.parseInt(JOptionPane.showInputDialog("Pls enter a number \n \n Menu General \n 1.Ajouter un entréé \n 2.Rechercher une capitale \n 3.Supprimer une entrée \n 4.Vide la liste \n 5.Consulter la liste \n 6.Quitter \n \n Enter votre choix (1..6)"));
				}
			switch (answer) {
			case 1:
				String answer1 = JOptionPane.showInputDialog("Ajouter un pays");
				if (collPays.containsKey(answer1)) {JOptionPane.showMessageDialog(null,"pays déjà existant");}
				else {
					String answer12 = JOptionPane.showInputDialog("Ajouter le capitale");
					collPays.put(answer1,answer12); 
					JOptionPane.showMessageDialog(null,"l’opération est bien déroulée");
					}
				break;
				
			case 2:
				String answer2 = JOptionPane.showInputDialog("Recherche une capitale");
				if (collPays.containsKey(answer2)) {JOptionPane.showMessageDialog(null,collPays.get(answer2));}
				else {JOptionPane.showMessageDialog(null,"Error pays inexistant");}
				break;
				
			case 3:
				String answer3 = JOptionPane.showInputDialog("Supprimer une entrée");
				if (collPays.containsKey(answer3)) {
                    collPays.remove(answer3);
                    JOptionPane.showMessageDialog(null,"l’opération est bien déroulée");
                    }
				else {JOptionPane.showMessageDialog(null,"Error pays inexistant");}
				break;
				
			case 4: 
				collPays.clear();
				JOptionPane.showMessageDialog(null,"l’opération est bien déroulée");
				break;
				
			case 5: 
				if (collPays.isEmpty()) {JOptionPane.showMessageDialog(null,"collPays est vide");}
				else {for (String answer5 : collPays.keySet()) {
					JOptionPane.showMessageDialog(null,answer5 + " ( " + collPays.get(answer5)+") \n");
                }}
				break;
			}
			
		} while (answer != 6);
	}

}
