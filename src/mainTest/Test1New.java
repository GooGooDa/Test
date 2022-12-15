package mainTest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1New {
	public static void main(String[] args) throws IOException {
		int count = 0;
		{
			FileInputStream fis = new FileInputStream("res/data.txt");
			Scanner scan = new Scanner(fis);

			while (scan.hasNext()) {
				int temp = scan.nextInt();
				count++;
			}
			System.out.printf("%d", count);
		}

		{
			FileInputStream fis = new FileInputStream("res/data.txt");
			Scanner scan = new Scanner(fis);
			int max = -1;
			int[] arr = new int[count];
			for (int i = 0; i < count; i++) {
				int a = scan.nextInt();
				arr[i] = a;
				if (max < arr[i])
					max = arr[i];
			System.out.printf("max is %d\n", max);
			scan.close();
			fis.close();
			
			}
		}
	}
}
