package PersnalTest;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Day3_Test2 {
public static void main(String[] args) throws FileNotFoundException {
	File F = new File("res/bitmap.txt");
	int [][] multiArr = new int [10][20];
	
	FileOutputStream fos = new FileOutputStream("res/bitmap_out.txt");
	  PrintStream out = new PrintStream(fos);
	  {
		  int x_count = 9;
		  int y_count = 0;
	  
	for(int y=0;y<10;y++) {
		for(int x=0;x<20;x++) {
		if(multiArr[y_count][x_count] !=  multiArr[y][x]) {
		multiArr [y][x] = 0; 
		}
		else {
			multiArr [y][x] = 1;
		}
		out.printf("%d" , multiArr[y][x]);
		}out.println("");
		x_count--;
		y_count++;
	} ;//0 && 1입력작업 
}
//	{
//		int x_count = 9;
//		int y_count = 0;	
//	for(int y=0;y<10;y++) {
//		for(int x=0;x<20;x++) {
//			if(multiArr[y_count][x_count] !=  multiArr[y][x]) {
//				multiArr [y][x] = 1; 
//			}
//			else {
//				multiArr [y][x] = 0;
//			}
//			out.printf("%d" , multiArr[y][x]);
//		}out.println("");
//		x_count++;
//		y_count--;
//	} ;//0 && 1입력작업 
//}

}
}
