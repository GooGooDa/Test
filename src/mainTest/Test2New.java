package mainTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2New {
public static void main(String[] args) throws FileNotFoundException {
	int count = 0;
	{
	FileInputStream fis = new FileInputStream("res/data.txt");
	Scanner scan = new Scanner(fis);
	
	while(scan.hasNext()) {
		int temp = scan.nextInt();
		count++;
	}
	}
	int max = -1;{
	FileInputStream fis = new FileInputStream("res/data.txt");
	Scanner scan = new Scanner(fis);
	
	int[] arr = new int [count];
	for(int i=0;i<count;i++) { 
		int a = scan.nextInt();	
		arr[i] = a;
		if(max < a)
			max = a;
	}
	
	}
}
}
