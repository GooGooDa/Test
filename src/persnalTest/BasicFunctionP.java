package persnalTest;

public class BasicFunctionP {

	static int f() {
		return 4*3;
	}
	
	static int add() {
		return 3+4; 
	}
	
	public static void main(String[] args) {

	int x = 1+4*3+5/2;
	
	System.out.printf("%d\n" , x);
	
	x = 1+f()+5/2;
	
	System.out.printf("%d\n" , x + add());
}
}
