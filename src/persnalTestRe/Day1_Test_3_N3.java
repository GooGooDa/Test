package persnalTestRe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Day1_Test_3_N3 {
	public static void main(String[] args) throws IOException {
//		문제 3 : 이 값들 중에 10 을 찾아서 그 위치(인덱스 값)을 출력하시오.
		FileOutputStream fos = new FileOutputStream("res2/data.txt");
		PrintStream out = new PrintStream(fos);
		out.printf("%s", "20 30 29 39 49 38 10 19 87 29 38 27 8 90 87");

		{
			int count = 0;
			FileInputStream fis = new FileInputStream("res2/data.txt");
			Scanner scan = new Scanner(fis);
			while (scan.hasNext()) { // scan.hasNext(받을것이 있으면 true 값을 전부 받았으면 false를 반
				count++;
				int temp = scan.nextInt(); // nextInt는 값을 스페이스 기준으로 끊어서 인식함 nextInt로 값을 받아오고
				// 있다면 hasNext는 true 받아올값이 더이상없다면 hasNext는 false로 whileLoop 종
			}
			System.out.printf("count is %d\n", count);
			scan.close();
			out.close();
			fos.close();
			
		}
		{
			int count = 15; // 문제1에서 count의 값구했기때문에 15로사용
			FileInputStream fis = new FileInputStream("res2/data.txt");
			Scanner scan = new Scanner(fis);
			int max = -1;
			int[] nums = new int[count];

			for (int i = 0; i < count; i++) {
				nums[i] = scan.nextInt();// 숫자값이기 때문에 nextInt로 불러올수 있는듯?
				if (max < nums[i])
					max = nums[i];
			}
			System.out.printf("max : %d\n", max);
			scan.close();
			fis.close();
		}
		{
			int count = 15;
			FileInputStream fis = new FileInputStream("res2/data.txt");
			Scanner scan = new Scanner(fis);
			int index = -1;
			int nums[] = new int[count];
			for (int i = 0; i < count; i++) {
				nums[i] = scan.nextInt();
				if (nums[i] == 10)
					index = nums[i];
			}
			System.out.printf("10의 값의 index : %d" , index);
			scan.close();
			fis.close();
		}
	}
}
