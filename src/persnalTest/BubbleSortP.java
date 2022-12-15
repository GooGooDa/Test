package persnalTest;

import java.util.Random;

public class BubbleSortP {
	public static void main(String[] args) {
		Random rand = new Random();
//	int r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
//	r1 = rand.nextInt(10);
//	r2 = rand.nextInt(10);
//	r3 = rand.nextInt(10);
//	r4 = rand.nextInt(10);
//	r5 = rand.nextInt(10);
//	r6 = rand.nextInt(10);
//	r7 = rand.nextInt(10);
//	r8 = rand.nextInt(10);
//	r9 = rand.nextInt(10);
//	r10 = rand.nextInt(10);

		int[] r = new int[100];
		for (int i = 0; i < r.length; i++) {
			r[i] = rand.nextInt(100);
			//r의 length만큼 랜덤값 생성 i==1
		for (int j = 0; j < i; j++) {
			//j==0 < i==1 r[i]의 값과  == 1 , r[j]값을 비교 ==0
			//만약 중복값이 발생한다면 i를 -1하고 2중for문 j를 빠져나가 무한반복
			//결국 중복값이 없을때 까지 i보다 작게반복 중복값이 없어지면 랜덤값 생성과 함께 탈출
			if (r[i] == r[j]) {
				i--;
				break;
			}
		}
		}

		int temp = 0;

		for (int i = 0; i < r.length; i++) {
			System.out.printf("%d", r[i]);
			if (i < 99)
				System.out.print(",");
		}
		System.out.println();

		for (int j = 0; j < 100 - 1; j++) {
			for (int i = 0; i < 100 - 1 - j; i++)
				if (r[i] > r[i + 1]) {
					temp = r[i];
					r[i] = r[i + 1];
					r[i + 1] = temp;
				}
		}

		for (int i = 0; i < r.length; i++) {
			System.out.printf("%d", r[i]);
			if (i < 99)
				System.out.print(",");
		}
		// 버블정렬 랜덤테스트 중복값 제거
	}
}
