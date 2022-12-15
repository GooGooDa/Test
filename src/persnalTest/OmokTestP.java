package persnalTest;

import java.util.Scanner;

public class OmokTestP {
	public static void main(String[] args) {

//for(int i=0;i<100;i++) {
//	System.out.printf("%c",'┼');
//	if(i%10==9)
//		System.out.println();
//} 1차원 for문 바둑판

//for(int y=0;y<10;y++) {
//	for(int x =0; x<10; x++) {
//	System.out.printf("%c",'┼');	
//	}
//	System.out.println();
//} 2차원for문 바둑판

//		char[] borad = new char[100];
//		for (int i = 0; i < 100; i++) {
//			System.out.printf("%c", '┼');
//			if (i % 10 == 9)
//				System.out.println();
//
//		} 1차원 배열의 바둑판
		char[][] board = new char[10][10];
		Scanner scan = new Scanner(System.in);

		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++) {
				board[y - 1][x - 1] = '┼';
			} // 바둑판 생성작업
		} // 출력작업을 계속 반복하기때문에 초기한번 출력 바둑돌만 사용하게
		for (int i = 0; i < 10; i++) {
			board[0][i] = '┬';
			board[9][i] = '┴';
			board[i][0] = '├';
			board[i][9] = '┤';
		}
		board[0][0] = '┌';
		board[0][9] = '┐';
		board[9][0] = '└';
		board[9][9] = '┘';

		//입력단계 변수
		char stone = '●';
		int ox,oy;
		boolean color = true;
		char point;
		
		while (true) {
			System.out.print("(x,y)\n");
			oy = scan.nextInt();
			ox = scan.nextInt();
			if ((ox<1 ||ox>10) || (oy<1 ||oy>10)) {
				System.out.println("잘못된 값을 입력하셨습니다. 1~10까지의 값을 입력해주세요!");	
				continue;
			}else {
			if(board[ox-1][oy-1] == )
				System.out.println();
			}
			
			// 바둑돌 입력작업
			
			// 결과 출력
			for (int z = 0; z < 10; z++) {
				for (int a = 0; a < 10; a++) {
					System.out.printf("%c", board[z][a]);
				}
				System.out.println();

			}
			System.out.println();
			pick++;
		}// whileLoop 종료지점
		

	}
}
