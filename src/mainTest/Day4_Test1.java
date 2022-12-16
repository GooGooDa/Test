package mainTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Day4_Test1 {
public static void main(String[] args) throws IOException {
	int [][] map = new int [3][5];
	char [][] board = new char [6][10];
	int count = 0;
	String line;
	int read;
	FileInputStream fis = new FileInputStream("res/map.txt");
	Scanner sc = new Scanner(fis);
	
	while((read = fis.read())!=-1)
	line = sc.nextLine();
	
	System.out.println(line);
	
	
}
}
