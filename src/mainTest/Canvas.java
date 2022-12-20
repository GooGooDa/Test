package mainTest;

public class Canvas {
	private char[][] buf;
	
	Canvas(){
		buf = new char[20][20];
	}
	
	public void initCanvas() {
		for(int y=0;y<20;y++) {
			for(int x=0;x<20;x++) {
				buf[y][x] = '┼';
				System.out.println("초기화 완료!");
			}
		}
	}

	public void drawLine(int x1, int y1, int x2, int y2) {
		
		buf[y1-1][x1-1] = '○';
		for(int i=0;i<5;i++) {
			buf[y1+i][x1+i] = '○';
			buf[y2-i-2][x2-i-2] = '○';
		}
		for (int y = 0; y < 20; y++) {
			for (int x = 0; x < 20; x++) {
				System.out.printf("%c", buf[y][x]);
			}
			System.out.println();
		}
	}
	

}
