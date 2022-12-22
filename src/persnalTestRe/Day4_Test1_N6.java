package persnalTestRe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Day4_Test1_N6 {

//문제 6 : 다음 각 절차를 따라 작성하시오.
//
//// 1. res/bitmap.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.

public static void main(String[] args) throws FileNotFoundException {
File file = new File("res2/bitmap.txt");

FileOutputStream fos = new FileOutputStream("res2/bitmap.txt");
PrintStream out = new PrintStream(fos);
out.print("11111111110000000000\n"
		+ "11111111100000000000\n"
		+ "11111111000000000000\n"
		+ "11111110000000000000\n"
		+ "11111100000000000000\n"
		+ "11111000000000000000\n"
		+ "11110000000000000000\n"
		+ "11100000000000000000\n"
		+ "11000000000000000000\n"
		+ "10000000000000000000\n");

int bitmap[][] =new int [20][10];
FileInputStream fis = new FileInputStream("res2/bitmap.txt");
Scanner sc = new Scanner(fis);
for(int y=0;y<bitmap.length;y++) {
	String line = sc.nextLine(); //총 20번 받아옴
	for(int x=0;x<bitmap[y].length;x++) {
		bitmap[y][x] = Integer.parseInt(line.substring(x,x+1));
		System.out.print(bitmap[y][x]);
	}
	System.out.println();
}


}
}
