package juruMusis;

public class juruMusis {
	
	public static void breakln() 
	{
		System.out.println("_____________________");
		System.out.println(""); 

	}
	
	public static void createBoard(String [][] board) 
	{
		for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[0].length; j++) 
			{
				board[i][j] = "-";
			}
		}	
	}
	
	public static void showBoard(String[][] board) 
	{
		breakln();
		for (int i = 0; i < board.length; i++) 
		{
			
			for (int j = 0; j < board[0].length; j++) 
			{
				System.out.print(" " + board[i][j]);
			}
			System.out.println(""); 
		}	
		breakln();
	}
		
}
