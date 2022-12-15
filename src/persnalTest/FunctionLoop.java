package persnalTest;

public class FunctionLoop {
public static void main(String[] args) {

//sum(num);	

}
public static int an(int n)
{
	return 3+(n-1)*7;
}


public static int sum(int n) {
	if(n==1)
		return 3;
	return sum(n-1) + an(n);
}
}
