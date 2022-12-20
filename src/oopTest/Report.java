package oopTest;

import java.util.Scanner;

public class Report {
	private int[] kor = new int[3];
	private int[] eng = new int[3];
	private int[] math = new int[3];
	private int menu = 0;
	private int pick = 0;
	private int answer = 0;

	public void mainMenu() {
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              메인메뉴               │");
		System.out.println("└───────────────────────────────────┘");
		System.out.println("1. 성적입력");
		System.out.println("2. 파일입력");
		System.out.println("3. 성적출력");
		System.out.println("4. 저장");
		System.out.println("5. 종료");
		System.out.println(">");
	}
	public int answerLoop() {
		System.out.println("계속:1/종료:0");
		Scanner scan = new Scanner(System.in);
		int go = scan.nextInt();
		return go;
	}
	
	public void inputReport() {
		Scanner scan = new Scanner(System.in);

		System.out.print("┌──────────────────────────────┐\n");
		System.out.print("│           성적입력           │\n");
		System.out.print("└──────────────────────────────┘\n");
		for (int i = 0; i < 3; i++) {
			System.out.printf("<%d학년>\n" , i+1);
			System.out.printf("국어 :");
			do {
				kor[i] = scan.nextInt();
				if(kor[i] < 0 || kor[i] > 100)
				System.out.println("잘못된 입력입니다. 0~100까지의 수를 입력해주세요.");
			} while (kor[i] < 0 || kor[i] > 100);
			
			System.out.printf("영어 :");
			do {
				eng[i] = scan.nextInt();
				if(eng[i] < 0 || eng[i] > 100)
				System.out.println("잘못된 입력입니다. 0~100까지의 수를 입력해주세요.");
			} while (eng[i] < 0 || eng[i] > 100);
			
			System.out.printf("수학");
			do {
				math[i] = scan.nextInt();
				if(math[i] < 0 || math[i] > 100)
				System.out.println("잘못된 입력입니다. 0~100까지의 수를 입력해주세요.");
			}while(math[i]<0 || math[i]>100);
			
		System.out.println(kor[i] + eng[i] + math[i]);
		
		}
	}
	public int getMenu() {
		return menu;
	}
	public void setMenu(int menu) {
		this.menu = menu;
	}
	public int getPick() {
		return pick;
	}
	public void setPick(int pick) {
		this.pick = pick;
	}

	
	
}
