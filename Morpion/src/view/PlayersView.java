package view;

import java.util.Scanner;

public class PlayersView {

	public PlayersView() {
		// TODO Auto-generated constructor stub
	}
	
	public int displayNbre() {
		
		System.out.println("Combien y t-il de joueurs?");
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int str= sc.nextInt();
		return str;
		
		
		
		
	}
	
	public  String displayNom(){
System.out.println("Quel est ton prénom?");
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		return str;
		
		
		
	}
	public char symbol() {
		System.out.println("Choisi ton symbol");
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		return str.charAt(0);
		
		
		
		
	}

}
