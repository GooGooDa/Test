package persnalTest;

public class ForTest {
public static void main(String[] args) {
//	for(int i=0;i<100;i++) {
//	System.out.printf("%c",'┼');
//	if(i%10 == 9)
//		System.out.println();
//	}
	for(int i=0;i<10;i++) {
		if(i==4)
		System.out.printf("%c",'○');
		else if(i%2==1)
		System.out.printf("%c",'★');
		else
		System.out.printf("%c",'┼');
	}
}
	
}
