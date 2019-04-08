public class Tour extends Piece{
	public Tour(String couleur, int ligne, int colonne){
		super("Tour", couleur, ligne, colonne);
	}
	
	public boolean deplacementCorrect(int arriveeL, int arriveeC){
		return true;
	}
}