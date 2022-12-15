package mainTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestCleanCode1 {

		public void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub
//			res/data.txt 파일에 다음처럼 빈 공백으로 구분 된 값들이 있다.
	//
//			20 30 29 39 49 38 10 19 87 29 38 27 8 90 87 
	//
//			문제 1 : 이 값들의 개수를 구하는 코드를 작성하시오.
//			int count = 0;
//			{
//			    // 코드를 작성하는 공간

//			}
//			Sysout.out.printf("count is %d\n", count);
			
			
			//1. 파일을 불러와 할 것
			//2. hasnext를 이용할 것
			//3.while문을 이용해서 갯수를 구해야할 것
			//4.마지막으로 갯수를 내보면 되는 것?
			
			int count =0;
			FileInputStream fis =new FileInputStream("res/data.txt");    //파일 가져오기
			Scanner scan = new Scanner(fis);
			while(scan.hasNext()) {	
				int text =scan.nextInt();
				count++;					
			}
			System.out.printf("count is %d\n", count);
			
		}

	}



