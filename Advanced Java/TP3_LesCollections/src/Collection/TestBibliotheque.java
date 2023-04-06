package Collection;
import javax.swing.JOptionPane;


public class TestBibliotheque {
	public static void main(String[] args) {    
		
		String answer;
		int answer0; 
		Bibliotheque b = new Bibliotheque("Info Book");
		b.ajouterLivre(new Livre(1,50,"G. Gardarin","Bases de données"));
		b.ajouterLivre(new Livre(2,60,"C. Date","Introduction aux bases de données"));
		b.ajouterLivre(new Livre(3,45,"G. Roy","Conception des bases de données avec UML"));
		b.ajouterLivre(new Livre(4,35,"C. Soutou","UML2 pour les bases de données"));
		b.ajouterLivre(new Livre(5,30,"C. Soutou","De UML à SQL : Conception de bases de données"));
		b.rechercheLivre(4);
		b.rechercheLivre(6);
		b.supprimerLivre(3);
		b.modifierPrix(2, 50);
		do {
		try {
			answer = JOptionPane.showInputDialog("Menu General \n 1.ajouter un livre \n 2.rechercher un livre \n 3.supprimer un livre \n 4.modifier le prix d'un livre \n 5.Consulter la liste de livres \n 6.quitter \n \n \n \n Enter votre choix (1..6)");
			answer0 = Integer.parseInt(answer);
			}
			catch(Exception e) {
				answer = JOptionPane.showInputDialog("Pls enter a number \n \n Menu General \n 1.ajouter un livre \n 2.rechercher un livre \n 3.supprimer un livre \n 4.modifier le prix d'un livre \n 5.Consulter la liste de livres \n 6.quitter \n \n \n \n Enter votre choix (1..6)");
				answer0 = Integer.parseInt(answer);
			}
		
		
		switch (answer0) {
		case 1 : 
			int answer11 = Integer.parseInt(JOptionPane.showInputDialog("donner le num"));
			String answer12 = JOptionPane.showInputDialog("donner l'auteur ");
			String answer13 = JOptionPane.showInputDialog("donner le titre");
			double answer14 = Double.parseDouble(JOptionPane.showInputDialog("donner le prix"));
			b.ajouterLivre(new Livre(answer11,answer14,answer12,answer13));
		    break;
		    
		case 2 : 
			int answer2 = Integer.parseInt(JOptionPane.showInputDialog("Recherche un livre"));
			JOptionPane.showMessageDialog(null, b.rechercheLivre(answer2));     
		    break;
		    
		case 3 : 
			int answer3 = Integer.parseInt(JOptionPane.showInputDialog("supprimer un livre"));
			JOptionPane.showMessageDialog(null, b.supprimerLivre(answer3));
		    break;
		    
		case 4 : 
			int answer4 = Integer.parseInt(JOptionPane.showInputDialog("donner le num de livre"));
			double answer41 = Double.parseDouble(JOptionPane.showInputDialog("donner le nouveaux prix"));
			b.modifierPrix(answer4,answer41);
		    break;
		    
		case 5 : 
			JOptionPane.showMessageDialog(null, b.toString());
		    break;
		    } 		
	} while (answer0 != 6);
}
}