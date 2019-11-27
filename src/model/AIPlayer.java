package model;
import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.Random;

import javax.print.attribute.standard.Sides;
import javax.swing.plaf.TextUI;

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
	
	public void makeMove(ArrayList<Integer> grid) {// deplacement de l'IA
		choixIA = random(0,8);
		while grid.get(choixIA) != "0" // Tant que index de l'ArrayList n'est pas vite, il boucle.
		{
				choixIA = random(0,8);
		
		}
		return choixIA;
}
