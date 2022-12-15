package persnalTest;

import java.util.Random;

public class RandomP {
public static void main(String[] args) {
	Random rand = new Random();
	int [] r = new int[10];
	
	for(int i=0;i<10;i++) {
		r[i] = rand.nextInt(10);
	for(int j=0;j<j;j++) {
		if(r[i] == r[j]) {
			i--;
		break;
		}
	}
	}
	}
}
