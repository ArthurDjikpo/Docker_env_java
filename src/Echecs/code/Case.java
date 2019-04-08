public class Case{
	private Piece piece;
	
	public Case(){
		this.piece = null;
	}
	
	public void ajouterPiece(Piece p){
		if (p != null)
			this.piece = p;
	}
	
	// Cette methode permettra de la capture des pieces 
	public void supprimerPiece(){
		if (this.piece != null)
			this.piece = null;
	}
	
	// ACCESSEUR
	public Piece getPiece(){		return this.piece;		}
}
