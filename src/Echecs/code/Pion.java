public class Pion extends Piece{
	public Pion(String couleur, int ligne, int colonne){
		super("Pion", couleur, ligne, colonne);
	}
	
	public boolean deplacementCorrect(int arriveeL, int arriveeC){
		if (this.couleur == "Noir"){
			if (this.nbDeplacement == 0 && (arriveeL - this.ligne == 1 || arriveeL - this.ligne == 2) && (this.colonne == arriveeC) ){
				return true;
			}
			else if (arriveeL - this.ligne == 1 && (this.colonne == arriveeC) ) {
				return true;
			}
		}
		else{
			if (this.nbDeplacement == 0 && (this.ligne - arriveeL == 1 || this.ligne - arriveeL == 2) && (this.colonne == arriveeC) ){
				return true;
			}
			else if (this.ligne - arriveeL == 1 && (this.colonne == arriveeC) ) {
				return true;
			}
		}
		return false;
	}
}