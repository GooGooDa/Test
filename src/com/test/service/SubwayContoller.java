package com.test.service;

import java.util.Scanner;

public class SubwayContoller{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		// 지하철 만들기
		// 역은 총 5개로 순환열차이다.(합정, 홍대입구, 신촌, 이대, 아현)
		// 차량은 총 4량, 각 차량당 탑승가능인원 4명
		// 탑승 시 목적지 지정. 목적지도착 시 자동하차
		// 이동시 1개역씩 이동
		
		SubwayService ss = new SubwayService();
		ss.run();
		

//		while(true) {



	switch(sc.nextLine()){
		case "1" : ss.join();
		break;
		case "2" : ss.status();
		break;
		case "3" : ss.move();
		break;
		case "9" : System.out.println("열차운행을 종료합니다.");
		break;
		default : System.out.println("잘못입력하였습니다.");
	}
}
}
	

