/**
 * 
 */
package view;

import java.util.ArrayList;



/**
 * @author Nathalie Gout
 *
 */
public class BoardView  {

	/**
	 * 
	 */
	public BoardView() {
		// TODO Auto-generated constructor stub
		super();
		
		
	}
	
	public void publicdisplayPlateau(ArrayList<Integer>grid) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < grid.size(); i++) {
			System.out.println(i);
		}
		
		
	}
	
	public void getMove() {
		System.out.println("Quelle case voulez vous jouer?");
		
	}

}
