package mainTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Day3_Test2_2 {
public static void main(String[] args) throws IOException {
FileInputStream fis = new FileInputStream("res/bitmap.txt");
Scanner sc = new Scanner(fis);
String line = sc.nextLine();


System.out.printf("%s" , line);

}
}
