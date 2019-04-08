public class Fou extends Piece{
	public Fou(String couleur, int ligne, int colonne){
		super("Fou", couleur, ligne, colonne);
	}
	
	public boolean deplacementCorrect(int arriveeL, int arriveeC){
		return true;
	}
}