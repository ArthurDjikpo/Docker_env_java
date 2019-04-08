public class Jouer{
	private Joueur joueurUn;
	private Joueur joueurDeux;
	private Echiquier e;
	private int nbTour;
	
	
	public Jouer(String pseudoUn, String pseudoDeux){
		this.joueurUn = new Joueur(pseudoUn, "Blanc");
		this.joueurDeux = new Joueur(pseudoDeux, "Noir");
		this.e = new Echiquier();
		this.e.initialiserGrille();
		this.affichage();
	}
	
	public boolean deplacerPiece(int departL, int departC, int arriveeL, int arriveeC){
		if (e.deplacementPossible(departL, departC, arriveeL, arriveeC) == true) {
			if (e.getGrille()[arriveeL][arriveeC].getPiece() != null){
				System.out.println("Piece capturee !");
				e.getGrille()[arriveeL][arriveeC].supprimerPiece();
			}
			this.e.getGrille()[departL][departC].getPiece().ajouterDeplacement();
			this.e.getGrille()[arriveeL][arriveeC].ajouterPiece(this.e.getGrille()[departL][departC].getPiece());
			this.e.getGrille()[arriveeL][arriveeC].getPiece().modifierCoordonnees(arriveeL, arriveeC);
			this.e.getGrille()[departL][departC].supprimerPiece();
			this.affichage();
			nbTour++;
			return true;
		}
		else{
			System.out.println("Deplacement impossible...");
			return false;
		}
	}
	
	public void affichagePredictif(int departL, int departC){
		System.out.println("+-------------------------------------------------------+");
		System.out.println("|                      JEU D'ECHECS                     |");
		System.out.println("+-------------------------------------------------------+\n");
		
		for(int i = 0; i < 8; i++){
			System.out.println("+---+   +-----+-----+-----+-----+-----+-----+-----+-----+");
			System.out.print("|   |   ");
			for (int j = 0; j < 8; j++){
				if(e.deplacementPossible(departL, departC, i, j) == true)
					System.out.print("|*****");
				else System.out.print("|     ");
			}
			System.out.println("|");
			System.out.print("| " + (8-i) + " |   ");
			for(int j = 0; j < 8; j++){
				if (this.e.getGrille()[i][j].getPiece() == null) System.out.print("|     ");
				else{
					if (this.e.getGrille()[i][j].getPiece().getCouleur() == "Noir"){
						switch ( this.e.getGrille()[i][j].getPiece().getNom() ){
							case "Pion" : System.out.print("| P N "); break;
							case "Fou" : System.out.print("| F N "); break;
							case "Cavalier" : System.out.print("| C N "); break;
							case "Roi" : System.out.print("| K N "); break;
							case "Reine" : System.out.print("| Q N "); break;
							case "Tour" : System.out.print("| T N "); break;
							default : System.out.print("|     ");
						}
					}
					else{
						switch ( this.e.getGrille()[i][j].getPiece().getNom() ){
							case "Pion" : System.out.print("| P B "); break;
							case "Fou" : System.out.print("| F B "); break;
							case "Cavalier" : System.out.print("| C B "); break;
							case "Roi" : System.out.print("| K B "); break;
							case "Reine" : System.out.print("| Q B "); break;
							case "Tour" : System.out.print("| T B "); break;
							default : System.out.print("|     ");
						}
					}
				}
				
			}
			System.out.print("|\n|   |   ");
			for (int j = 0; j < 8; j++){
				if(e.deplacementPossible(departL, departC, i, j) == true)
					System.out.print("|*****");
				else System.out.print("|     ");
			}
			System.out.println("|");
		}
		System.out.println("+---+   +-----+-----+-----+-----+-----+-----+-----+-----+");
		System.out.println("\n+---+   +-----+-----+-----+-----+-----+-----+-----+-----+");
		System.out.println("|***|   |  A  |  B  |  C  |  D  |  E  |  F  |  G  |  H  |");
		System.out.println("+---+   +-----+-----+-----+-----+-----+-----+-----+-----+\n");
	}
	
	private void affichage(){
		System.out.println("+-------------------------------------------------------+");
		System.out.println("|                      JEU D'ECHECS                     |");
		System.out.println("+-------------------------------------------------------+\n");
		
		for(int i = 0; i < 8; i++){
			System.out.println("+---+   +-----+-----+-----+-----+-----+-----+-----+-----+");
			System.out.println("|   |   |     |     |     |     |     |     |     |     |");
			System.out.print("| " + (8-i) + " |   ");
			for(int j = 0; j < 8; j++){
				if (this.e.getGrille()[i][j].getPiece() == null) System.out.print("|     ");
				else{
					if (this.e.getGrille()[i][j].getPiece().getCouleur() == "Noir"){
						switch ( this.e.getGrille()[i][j].getPiece().getNom() ){
							case "Pion" : System.out.print("| P N "); break;
							case "Fou" : System.out.print("| F N "); break;
							case "Cavalier" : System.out.print("| C N "); break;
							case "Roi" : System.out.print("| K N "); break;
							case "Reine" : System.out.print("| Q N "); break;
							case "Tour" : System.out.print("| T N "); break;
							default : System.out.print("|     ");
						}
					}
					else{
						switch ( this.e.getGrille()[i][j].getPiece().getNom() ){
							case "Pion" : System.out.print("| P B "); break;
							case "Fou" : System.out.print("| F B "); break;
							case "Cavalier" : System.out.print("| C B "); break;
							case "Roi" : System.out.print("| K B "); break;
							case "Reine" : System.out.print("| Q B "); break;
							case "Tour" : System.out.print("| T B "); break;
							default : System.out.print("|     ");
						}
					}
				}
				
			}
			System.out.println("|\n|   |   |     |     |     |     |     |     |     |     |");
		}
		System.out.println("+---+   +-----+-----+-----+-----+-----+-----+-----+-----+");
		System.out.println("\n+---+   +-----+-----+-----+-----+-----+-----+-----+-----+");
		System.out.println("|***|   |  A  |  B  |  C  |  D  |  E  |  F  |  G  |  H  |");
		System.out.println("+---+   +-----+-----+-----+-----+-----+-----+-----+-----+\n");
	}
	
	public Joueur getJoueurUn(){		return this.joueurUn;	}
	public Joueur getJoueurDeux(){		return this.joueurDeux;	}
	public Echiquier getEchiquier(){	return this.e;			}
	public int getNbTour(){				return this.nbTour;		}
}
