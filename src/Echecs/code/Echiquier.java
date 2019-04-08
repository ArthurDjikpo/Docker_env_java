public class Echiquier{
	private Case[][] grille;
	
	public Echiquier(){
		this.grille = new Case[8][8];
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				this.grille[i][j] = new Case();
			}
		}
	}

	public void initialiserGrille(){
		for (int j = 0; j < 8; j++){
			this.grille[1][j].ajouterPiece(new Pion("Noir", 1, j)); 
			this.grille[6][j].ajouterPiece(new Pion("Blanc", 6, j));
		}
		this.grille[0][0].ajouterPiece(new Tour("Noir", 0, 0));
		this.grille[0][7].ajouterPiece(new Tour("Noir", 0, 7));
		this.grille[7][0].ajouterPiece(new Tour("Blanc", 7, 0));
		this.grille[7][7].ajouterPiece(new Tour("Blanc", 7, 7));
		this.grille[0][1].ajouterPiece(new Cavalier("Noir", 0, 1));
		this.grille[0][6].ajouterPiece(new Cavalier("Noir", 0, 6));
		this.grille[7][1].ajouterPiece(new Cavalier("Blanc", 7, 1));
		this.grille[7][6].ajouterPiece(new Cavalier("Blanc", 7, 6));
		this.grille[0][2].ajouterPiece(new Fou("Noir", 0, 2));
		this.grille[0][5].ajouterPiece(new Fou("Noir", 0, 5));
		this.grille[7][2].ajouterPiece(new Fou("Blanc", 7, 2));
		this.grille[7][5].ajouterPiece(new Fou("Blanc", 7, 5));
		this.grille[0][3].ajouterPiece(new Reine("Noir", 0, 4));
		this.grille[7][3].ajouterPiece(new Reine("Blanc", 7, 4));
		this.grille[0][4].ajouterPiece(new Roi("Noir", 0, 3));
		this.grille[7][4].ajouterPiece(new Roi("Blanc", 7, 3));
	}
	
	public boolean deplacementPossible (int departL, int departC, int arriveeL, int arriveeC){
		if (this.grille[departL][departC].getPiece().deplacementCorrect(arriveeL, arriveeC)) return true;
		return false;
	}
	
	public Case[][] getGrille(){	return this.grille;	}
	
}
