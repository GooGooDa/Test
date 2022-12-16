package persnalTest;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class Day2_Test2P {
	public static void main(String[] args) throws IOException {

	      FileReader fr = new FileReader("res/bitmap.txt");
	      BufferedReader br = new BufferedReader(fr);

	      String str;
	      int count = 0; // 문장갯수
	      int count2 = 0;// 글자갯수

	      while ((str = br.readLine()) != null) {
	         count++; // 파일안에 문장 갯수확인
	         count2 = str.length(); // 문장안에 글자 갯수 확인
	      }

	      br.close();
	      fr.close();
	      System.out.println("데이터 읽어오기 완료.\nbitmap.txt에서 문장수 글자수 확인완료.");
	      System.out.printf("문장=%d줄 글자=%d개\n",count,count2);
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	      fr = new FileReader("res/bitmap.txt");
	      br = new BufferedReader(fr);
	      int i = 0;
	      String[] strArr = new String[count];
	      while ((str = br.readLine()) != null) {
	         strArr[i] = str; // strArr 에 한줄단위로 넣어줌
	         i++;
	      }
	      br.close();
	      fr.close();
	      System.out.println();
	      for (String k : strArr) {
	         System.out.println(k);
	      }
	      System.out.println("<파일에 있던 데이터 모습>");
	      System.out.println();
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	      int[][] bitmap = new int[count][count2]; // 확인한 문장,글자 수로 배열선언

	      char a; // strArr배열에서 char 타입으로 하나씩 뽑기위해 선언.

	      for (i = 0; i < strArr.length; i++) { // char 타입으로 하나씩 받은 후 int 타입으로변환
	         for (int j = 0; j < strArr[i].length(); j++) {
	            a = strArr[i].charAt(j);
	            bitmap[i][j] = a - '0';
	         }
	      }
	      System.out.println("데이터 타입 변환 완료.");
	      System.out.println();
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	      for (i = 0; i < bitmap.length; i++) { // 정렬
	         Arrays.sort(bitmap[i]);
	      }
	      System.out.println("<오름차순 정렬 완료>");
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	      FileOutputStream fos = new FileOutputStream("res/bitmap-out.txt");
	      PrintStream out = new PrintStream(fos);
	      for (i = 0; i < bitmap.length; i++) {
	         for (int j = 0; j < bitmap[0].length; j++) {
	            out.print(bitmap[i][j]);
	            System.out.print(bitmap[i][j]);
	         }System.out.println();
	         out.println();
	      }
	      out.close();
	      fos.close();
	      System.out.println("bitmap-out.txt 이름으로 파일 저장 완료.");
	   }
	}

