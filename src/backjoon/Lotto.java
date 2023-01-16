package backjoon;

import java.util.Random;

public class Lotto {

	public Lotto() {

	}

	public int generateNumber() {
		Random rand = new Random();
		int ran = rand.nextInt(49) + 1;
		return ran;
	}

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		int[] lottoN = new int[6];
		for (int i = 0; i < 6; i++) {
			lottoN[i] = lotto.generateNumber();
			System.out.printf("%d ", lottoN[i]);
		}
	}
}
