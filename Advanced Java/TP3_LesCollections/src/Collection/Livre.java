package Collection;

public class Livre {
	private int numLivre;
	private double prix;
	private String auteur,titre;

	Livre (numLivre,titre,auteur,prix){
		this.numLivre=numLivre;
		this.titre=titre;
		this.auteur=auteur;
		this.prix=prix;
	}
	
	int getNumLivre( ) {
		return this.numLivre;
	}
	
	double getPrix() {
		return this.prix;
	}
	
	void setPrix(double prix) {
		this.prix = prix ; 
	}
	
	public String toString(){
		return "numLivre="+this.numLivre+"titre="+this.titre+"auteur="+this.auteur+"prix="+this.prix;
	}
	
}
