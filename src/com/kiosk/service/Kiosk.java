package com.kiosk.service;

public class Kiosk {
	private int money;
	private boolean mode; //true
	private String[] menu;
	
	public void wellcome() {
		System.out.println("안녕하세요~ 무인카페입니다.");
		System.out.println("닉네임을 입력하시고 주문해주세요~");
		
	}
	
		public Kiosk (int money) {
		this.money = money;
	}

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		public boolean isMode() {
			return mode;
		}

		public void setMode(boolean mode) {
			this.mode = mode;
		}

		public String[] getMenu() {
			return menu;
		}

		public void setMenu(String[] menu) {
			this.menu = menu;
		}
	
	
	
}
