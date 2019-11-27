package controller;

import model.*;
import view.*;

public class Game {
	private PlayerModel currentPlayer;
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
		
		//------------------------start--------------------------------
		int i = 0;
		while (testVictory() && i < 1) {
			boardView.displayPlateau(gridModel.getGrid(),player1.getSymbol(),player2.getSymbol());
			i++;
			
		}
	}
	
	public boolean testVictory() {
		return true;
	}
	

	
}
