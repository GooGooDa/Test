package mainTest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Day3_Test1 {
public static void main(String[] args) throws IOException {
	//1
	FileOutputStream fos = new FileOutputStream("res/alphabet.txt");
	PrintStream out = new PrintStream(fos);
	out.printf("%s" , "abcdefghijklmn");
	
	//2
	char [] alphabet = new char[15];
	//3
	String change;{
	FileInputStream fis = new FileInputStream("res/alphabet.txt"); 
	int read=0;
	int i=0;
	
//	Scanner scan= new Scanner(fis);
//	String temp =scan.nextLine();
//	
//	for(int i=0; i< temp.length(); i++) {
//	alphabet[i] = temp.charAt(i);
//	System.out.println(alphabet[i]);
//	} Scnner를 이용해서도 사용할수 있음
	
	while((read = fis.read()) != -1) {
		alphabet[i] = (char)read;
		i++;
	}fis.close();
	System.out.println("로드완료!");
	}
	//4
	{
	char temp = 0;
	for(int i=0;i<alphabet.length-1;i++) {
		for(int j=i+1;j<alphabet.length;j++) {
		if(alphabet[i]<alphabet[j]) {
		temp = alphabet[i];
		alphabet[i] = alphabet[j];
		alphabet[j] = temp;
		}
		}
	}
	System.out.println("자리정렬완료!");
	}
	//5
	FileOutputStream fos2 = new FileOutputStream("res/alphabet_out.txt");
	PrintStream out2 = new PrintStream(fos2);
	for(int i=0;i<alphabet.length;i++) {
	out2.printf("%c",alphabet[i]);
	if(i<13)
	out2.print(",");
	}
	}
}
