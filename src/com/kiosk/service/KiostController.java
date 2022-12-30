package com.kiosk.service;

public class KiostController {
public static void main(String[] args) {
	String[] menu = {"아이스아메리카노" , "복숭아아이스티","딸기스무디","카푸치노","캬라멜마키아또"}; 
	Kiosk kiosk = new Kiosk(0);
	
	kiosk.setMenu(menu);
	kiosk.wellcome();
}
}
