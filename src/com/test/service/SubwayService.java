package com.test.service;

public class SubwayService extends Car{
	public void run() {
		boolean goStop = true;
		while(goStop);
		
		Station stations = new Station();
		Car[] cars = new Car[4];
		for(int i=0;i<4;i++) {
			cars[i] = new Car();
		}
		System.out.println("---- Welcome Subway ----");
		System.out.println("=================================");
     	System.out.println("현재역은" + "입니다.");
		System.out.println("=================================");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.탑승 2.상세보기 3.이동 9.종료");
		}
	

	public String join() {
		System.out.println("---- 탑승가능 현황 ----");
		System.out.print( + "호차 : ");
		System.out.println("가능");
		System.out.println("불가능");
		System.out.println("탑승가능 열차가 없습니다.");
//		System.out.print(+ "." + + "호차 ");
		System.out.println("목적지를 선택해 주세요.");
		System.out.println("목적지로 현재역은 안됩니다.");
		System.out.println("탑승이 불가능합니다.");
//		.out.print("[" + + "]");
//		System.out.println(cnt + "명이 하차하였습니다.");

		return null;
	}

	public String move() {
		return null;
	}

	public String status() {
		return null;
	}
}
