package persnalTestRe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Day3_Test1_N5 {
	// 1. res/alphabet.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.
	// 2. alphabet이라는 이름으로 문자 15개를 저장할 수 있는 배열 객체를 생성한다.
	// 3. res/alphabet.txt 파일에 저장된 구분자가 없는 영문자 값들을 alphabet 배열에 로드한다. 
	// 4. 배열의 값이 다음과 같은 상태가 되도록 자리를 바꾼다.
	//  nmlkjihgfedcba
	// 5. res/alphabet-out.txt 파일로 배열의 값들을 저장 
	public static void main(String[] args) throws IOException {
		int count = 0;
		String token;

		FileOutputStream fos = new FileOutputStream("res2/alphabet.txt");
		PrintStream out = new PrintStream(fos);
		out.print("abcdefghijklmn");
		
		char[] alphabet = new char[15];
		FileInputStream fis = new FileInputStream("res/alphabet.txt");
		int read = 0;
		while((read = fis.read()) != -1) { //이부분 오래걸렸음 fis.read로 while루프를 돌면서 값을 저장할수있다는것도 알아두기!
		alphabet[count] = (char) read;//받은값 char값으로 캐스팅하여 char값의 배열 alphabat에 저장
		count++;
		System.out.println("로드완료");
		}
		Scanner sc = new Scanner(fis);
		{
			for(int i=0; i< alphabet.length-1; i++) //Bubble 정렬의사용 마지막 나의값 빼고 각값을 한번씩 대조
				for(int j=0; j< alphabet.length-1-i; j++) {
						if(alphabet[j]<alphabet[j+1]) {
							char temp=alphabet[j];
							alphabet[j]=alphabet[j+1];
							alphabet[j+1]=temp;
						}
					
				}
				System.out.println(alphabet);
				
		    System.out.println("자리변경 완료");
		}

		{
				FileOutputStream fos2 = new FileOutputStream("res2/alphabet_out.txt");
				PrintStream ps = new PrintStream(fos2);
				ps.print(alphabet);
			    System.out.println("저장 완료");
			    ps.close();
			    fos.close();
			}

		
		
		System.out.println("저장 완료");
	}
}
