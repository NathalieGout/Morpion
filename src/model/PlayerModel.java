package model;

public abstract class PlayerModel {
	private String name;
	private char symbol;
	

	public PlayerModel(String name, char symbol) {
		super();
		this.name = name;
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public char getSymbol() {
		return symbol;
	}
	
	
}
