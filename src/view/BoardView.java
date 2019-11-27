/**
 * 
 */
package view;


import java.util.*;



/**
 * @author Nathalie Gout
 *
 */
public class BoardView  {

	/**
	 * 
	 */
	public BoardView() {
		super();
		
		
	}
	
	public void displayPlateau(ArrayList<Integer>grid, char symbol1, char symbol2) {

		for (int i = 0; i < grid.size(); i++) {
			if(i % 3 == 0) {
				System.out.println();
			}
			
			switch(grid.get(i)) {
			case 0:
				System.out.print(" ");
				break;
				
			case 1:
				System.out.print(symbol1);
				break;
				
			case 2:
				System.out.print(symbol2);
				break;
			}
			
			System.out.print("|");
		}
		
		
	}
	
	public int getMove() {
		System.out.println("Quelle case voulez vous jouer?");
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		int nb = Integer.parseInt(str); 
		return nb;
		
	}

}
