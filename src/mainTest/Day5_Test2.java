package mainTest;

public class Day5_Test2 {
	public static void main(String[] args) {

		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				if (y == x)
					System.out.print('○');
				else
					System.out.print('┼');
			}
			System.out.println();
		}
	System.out.println("1번과제 출력완료");
		for (int y=0 , z=10; y < 11; y++,z--) {
			for (int x = 0; x < 11; x++) {
				if (y == x ||  z==x)
					System.out.print('○');
				else
					System.out.print('┼');
			}
			System.out.println();
		}
		System.out.println("2번과제 출력완료");
		
		for (int y = 0 , z=10;y < 11; y++,z--) {
			for (int x = 0; x < 11; x++) {
				if (y==x ||z==x || z<y && x<y && z<x)
					System.out.print('○');
				else
					System.out.print('┼');
			}
			System.out.println();
		}
		System.out.println("3번과제 출력완료");
	
	
	
	}
}
