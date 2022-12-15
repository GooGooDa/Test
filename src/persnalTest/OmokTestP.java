package persnalTest;

import java.util.Scanner;

public class OmokTestP {
	public static void main(String[] args) {

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
		int ox,oy;
		char point;
		boolean color = true;
		while (true) {
			//바둑돌 콘솔 입력받기 후 조건검사 
			System.out.print("(x,y)\n");
			oy = scan.nextInt();
			ox = scan.nextInt();
			if ((ox<0 ||ox>9) || (oy<0 ||oy>9)) {
				System.out.println("잘못된 값을 입력하셨습니다. 1~10까지의 값을 입력해주세요!");	
				continue;
			}else {
			point = board[oy-1][ox-1];
			if(point == '○' || point == '●'){
				System.out.println("같은곳에는바둑돌을 둘수 없습니다.");
				continue;
			}
			}
			{
			// 바둑돌 색구별 작업
			if(color) 
				board[oy-1][ox-1] = '●';
			else 
				board[oy-1][ox-1] = '○';
			color = !color;
			}
			
			//최종 출력작업
			{
			for(int y = 1;y<=10;y++) {
				for(int x = 1;x<=10;x++) {
					System.out.printf("%c" , board[y-1][x-1]);
				}	
				System.out.println();
			}
			}	
			
		}// whileLoop 종료지점
		

	}
}
