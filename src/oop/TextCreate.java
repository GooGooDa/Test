package oop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TextCreate {
public static void main(String[] args) throws FileNotFoundException {
	FileOutputStream fos = new FileOutputStream("res2/students.csv");
	PrintStream out = new PrintStream(fos);
	out.print("id,name\n"
			+"1,홍길동\n"
			+ "2,강감찬\n"
			+ "3,세종대왕\n"
			+ "4,이순신\n"
			+ "5,이방원\n"
			+ "6,이성계\n"
			+ "7,아이유\n"
			+ "8,유재석\n"
			+ "9,강호동\n"
			+ "10,김종국\n"
			+ "");
	
}
}
