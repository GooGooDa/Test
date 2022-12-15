package PersnalTest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Day2_Test1 {
	public static void main(String[] args) throws IOException {
		// 문제1
		int[] nums = new int[15];
		int count = 0;
		int temp = 0;
		// 문제2
		{
			FileInputStream fis = new FileInputStream("res/data.txt");
			Scanner scan = new Scanner(fis);
			while (scan.hasNext()) {
				nums[count] = scan.nextInt(); //nextInt는 띄어쓰기 기준으로 받아옴
				count++;

			}
			for (int i = 0; i < count; i++) {
				System.out.printf("%d", nums[i]);
				if (i != count - 1)
					System.out.printf(",");
			}
			System.out.println();
			System.out.println("로드완료");
			scan.close();
			fis.close();
		}
		// 문제3

		Random rand = new Random();
		int r1;
		int r2;
		for (int i = 0; i < 50; i++) {
			r1 = rand.nextInt(15);
			r2 = rand.nextInt(15);
			System.out.printf("r1 : %d , r2 : %d\n", r1, r2);
			temp = nums[r1];
			nums[r1] = nums[r2];
			nums[r2] = temp;
			for(int j = 0 ; j < 15 ; j++ )
			{
				System.out.printf("%d " , nums[j]);
				
			}System.out.println();
		}

		
		System.out.println("번호 섞기완료");

		// 문제4
		{
			FileOutputStream fos = new FileOutputStream("res/data-out.txt");
			PrintStream out = new PrintStream(fos);
			for (int i = 0; i < count; i++) {
				out.printf("%d", nums[i]);
				if (i != count - 1)
					out.print(",");

				out.close();
				fos.close();
			}
		}
	}
}
