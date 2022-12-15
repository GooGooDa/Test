package persnalTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersanlTest1 {
	public static void main(String[] args) throws FileNotFoundException {
		int count = 0; // 문제 1번 length쓰지않고 파일갯수 알아내기
		{

			FileInputStream fis = new FileInputStream("res/data.txt");
			Scanner scan = new Scanner(fis);

			while (scan.hasNext()) {
				int temp = scan.nextInt();
				count++;
			}
			System.out.printf("%d\n", count);
		}
		{
			int max = -1; // 위에 값에서 가장큰수를 알아내기
			FileInputStream fis = new FileInputStream("res/data.txt");
			Scanner scan = new Scanner(fis);
			int[] arr = new int[count];
			for (int i = 0; i < count; i++) {
				int a = scan.nextInt();
				arr[i] = a;
				if (max < arr[i])
					max = arr[i];
			}
			System.out.printf("max : %d", max);
		}
		{
			int index = -1; // 값이 10인 값을 찾아서 index출력하기
			{
				int[] arr = new int[count];
				FileInputStream fis = new FileInputStream("res/data.txt");
				Scanner scan = new Scanner(fis);
				for (int i = 0; i < count; i++) {
					arr[i] = scan.nextInt();
					int x = arr[i];
					if (x == 10) {
						index = i;
					System.out.printf("index : %d", i);
					}
				}
			}
		}

	}
}
