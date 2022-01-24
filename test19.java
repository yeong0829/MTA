package MTA;

public class test19 {

	public static void main(String[] args) {
		char[][] grid = { {'-','-','x'},
						{'-','-','-'},
						{'-','o','-'}};
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				System.out.print(grid[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}

}
