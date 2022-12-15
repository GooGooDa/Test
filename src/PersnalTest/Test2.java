package PersnalTest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		res/data.txt 파일에 다음처럼 빈 공백으로 구분 된 값들이 있다.
//
//		20 30 29 39 49 38 10 19 87 29 38 27 8 90 87 
//
//		문제 1 : 이 값들의 개수를 구하는 코드를 작성하시오.		
		// 1.배열이 하나 필요할 것
		// 1.5 파일을 불러와 할 것
		// 2.split을 사용할 수 있어야 할 것
		// 3.for문을 이용해서 갯수를 셀 수 있는 것
		// 4.마지막으로 갯수를 내보면 되는 것?

		int count = 0;

		{
//파일 가져오기
			FileInputStream fis = new FileInputStream("res/data.txt");
			Scanner scan = new Scanner(fis);
//버퍼를 이용해서 총 개수 구하기
			while (scan.hasNext()) {
				int temp = scan.nextInt();
				count++;
			}
			System.out.printf("count is %d\n", count);
			scan.close();
			fis.close();

		}

		// 문제 2 : 이 값들 중에서 가장 큰 값이 무엇인지 출력하는 코드를 작성하시오.
		// 1.앞서 count의 값을 알아 났으니 배열에 크기를 정할 수 있다.
		// 2.for문과 scan문을 이용할 것
		// 3.또한 조건문을 이용해서 최댓값을 구해야 함!

		{
			// 파일 가져오기
			FileInputStream fis = new FileInputStream("res/data.txt");
			Scanner scan = new Scanner(fis);
			int max = -1;
			int[] arr = new int[count];
			// FOR문 이용해서 배열에 값을 넣어주고 비교하기
			for (int i = 0; i < count; i++) {
				int a = scan.nextInt();
				arr[i] = a;
				if (max < arr[i])
					max = arr[i];

			}
			System.out.printf("max is %d\n", max);
			scan.close();
			fis.close();
		}
		{
			int[] arr = new int[count];
			int index = 0;
			FileInputStream fis = new FileInputStream("res/data.txt"); // 버퍼생성
			Scanner scan = new Scanner(fis);// 응용버퍼
			for (int i = 0; i < count; i++) {
				arr[i] = scan.nextInt();
				int x = arr[i];
				if (x == 10)
					System.out.printf("index = %d", i);
				scan.close();
				fis.close();
			}

		}

	}

}
