package com.elevator.service;

import java.util.Scanner;

public class ElevatorService {

	String[] floor; // 층수
	String[] elevator;// 엘리베이터
	int maxElevator;// 만석수
	int arriveFloor;// 도착층
	int curFloor;// 현재층
	boolean direction;// 방향
	int order;// 입력바들때 배열 순서 정리를 위한 수.

	// 층수는 3개층
	// 엘리베이터 4명까지 탑승
	// 시작층으 1층부터 올라갔다 내려감

	public ElevatorService() {
		floor = new String[] { "0", "0", "0" };
		elevator = new String[] { "0", "0", "0", "0" };
		maxElevator = 4;
		curFloor = 1;
		direction = true;
		order = 0;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.printf("현재 층수는 %d 층 입니다. \n", curFloor);
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.탑승  2.이동  3.탑승현황  9.종료");
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
				System.out.println("운행을 종료합니다.");
				end();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");

			}
		}
	}

	public void join() {
		Scanner sc = new Scanner(System.in);
		int maxCount = 0;
		for (int i = 0; i < elevator.length; i++) {
			if (!elevator[i].equals("0"))
				maxCount++;
		}
		if (maxCount == maxElevator) {
			System.out.println("탑승할 공간이 없습니다.");
			return;
		}
		while (true) {
			System.out.println("================");
			System.out.println("층 수를 선택해 주세요");
			System.out.println("================");
			System.out.println("1.1층\t2.2층\t3.3층");
			int insertFloor = sc.nextInt();
			if (curFloor == insertFloor) {
				System.out.println("현재층은 입력할수없습니다.");
				continue;
			} else {
				elevator[order] = String.valueOf(insertFloor);
				System.out.printf("입력하신 층은 " + "%d" + "층입니다.\n", insertFloor);
				break;
			}
		}
		order++;
	}

	private void move() {
		order = 0;

		if (direction == true)
			curFloor++;
		else
			curFloor--;

		int outCount = 0;

		for (int i = 0; i < elevator.length; i++) {
			if (elevator[i].equals("0"))
				continue;
			else if (curFloor == Integer.parseInt(elevator[i])) {
				elevator[i] = "0";
				outCount++;
			}
		}

		for (int i = 0; i < 3; i++) 
			for (int j = 0; j < 2; j++) {
				if (!elevator[i].equals("O")) {
					String temp = elevator[i];
					elevator[i] = elevator[i + 1];
					elevator[i + 1] = temp;
				}
			}
		
			System.out.printf("%d" + "명이 하차하였습니다.\n", outCount);

			if (curFloor == 1 || curFloor == 3)
				direction = !direction;
		
	}

		public void status() {
			
			int count = 0; // 탑승 인원 세는 변수;
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			
			for(int i=0; i<elevator.length; i++) {
				if(!elevator[i].equals("O")) 
					count++;
				
				if(elevator[i].equals("1"))
					count1++;
				else if(elevator[i].equals("2"))
					count2++;
				else if(elevator[i].equals("3"))
					count3++;		
			}
			
			
			System.out.println("---- 탑승 현황 ----");
			System.out.printf("현재 탑승 인원은" + "%d" + "명 입니다.\n", count);
			System.out.printf("1층에서 내릴 인원은 %d명입니다.\n",count1);
			System.out.printf("2층에서 내릴 인원은 %d명입니다.\n",count2);
			System.out.printf("3층에서 내릴 인원은 %d명입니다.\n",count3);
			
	}

	private void end() {
		boolean flag = false;
	}
}
