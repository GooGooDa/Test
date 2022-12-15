package persnalTest;

public class IfTest {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if(i>1){
			System.out.printf("%c",'☆');
			System.out.printf("%d",i+1);
			
			if(i!=4)
				System.out.print(",");
			}
		}
		}
	}

