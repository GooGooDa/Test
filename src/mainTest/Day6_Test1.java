package mainTest;

public class Day6_Test1 {
	public static void main(String[] args) {
		char[][] canvas = new char[20][20];
		
		int x1 = 2;
		int y1 = 2;
		int x2 = 13;
		int y2 = 13;

		initBoard(canvas);
		drawLineOnCanvas(canvas, x1, y1, x2, y2);

	}

	private static void drawLineOnCanvas(char[][] canvas, int x1, int y1, int x2, int y2) {
		
		canvas[y1-1][x1-1] = '○';
		for(int i=0;i<5;i++) {
			canvas[y1+i][x1+i] = '○';
			canvas[y2-i-2][x2-i-2] = '○';
		}
		for (int y = 0; y < 20; y++) {
			for (int x = 0; x < 20; x++) {
				System.out.printf("%c", canvas[y][x]);
			}
			System.out.println();
		}
	}

	private static void initBoard(char[][] canvas) {
		for (int y = 0; y < 20; y++) {
			for (int x = 0; x < 20; x++) {
				canvas[y][x] = '┼';
			}
		}
		System.out.println("board 초기화 완료!");
	}

}
