package controller;

import model.*;
import view.*;

public class Game {
	private PlayerModel currentPlayer;
	private int nbPlayers;

	public Game() {
		super();
	}
	
	public void prepare() {
		//Declaration des vues
		GridModel gridView = new GridModel();
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
			player1 = new HumanPlayer(playerView.displayNbre(),playerView.symbol());
			player2 = new AIPlayer();
			break;
			
		case 2:
			player1 = new HumanPlayer(playerView.displayNbre(),playerView.symbol());
			player2 = new HumanPlayer(playerView.displayNbre(),playerView.symbol());
			break;
		}
		currentPlayer = player1;
		
		
		
	}
	
	public void start() {
		
	}
	
	public boolean testVictory() {
		return true;
	}
	

	
}
