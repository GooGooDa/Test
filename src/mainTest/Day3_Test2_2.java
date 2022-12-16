package mainTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Day3_Test2_2 {
public static void main(String[] args) throws IOException {
int[][] bitmap = new int[10][20];

// 코드를 작성하는 공간
FileInputStream fis = new FileInputStream("res/bitmap.txt");
Scanner scan = new Scanner(fis);	

	for(int i=0; i<bitmap.length;i++) {		
	String read = scan.nextLine();
		for(int j=0;j<bitmap[i].length;j++) {
			bitmap[i][j]= Integer.parseInt(read.substring(j, j+1));
			}
	}
		
//		for(int y=0;y<bitmap.length;y++) {
//			for(int x=0;x<bitmap[y].length;x++) {
//				for(int z = 0;z<bitmap[y][x-1];z++) {
//					if(bitmap[x][y] > bitmap[x][y+1])
//						
//				}
//			}
//		}
		{
		for(int n=0; n<bitmap.length;n++)
			for(int i=0; i<bitmap.length;i++) {		
				for(int j=0;j<bitmap[i].length-1;    j++ ) {
					if(bitmap[i][j]>bitmap[i][j+1]) {
						int temp = bitmap[i][j];
						bitmap[i][j]=bitmap[i][j+1];
						bitmap[i][j+1]=temp;					
						}
				}
	}

}
}
}
