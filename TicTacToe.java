///console based  Tic Tac Toe game 


import java.util.*;
class  TicTacToe
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char[][] board=new char[3][3];
		System.out.println("who we want to start O (or) X");
		char player=sc.next().charAt(0);
		boardDeclaration(board);
		while(true)
		{
			printBoard(board);
			System.out.println("current player "+player+", enter row (1-3) and column (1-3) with seperated space");
			int row=sc.nextInt()-1;
			int column=sc.nextInt()-1;
			if(isValidMove(board,row,column))
			{
				board[row][column]=player;
				if(winCheck(board,player))
				{
					 printBoard(board);
					 System.out.println("player "+player +" wins!");
				     break;
				}
				if(tieCheck(board))
				{
					printBoard(board);
					System.out.println("match is tie!..");
						break;
				}
			}
			else
				System.out.println("invalid move..try again...");
			player=(player=='O') ? 'X':'O';
		}
	}
	public static void boardDeclaration(char[][] board)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]='-';
			}
			
		}
	}
	public static void printBoard(char board[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean isValidMove(char[][] board,int row,int column)
	{
		return board[row][column]=='-' && row>=0 && row<3 && column<3 && column>=0;
	}
	public static boolean winCheck(char[][] board,char player)
	{
		for(int i=0;i<3;i++)
		{
			if(board[i][0]==player && board[i][1]==player && board[i][2]==player)
				return true;
			if(board[0][i]==player && board[1][i]==player && board[2][i]==player)
				return true;
		}
		return board[0][2]==player && board[1][1]==player && board[2][0]==player || board[0][0]==player && board[1][1]==player && board[2][2]==player;
				
	}
	public static boolean tieCheck(char[][] board)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[i][j]=='-')
					return false;
			}
		}
			return true;
	}

		
}
