package Collection;
import javax.swing.JOptionPane;



public class TestBibliotheque {
	public static void main(String[] args) {     
		int answer;
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
		try {
			answer = Integer.parseInt(JOptionPane.showInputDialog("Menu General \n 1.ajouter un livre \n 2.rechercher un livre \n 3.supprimer un livre \n 4.modifier le prix d'un livre \n 5.Consulter la liste de livres \n 6.quitter \n \n \n \n Enter votre choix (1..6)"));
			}
			catch(Exception e) {
				answer = Integer.parseInt(JOptionPane.showInputDialog("Pls enter a number \n \n Menu General \n 1.ajouter un livre \n 2.rechercher un livre \n 3.supprimer un livre \n 4.modifier le prix d'un livre \n 5.Consulter la liste de livres \n 6.quitter \n \n \n \n Enter votre choix (1..6)"));
			}
		
		switch (answer) {
		case 1 : 
			int answer1 = Integer.parseInt(JOptionPane.showInputDialog(""));
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
			int answer4 = Integer.parseInt(JOptionPane.showInputDialog("supprimer un livre"));
			JOptionPane.showMessageDialog(null, b.supprimerLivre(answer4));
		    break;
		    
		case 5 : 
			JOptionPane.showMessageDialog(null, b.toString());
		    break;
		    
		case 6 : 
			
		    break;
		    
		}
		}
}