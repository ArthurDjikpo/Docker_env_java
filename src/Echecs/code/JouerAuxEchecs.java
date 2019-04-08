import java.util.*;

public class JouerAuxEchecs{
	public static void main(String[] args){
		String j1, j2, tmp;
		char departC, arriveeC;
		int departL, arriveeL;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quel est votre pseudo Joueur 1 ? ");
		j1 = sc.nextLine();
		System.out.println("Tres bien !");
		System.out.print("Quel est votre pseudo Joueur 2 ? ");
		j2 = sc.nextLine();
		Jouer jeu = new Jouer(j1, j2);
		
		// Il faudra remplacer le true par l'appel de la methode "PAT/MAT"
		while(true){
			if (jeu.getNbTour()%2 == 0){
				System.out.println("A vous de jouer " + j1 + " ! ");
				do{
					do{
						System.out.print("Sur quelle ligne se trouve votre Piece ? [1; 8] -> ");
						departL = sc.nextInt();
						sc.nextLine();
					} while( departL < 1 || departL > 8);
					do{
						System.out.print("Sur quelle colonne se trouve votre Piece ? [A; H] -> ");
						tmp = sc.nextLine();
						departC = tmp.charAt(0);
					} while ( (int)departC - ((int)'A') < 0 || (int)departC - ((int)'A') > 8 );
				}while(jeu.getEchiquier().getGrille()[8-departL][(int)departC - ((int)'A')].getPiece() == null
						|| jeu.getEchiquier().getGrille()[8-departL][(int)departC - ((int)'A')].getPiece().getCouleur() != jeu.getJoueurUn().getCouleur());
			
				jeu.affichagePredictif(8-departL, (int)departC - ((int)'A'));
				System.out.print("Sur quelle ligne voulez-vous deplacer votre Piece ? (chiffre attendu) -> ");
				arriveeL = sc.nextInt();
				sc.nextLine();
				System.out.print("Sur quelle colonne voulez-vous deplacer votre Piece ? (lettre attendue) -> ");
				tmp = sc.nextLine();
				arriveeC = tmp.charAt(0);
				jeu.deplacerPiece(8-departL, (int)departC - ((int)'A'), 8-arriveeL, (int)arriveeC - (int)'A');
			}
			else{
				System.out.println("A vous de jouer " + j2 + " ! ");
				do{
					do{
						System.out.print("Sur quelle ligne se trouve votre Piece ? [1; 8] -> ");
						departL = sc.nextInt();
						sc.nextLine();
					} while( departL < 1 || departL > 8);
					do{
						System.out.print("Sur quelle colonne se trouve votre Piece ? [A; H] -> ");
						tmp = sc.nextLine();
						departC = tmp.charAt(0);
					} while ( (int)departC - ((int)'A') < 0 || (int)departC - ((int)'A') > 8 );
				}while(jeu.getEchiquier().getGrille()[8-departL][(int)departC - ((int)'A')].getPiece() == null
						|| jeu.getEchiquier().getGrille()[8-departL][(int)departC - ((int)'A')].getPiece().getCouleur() != jeu.getJoueurDeux().getCouleur());
			
				jeu.affichagePredictif(8-departL, (int)departC - ((int)'A'));
				System.out.print("Sur quelle ligne voulez-vous deplacer votre Piece ? (chiffre attendu) -> ");
				arriveeL = sc.nextInt();
				sc.nextLine();
				System.out.print("Sur quelle colonne voulez-vous deplacer votre Piece ? (lettre attendue) -> ");
				tmp = sc.nextLine();
				arriveeC = tmp.charAt(0);
				jeu.deplacerPiece(8-departL, (int)departC - ((int)'A'), 8-arriveeL, (int)arriveeC - (int)'A');
			}
		}
		
	}
}