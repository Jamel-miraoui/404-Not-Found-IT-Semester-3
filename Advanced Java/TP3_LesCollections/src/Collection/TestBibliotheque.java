package Collection;
import javax.swing.*;


public class TestBibliotheque {

	public static void main(String[] args) {
		JTextField t1; 
	    JFrame f= new JFrame("Exercice 1");  
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
		System.out.println(b.toString());
		t1=new JTextField("Welcome to Javatpoint."); 
		 t1.setBounds(50,100, 200,30);  
		f.add(t1);
		f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	}
	
}
