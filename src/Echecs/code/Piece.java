public abstract class Piece{
	protected int ligne;
	protected int colonne;
	protected String nom;
	protected String couleur;
	protected int nbDeplacement;
	
	public Piece(String n, String c, int ligne, int colonne){
		if ((n == "Tour" || n == "Roi" || n == "Reine" 
		  || n == "Cavalier" || n == "Pion" || n == "Fou")
		  &&(c == "Blanc" || c == "Noir")				 ){
			this.nom = n;
			this.couleur = c;
			this.nbDeplacement = 0;
			this.ligne = ligne;
			this.colonne = colonne;
		}
	}
	
	public void ajouterDeplacement(){
		this.nbDeplacement++;
	}
	
	public void modifierCoordonnees(int ligne, int colonne){
		this.ligne = ligne;
		this.colonne = colonne;
	}
	//public abstract int deplacementLigne( int ligne);

		
	public abstract boolean deplacementCorrect(int ligne, int colonne);
	
	// ACCESSEURS
	public int getNbDeplacement(){	return this.nbDeplacement;	}
	public String getNom(){			return this.nom;		}
	public String getCouleur(){		return this.couleur;	}
}

