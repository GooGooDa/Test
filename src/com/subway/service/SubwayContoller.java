package com.subway.service;
public class SubwayContoller {

	public static void main(String[] args) {
		SubwayService ss = new SubwayService(); 
        //객체생성,ss는 주소값만 품고 있다.
		System.out.println("---- Welcome Subway ----");
		
		ss.run(); //메소드 실행 
	}


}