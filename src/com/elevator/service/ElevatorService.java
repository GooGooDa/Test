package com.elevator.service;

import java.util.Scanner;
public class ElevatorService {
	Scanner sc = new Scanner(System.in);
	int now = 1;
	int[] floor = { 1, 2, 3 };
	int[] elevator = { 0, 0, 0, 0 };

	public void run() {
		boolean flag = true;
		while (flag) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.탑승  2.이동  3.탑승현황  4.종료");
			switch (sc.nextLine()) {
			case "1":
				join();
				break;
			case "2":
				move();
				break;
			case "3":
				status();
				break;
			case "9":
				end();
				break;

			}
		}
	}

	private void move() {
	System.out.println("현재 층수는" + now +" 층 입니다.");	
	}
	

	private void status() {
		
	}

	private void end() {	
		boolean flag = false;
	}

	private void join() {
		int humen = 0; 
		int targetFloor = 0;
		int c = 0;
		do {
		System.out.println("층 수를 선택해 주세요.");
		System.out.println("1층\t\t2층\t\t3층");
		//미완
		if(seatCheck()>0) {
			System.out.println("탑승가능");
		}else {
			System.out.println("탑승불가능");
		}

		c = sc.nextInt();
	 	if(now != c) {
				System.out.print(floor[c-1]+"층을 선택하셨습니다.\n"); 
	 	humen++;
	 	}
	 	else if(now == c) {
			System.out.println("목적지로 현재층은 안됩니다.");
	 	}
				}while(now == c);
		if(humen == elevator.length) {
			System.out.println("엘리베이터에 자리가 없습니다. 나중에 탑승해주세요.");
		}else {
			targetFloor = c;
		}
	}
	

	private int seatCheck() {
		int cnt = 0;
		for (int i = 0; i < elevator.length; i++) {
			if (elevator[i] == 0) {
				cnt++;
			}
		}

		return cnt;
	}
}
