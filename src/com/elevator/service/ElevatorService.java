package com.elevator.service;

import java.util.Scanner;

public class ElevatorService {
	Scanner sc = new Scanner(System.in);
	int now = 1;
	int[] floor = { 1, 2, 3 };
	int[] elevator = { -1, -1, -1, -1 };

	public void run() {
		boolean flag = true;
		while (flag) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.탑승  2.이동  3.탑승현황  4.종료");
			switch (sc.nextLine()) {
			case "1":
				join();
			case "2":
			case "3":
			case "9":

			}
		}
	}

	private void join() {
		int imp = 0;
		System.out.println("층 수를 선택해 주세요.");
		System.out.println("1층\t\t2층\t\t3층");
		//미완
		if(seatCheck()>0) {
			System.out.println("탑승가능");
		}else {
			System.out.println("탑승불가능");
		}
		String line = sc.nextLine();	
		int c = Integer.parseInt(line); 
	 	if(now != c) {
				System.out.print(floor[c-1]+"층\n"); 
	 	}else if(now == c) {
			System.out.println("목적지로 현재층은 안됩니다.");
	 	}
		String fInput = sc.nextLine();
		int temp = Integer.parseInt(fInput);
		// if(seatCheck())
		
	}
	
	
			 	

	private int seatCheck() {
	int cnt = 0;
		for (int i = 0; i < elevator.length; i++) {
			if(elevator[i]==-1) {
				cnt++;
				}
			}
	
	return cnt;
}
}
