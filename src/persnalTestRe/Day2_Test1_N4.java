package persnalTestRe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Day2_Test1_N4 {
		
	//	문제 4 : 다음 각 절차를 따라 작성하시오.

	// 1. nums라는 이름으로 정수 15개를 저장할 수 있는 배열 객체를 생성한다.
	// 2. res/data.txt 파일에 저장된 값들을 nums 배열에 로드한다. 
	// 3. 0~14 범위의 랜덤값 2개를 얻어서  그 위치의 값을 서로 바꾼다. 그것을 50번 반복한다.
	// 4. res/data-out.txt 파일로 배열의 값들을 저장 
public static void main(String[] args) throws IOException {
	int[] nums = new int[15];
	char[] cnums = new char[15]; 
	String line;
	int temp;
	FileInputStream fis = new FileInputStream("res2/data.txt");
	Scanner sc = new Scanner(fis);
	while(sc.hasNext()) {
		for(int i=0;i<nums.length;i++)
		nums[i] = sc.nextInt();
	}
	Random rand = new Random();
	for(int i=0;i<50;i++) {
	int r1 = rand.nextInt(14);
	int r2 = rand.nextInt(14);
	System.out.printf("not change : %d , %d\r",nums[r1],nums[r2]);
	
	temp = nums[r1];
	nums[r1] = nums[r2];
	nums[r2] = temp;
	System.out.printf("change : %d , %d\r",nums[r1],nums[r2]); //50번동안의 변화를 확인
	}	
	{
		FileOutputStream fos = new FileOutputStream("res2/data_out.txt");
		PrintStream out = new PrintStream(fos);
		for(int i=0;i<cnums.length;i++) {
		out.printf("%d ",nums[i]);
	}
		
	}
	
	}
}
