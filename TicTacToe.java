import java.util.*;
public class TicTacToe 
{
private static final char EMPTY=' ';
private static final char PLAYER_X='X';
private static final char PLAYER_O='O';
private static char[][] board=new char[3][3];
public static void main(String[] args) 
{
Scanner scanner=new Scanner(System.in);
boolean playAgain;
do 
{
initializeBoard();
char currentPlayer=PLAYER_X;
boolean gameWon=false;
int moves=0;
while (moves<9&&!gameWon) 
{
displayBoard();
System.out.println("Player "+currentPlayer+", enter your move (row and column): ");
int row = scanner.nextInt();
int col = scanner.nextInt();
if (isValidMove(row, col)) 
{
board[row][col]=currentPlayer;
moves++;
if(checkWin(currentPlayer)) 
{
displayBoard();
System.out.println("Player "+currentPlayer+" wins!");
gameWon=true;
} 
else 
{
currentPlayer=(currentPlayer==PLAYER_X)?PLAYER_O:PLAYER_X;
}
} 
else 
{
System.out.println("Invalid move. Try again.");
}
}
if(!gameWon) 
{
displayBoard();
System.out.println("It's a draw!");
}
System.out.print("Play again? (yes/no): ");
playAgain = scanner.next().equalsIgnoreCase("yes");
} 
while(playAgain);
scanner.close();
}
private static void initializeBoard() 
{
for(int i=0;i<3;i++) 
{
for(int j=0;j<3;j++) 
{
board[i][j]=EMPTY;
}
}
}
private static void displayBoard() {
System.out.println("  0 1 2");
for(int i=0;i<3;i++) 
{
System.out.print(i+" ");
for(int j=0;j<3;j++) 
{
System.out.print(board[i][j]);
if(j<2)
System.out.print("|");
}
System.out.println();
if(i<2)
System.out.println("  -----");
}
}
private static boolean isValidMove(int row, int col) 
{
return row>=0&&row<3&&col>=0&&col<3&&board[row][col]==EMPTY;
}
private static boolean checkWin(char player) 
{
for(int i=0;i<3;i++) 
{
if((board[i][0]==player&&board[i][1]==player&&board[i][2]==player)||
(board[0][i]==player&&board[1][i]==player&&board[2][i]==player)) 
{
return true;
}
}
return(board[0][0]==player&&board[1][1]==player&&board[2][2]==player)||
(board[0][2]==player&&board[1][1]==player&&board[2][0]==player);
}
}
