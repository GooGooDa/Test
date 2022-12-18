package persnalTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Day3_TestP {
	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("res/bitamp.txt");
		PrintStream out = new PrintStream(fos);

		out.print("11111111110000000000\r\n" + "11111111100000000000\r\n" + "11111111000000000000\r\n"
				+ "11111110000000000000\r\n" + "11111100000000000000\r\n" + "11111000000000000000\r\n"
				+ "11110000000000000000\r\n" + "11100000000000000000\r\n" + "11000000000000000000\r\n"
				+ "10000000000000000000\r\n");

		int[][] bitmap = new int[10][20];

		FileInputStream fis = new FileInputStream("res/bitmap.txt");
		Scanner sc = new Scanner(fis);

		for (int j = 0; j < bitmap.length; j++) {
			String line = sc.nextLine();
			for (int i = 0; i < bitmap[j].length; i++) {
				bitmap[j][i] = Integer.parseInt(line.substring(i, i + 1));
				System.out.print(bitmap[j][i]);
			}
			System.out.println();
		}

		// 버블정렬
		for (int i = 0; i < bitmap.length; i++) {
			for (int j = 0; j < bitmap.length; j++) {
				for (int x = 0; x < bitmap[j].length - 1; x++) {
					if (bitmap[j][x] > bitmap[j][x + 1]) {
						int temp = bitmap[j][x + 1];
						bitmap[j][x + 1] = bitmap[j][x];
						bitmap[j][x] = temp;
					}
				}
			}
		}
		for(int i=0; i<bitmap.length;i++) {		
			for(int j=0;j<bitmap[i].length;j++ ) {
				System.out.print(bitmap[i][j]);
				}
			System.out.println();
			}

	    System.out.println("자리변경 완료");
	    
	   
	    {
	    	FileOutputStream fos2 = new FileOutputStream("res/bitmap_out.txt");
			PrintStream out2 = new PrintStream(fos2);
			for(int i=0;i<bitmap.length;i++) {
				for(int j=0;j<bitmap[i].length;j++) {
					out2.printf("%d" , bitmap[i][j]);
				}
				out2.println();
			}
	    }
	}	
}
