package controller;

import model.*;
import view.*;

public class Game {
	private PlayerModel currentPlayer;
	private int currentPlayerNb;
	private int nbPlayers;

	public Game() {
		super();
	}
	
	public void start() {
		//prepare
		
		//Declaration des vues
		GridModel gridModel = new GridModel();
		PageView pageView = new PageView();
		PlayersView playerView = new PlayersView();
		BoardView boardView = new BoardView();
		
		pageView.displayBienvenue(); //affiche bienvenue
		nbPlayers = playerView.displayNbre(); //demande nb de joueurs
		
		//crée 2 nouveaux joueurs
		PlayerModel player1;
		PlayerModel player2;
		
		switch (nbPlayers) {  //choisis la classe des joueurs en fonction de nb de joueurs
		case 0:
			player1 = new AIPlayer();
			player2 = new AIPlayer();

			break;
			
		case 1:
			player1 = new HumanPlayer(playerView.displayNom(),playerView.symbol());
			player2 = new AIPlayer();

			break;
			
		case 2:
			player1 = new HumanPlayer(playerView.displayNom(),playerView.symbol());
			player2 = new HumanPlayer(playerView.displayNom(),playerView.symbol());
			
			break;
			
		default:
			player1 = null;
			player2 = null;
		}
		
		currentPlayer = player1;
		currentPlayerNb = 1;
		
		
		//------------------------start--------------------------------
		int i = 0;
		while (testVictory() && i < 9) {
			boardView.displayPlateau(gridModel.getGrid(),player1.getSymbol(),player2.getSymbol());  //affiche la grille
			
			if (currentPlayer instanceof HumanPlayer) {  //si c'est un humain
				gridModel.setGrid(boardView.getMove(),currentPlayerNb);
			} else {
				AIPlayer player = (AIPlayer) currentPlayer;  //obligé pour utiliser make move
				gridModel.setGrid(player.makeMove(gridModel.getGrid()),currentPlayerNb);
			}
			
			

			if (currentPlayer == player1) {  //inverse le joueur
				currentPlayer = player2;
				currentPlayerNb = 2;
			} else {
				currentPlayer = player1;
				currentPlayerNb = 1;
			}
			i++;
		}
		boardView.displayPlateau(gridModel.getGrid(),player1.getSymbol(),player2.getSymbol());
		
		if(testVictory()) {
			if (currentPlayer == player1) {
				pageView.displayFin(player2.getName());
			} else {
				pageView.displayFin(player1.getName());
			}
		}
	}
	
	public boolean testVictory() {
		return true;
	}
	

	
}
