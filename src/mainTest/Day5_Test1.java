package mainTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Day5_Test1 {
public static void main(String[] args) throws FileNotFoundException {
//	—--------------------------------------------------------------------------------------------------------------
//	:  제어구조 중첩 + 다차원 배열 + 배열+함수  문제
//	—--------------------------------------------------------------------------------------------------------------
//	문제 8 : 다음 각 절차를 따라 작성하시오.
// 7번 문제를 함수를 이용하여 코드를 나누어 만들어보시오.

	FileOutputStream fos = new FileOutputStream("res/map.text");
	PrintStream out = new PrintStream(fos);
	out.print("00010\n01010\n00000");
	
	int [][] map = new int [3][5];
	char[][] board = new char[6][10];
//	┌ ┐ ▩▩
//	└ ┘ ▩▩
	int temp;
	
	inputMap(map);
	{
	int x = 0, y = 0;
	
	for(int i=0;i<map.length;i++) {
		for(int j=0;j<map[i].length;j++) {
			if(map[i][j]==0) {
				map[x][y] = '┌';
				map[x][y+1] = '┐';
				map[x+1][y] = '└';
				map[x+1][y+1] = '┘';
			}else {
				map[x][y] = '▩';
				map[x][y+1] = '▩';
				map[x+1][y] = '▩';
				map[x+1][y+1] = '▩';
				}
			System.out.println(j);
			j=j+2;
		}
	x=0;
	x=x+2;
	}
	System.out.println("board 그리기 완료");
	}
	printBoard(board);
}
static void inputMap(int[][] map) throws FileNotFoundException {
	// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("res/map.txt");
		Scanner scan= new Scanner(fis);
	String temp;
	    // 코드를 작성하는 공간
		for(int i=0; i<map.length;i++) {
			temp= scan.nextLine();
for(int j=0; j<map[i].length; j++) {
	map[i][j] = Integer.parseInt(temp.substring(j, j+1));
				System.out.print(map[i][j]);
			}
			
			System.out.println();
		}
		
	    System.out.println("map 데이터 로드 완료");

}

static void printBoard(char board[][]){
	for(int i=0; i<board.length;i++) {
		for(int j=0; j<board[i].length; j++) {
			System.out.print(board[i][j]);
		}
		System.out.println();
	}

    System.out.println("board 출력 완료");
    }

}
