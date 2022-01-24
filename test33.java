package MTA;
public class test33{
	public static void main(String[] args) {
		String s="s";
		 String [][]board=new String[3][4];
		for(int x=0;x<board.length;x++) {
			for(int y=0;y<board[x].length;y++) {
				board[x][y]=s+""+x+""+y;
			}
		}
	traverse(board);
	}
	
		public static void traverse(String [][]board)
		{
		  for (int x = 0; x < board.length; x++)
		     for (int y = 0; y < board[x].length; y++)
		        System.out.println(board[x][y]);
		}
	
}

