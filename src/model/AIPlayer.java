package model;
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
	
	public void makeMove() {
		
	}

}
