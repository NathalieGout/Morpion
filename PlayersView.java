package view;

import java.util.Scanner;

public class PlayersView {

	public PlayersView() {
		// TODO Auto-generated constructor stub
	}
	
	public int displayNbre() {
		
		System.out.println("Combien y t-il de joueurs?");
		
	
		Scanner sc=new Scanner(System.in);
		int str= sc.nextInt();
		
		
		sc.close();
		return str;
		
		
		
	}
	
	public  String displayNom(){
System.out.println("Quel est ton prénom?");
		
		
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		String lValue=str.toString();
		sc.close();
		return lValue;
		
		
		
		
	}
	public char symbol() {
		System.out.println("Choisi ton symbol");
		
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		char lValue = str.charAt(0);
		sc.close();
		return lValue;
		
		
		
		
		
	}

}
