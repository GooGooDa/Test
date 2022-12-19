package persnalOmok;

import java.util.Scanner;

public class Omok {
public static void main(String[] args) {
	char[][] board = new char[10][10];
	int ox,oy;
	boolean color = true;
	Scanner sc = new Scanner(System.in);
	
	
	initBoard(board);
	printBoard(board);
	while(true) {
	}
}

private static void initBoard(char board[][]) {
	
	for (int y = 1; y <= 10; y++)
		for (int x = 1; x <= 10; x++) 
			board[y - 1][x - 1] = '┼';
	for (int i = 0; i < 10; i++) {
		board[0][i] = '┬';
		board[9][i] = '┴';
		board[i][0] = '├';
		board[i][9] = '┤';
	}

	board[0][0] = '┌';
	board[0][9] = '┓';
	board[9][0] = '└';
	board[9][9] = '┘';
}

private static void printBoard(char board[][]){

	for(int y=1;y<=10;y++) 
		for(int x=1;x<=10;x++) {
			System.out.printf("%c",board[x-1][y-1]);
		}
	System.out.println();
}

}
