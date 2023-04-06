package Collection;

import java.util.ArrayList;

public class Bibliotheque  {
	private String nomBib; 
	private ArrayList<Livre> table; 
	
	public Bibliotheque(String nomBib) {
		this.nomBib = nomBib;
        this.table = new ArrayList<>();}
	
	public void ajouterLivre(Livre livre) {
		table.add(livre);
	}
	
	public String rechercheLivre(int numLivre) {
		for (Livre livre : table) {
            if (livre.getNumLivre() == numLivre) {
                return table.toString();
            }
        }
        return "Livre inexistant";
	}
	
	public String supprimerLivre(int numLivre) {
		for (Livre livre : table) {
            if (livre.getNumLivre() == numLivre) {
                table.remove(livre);
                return "Livre supprimé avec succès";
            }
        }
        return "Échec de la suppression : livre inexistant";
	}
	
	public String modifierPrix(int numLivre,double prix) {
		for(Livre livre : table  ) {
			if (livre.getNumLivre()== numLivre) {livre.setPrix(prix);
			return "succès";}
			}
		return "èchec";
		}
	
	public String toString() {
		String livres = "";
        for (Livre livre : table) {
            livres += livre.toString() + "\n";
        }
        return "Bibliothèque " + nomBib + " (" + table.size() + " livres disponibles)\n"
                + livres;
	}
}