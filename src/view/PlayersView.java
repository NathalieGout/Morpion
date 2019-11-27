package view;

import java.util.Scanner;

public class PlayersView {
	Scanner sc = new Scanner(System.in);  //crée le scanner

	public PlayersView() {

		// TODO Auto-generated constructor stub
	}

	public int displayNbre() {

		System.out.println("Combien y t-il de joueurs?");
		String str= sc.nextLine();
		int nb = Integer.parseInt(str);  //convertie la chaine de caractere en int
		return nb;

	}

	
	public  String displayNom(){
		System.out.println("Quel est ton prénom?");

		String str= sc.nextLine();
		return str;


	}
	public char symbol() {
		System.out.println("Choisis ton symbole");

		String str= sc.nextLine();
		char lValue = str.charAt(0);

		return lValue;


	}

}
