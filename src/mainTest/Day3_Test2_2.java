package mainTest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Day3_Test2_2 {
public static void main(String[] args) throws IOException {
 char[][] bitmap = new char[10][20];
 int y_count =0;
 int x_count =0;
 int q = 0;
 FileOutputStream fos = new FileOutputStream("res/bitmap_out.txt");
 FileInputStream fis = new FileInputStream("res/bitmap.txt");
 Scanner scan = new Scanner(fis);
 PrintStream out = new PrintStream(fos);
 while((q = fis.read())!= -1) {
	 
			q = scan.nextInt();
	 
	 y_count++;
	 x_count++;
 }
 
 for(int y = 0;y<10;y++) {
	 for(int x = 0; x<20;x++) {
		 System.out.printf("%c" , bitmap[y][x]);
	 }
 }
 
 int temp = 0;

 
	 }
	

}
