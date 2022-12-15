package persnalTest;

import java.util.Scanner;

public class OmokTestSample {

	public static void main(String[] args) {

		// 오목 배열 생성
		char[][] board  = new char[10][10];
		
		// 값 저장
		for(int j=0; j<10; j++)
			for(int i=0; i<10; i++)
				board[j][i] = '┼';
		
		for( int i=0; i<10; i++) {
			board[0][i] = '┬';
			board[9][i] = '┴';
			board[i][0] = '├';
			board[i][9] = '┤';
		}
		
		board[0][0] = '┌';
		board[0][9] = '┓';
		board[9][0] = '└';
		board[9][9] = '┘';
		
		// 사용자 입력
		Scanner scan = new Scanner(System.in);
		int omokX, omokY;
		boolean color = true;
		char point;
		char dol = '●';

		
		while(true) {
		
			System.out.print("(x y)>");
			omokX = scan.nextInt();
			omokY = scan.nextInt();
			
			if((omokX<1||10<omokX) || (omokY<1||10<omokY)) {
				System.out.printf("입력 가능 범위를 벗어났습니다.(%d %d)\n", omokY, omokX);
				continue;
			}
			
			point = board[omokY-1][omokX-1];
			if(point=='●' || point=='○') {
				System.out.printf("같은 자리에 둘 수 없습니다.(%d %d)\n", omokY, omokX);
				continue;
			}
				
			// 배열 조작
			if(color)
				board[omokY-1][omokX-1] = '●';
			else
				board[omokY-1][omokX-1] = '○';
			color = !color;
			
		
			
			// 출력
			for(int y=1; y<=10; y++) {
				for(int x=1; x<=10; x++)
					System.out.printf("%c", board[y-1][x-1]);
				
				System.out.println();
			}
		}
		
	}
}