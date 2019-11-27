package model;
import java.util.*;

public class GridModel {
	private ArrayList<Integer> grid;
	
	public GridModel() {
		grid = new ArrayList<Integer>();
		for(int i = 0; i < 9; i++) {
			grid.add(0);
		}
	}
	
	public void setGrid() {
		
	}
	
	public ArrayList<Integer> getGrid() {
		return grid;
	}
}
