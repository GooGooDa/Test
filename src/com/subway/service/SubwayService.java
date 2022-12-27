package com.subway.service;

import java.util.Scanner;

public class SubwayService {
String[] station = {"합정", "홍대입구", "신촌", "이대", "아현"};
int now = 0; //현재위치
int [][] trail = {{-1,-1,-1,-1}, //1호차
				  {-1,-1,-1,-1}, //2호차
				  {-1,-1,-1,-1}, //3호차
				  {-1,-1,-1,-1}}; //4호차
	int pos = -1; //방향전환 함수
	Scanner sc = new Scanner(System.in);
	
	public void run() {
	boolean flag = true;
	
	while(flag) {
		System.out.println("---- Welcome Subway ----");
		System.out.println("=================================");
     	System.out.println("현재역은" + station[now] + "입니다.");
		System.out.println("=================================");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.탑승 2.상세보기 3.이동 9.종료");
	
		switch(sc.nextLine()) {
		case "1" : join(); //탑승
		break;
		case "2" : status(); //상태
		break;
		case "3" : move();//이동
		break;
		case "9" : flag = false;
		System.out.println("열차운행을 종료합니다."); //종료
			break;
		default : System.out.println("잘못입력하셨습니다.");	
		}
	
	}
}
	public void join() {
		int imp = 0; //빈자리가 없는 갯수
		System.out.println("-----탑승 가능 현황-----");
		for(int i = 0; i < trail.length; i++) {
			System.out.print((i + 1) + "호차 : ");
			if(checkTrail(i) > 0) { 
				System.out.println("가능");
		} else {
			System.out.println("불가능");
			imp++; //빈자리가 없을 때  1씩 올라간다.
			}
		}
		//imp 와 trail.length길이 같다는 뜻은 4==4란 뜻인데
		//자리가 4자리이기때문에 빈자리가 없다는 말이다.
			if(imp == trail.length) { 
			//빈자리없는 개수 == 지하철 자리 4칸 즉, 빈자리가 없다. 
				System.out.println("탑승가능 열차가 없습니다.");
				} else { //빈자리가 비어있는 경우
					System.out.println("어느 열차에 탑승하시겠습니까?");
					
				for(int i = 0; i < trail.length; i++) {
					System.out.print((i+1)+ "."+ (i+1)+ "호차");
				}
				System.out.println(); //띄어쓰기
				}
			String input = sc.nextLine();
			int t = Integer.parseInt(input) -1; 
		   //지하철호차 도 0부터 시작하기 때문에 -1해줘야 내가 원하는 호차 선택가능 
			if(checkTrail(t)> 0) { //빈자리개수 >0  
				System.out.println("목적지를 선택해 주세요");
		           // 합정  = 0, 홍대입구 = 1, 신촌 = 2, 홍대입구 = 3, 아현 = 4
				for(int i = 0; i <station.length; i++) {
					if(now != i) { 
		       //현재위치와 목적지가 다르면 조건 성립, 같은 위치면 조건문이 false이다.
					System.out.print((i+1) + "." + station[i]+ " ");
							}
						}
			}
			System.out.println();
			String input2 = sc.nextLine(); //목적지 설정
			int s = Integer.parseInt(input2)-1; 
		    	//목적지 인덱스 값 0부터시작해서 -1
						
			if(s == now) {
				System.out.println("목적지로 현재역은 안됩니다.");
					} else {
				for(int i= 0; i < trail[t].length; i++) {
					if(trail[t][i] == -1) {//호차의 빈자리 체크
						trail[t][i] = s;
					break; //한번에 한명씩 탑승 break;를 걸어줘야한다.
							}
						}
					}
				} 
	
	public void status() {
		System.out.println("------열차현황------");
			//1호차 = 0 2호차 = 1 3호차 = 2 4호차 = 3 
			for(int i= 0; i < trail.length; i++) {
			System.out.println((i+1) + "호차 : ");
			for(int j : trail[i]) {//목적지 표시
			if(j > -1) {
	      // 합정  = 0, 홍대입구 = 1, 신촌 = 2, 홍대입구 = 3, 아현 = 4
			System.out.print("["+ station[j] + "]");
						}
					}
					System.out.println();
				}
	}
	
	public void move() {
		
		if(now == station.length -1 || now ==0) {
			pos*= -1; // now 0일때 pos는 -1  곱한결과 1
					}	
	          // now 4일때 pos는 1 그래서 곱한결과 -1
					
			now += pos;
		//장승백이 =0 연신내 =1 강남=2 양재 =3 평택=4
		int cnt = 0; //하차 수 카운트
		for(int i = 0; i< trail.length; i++) {//각 호차
			for(int j =0; j < trail[i].length; j++) {
	            		//호차별 자리 
				if(trail[i][j] == now) {
					cnt++; 
	                //배열속의 값이 역의 인덱스 값과 같으면 하차
					trail[i][j] = -1; //내려서 다시 빈자리 -1
						}
					}
				}
					
				if(cnt > 0) {
				System.out.println(cnt + "명이 하차하였습니다.");
					}
				}
	
	
	public int checkTrail(int num) {
		int cnt = 0;
		
		for(int target : trail[num]) {
			if(target == -1) {//-1빈자리 카운트
				cnt++;	
			}
		}
		return cnt;
	}
}
