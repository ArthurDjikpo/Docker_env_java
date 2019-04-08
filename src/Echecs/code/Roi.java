public class Roi extends Piece{
	public Roi(String couleur, int ligne, int colonne){
		super("Roi", couleur, ligne, colonne);
	}
	
	public boolean deplacementCorrect(int arriveeL, int arriveeC){
		
			// Deplacement vers le haut
		if (arriveeL == (this.ligne +1)) {
			if (arriveeC == this.colonne)
				return true;
			if (arriveeC == (this.colonne + 2)) //haut-droite
				return true;
			if (arriveeC == (this.colonne + 1)) //haut-gauche
				return true;
		}
		// Deplacement vers le bas
		if (arriveeL == (this.ligne - 1)) {
			if (arriveeC == this.colonne)
				return true;
			if (arriveeC == (this.colonne + 2)) //bas-droite
				return true;
			if (arriveeC == (this.colonne +1 )) //bas-gauche
				return true;
		}
		// Deplacement vers la droite
		if (this.ligne == arriveeL && arriveeC == (this.colonne + 2))
			return true;
		// Deplacement vers la gauche
		if (this.ligne == arriveeL && arriveeC == (this.colonne ))
			return true;

			
		
		return false;
	}
}
