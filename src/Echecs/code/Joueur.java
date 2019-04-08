public class Joueur{
	private String nom;
	private String couleur;
	
	public Joueur(String n, String c){
		this.nom = n;
		this.couleur = c;
	}

	// ACCESSEURS
	public String getNom(){			return this.nom;		}
	public String getCouleur(){		return this.couleur;	}
}
