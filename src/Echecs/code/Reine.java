public class Reine extends Piece{
	public Reine(String couleur, int ligne, int colonne){
		super("Reine", couleur, ligne, colonne);
	}
	
	public boolean deplacementCorrect(int arriveeL, int arriveeC){
		if (this.couleur == "Noir"){
			 if (arriveeL - this.ligne == 1 && (this.colonne == arriveeC) ) {
				return true;
			}
		}
		else{
			 if (this.ligne - arriveeL == 1 && (this.colonne == arriveeC) ) {
				return true;
			}
		}
		return false;
	}
}
