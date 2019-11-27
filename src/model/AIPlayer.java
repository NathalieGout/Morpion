package model;
import java.util.ArrayList;
import java.util.Random;


public class AIPlayer extends PlayerModel{

	
	public AIPlayer() {
		super(randomName(), randomSymbol());
	}
	
	private static String randomName() {
		String[] name = {"Riri", "Fifi", "Loulou"};
		Random rand = new Random();
		return name[rand.nextInt(name.length)];
	}
	
	private static char randomSymbol() {
		char[] symbol = {'X', 'O'};
		Random rand = new Random();
		return symbol[rand.nextInt(symbol.length)];
	}
	
	public int makeMove(ArrayList<Integer> grid) {// deplacement de l'IA
		Random rand = new Random();
		int choixIA = rand.nextInt(9);
		while (grid.get(choixIA) != 0) // Tant que index de l'ArrayList n'est pas vite, il boucle.
		{
			choixIA = rand.nextInt(9);
		
		}
		return choixIA;
	}
}
