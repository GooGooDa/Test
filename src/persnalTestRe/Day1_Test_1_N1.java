package persnalTestRe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Day1_Test_1_N1 {
public static void main(String[] args) throws IOException {
//	문제 1:
//		res/data.txt 파일에 다음처럼 빈 공백으로 구분 된 값들이 있다.
//
//		20 30 29 39 49 38 10 19 87 29 38 27 8 90 87 
//
//		문제 1 : 이 값들의 개수를 구하는 코드를 작성하시오.

	FileOutputStream fos = new FileOutputStream("res2/data.txt");
	PrintStream out = new PrintStream(fos);
	out.printf("%s","20 30 29 39 49 38 10 19 87 29 38 27 8 90 87");
	
	{
		int count = 0;
		
		FileInputStream fis = new FileInputStream("res2/data.txt");
		Scanner scan = new Scanner(fis);
		while(scan.hasNext()) { //scan.hasNext(받을것이 있으면 true 값을 전부 받았으면 false를 반
			count++;
		int temp = scan.nextInt(); //nextInt는 값을 스페이스 기준으로 끊어서 인식함 nextInt로 값을 받아오고 
		//있다면 hasNext는 true 받아올값이 더이상없다면 hasNext는 false로 whileLoop 종
		}
			System.out.printf("count is %d\n" , count);
			scan.close();
			out.close();
			fos.close();
	}
}
}
