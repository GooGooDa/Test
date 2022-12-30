package com.kiosk.service;

public class Guest {
	private int money;
	private String nick;
	
	public Guest(int money , String nick) {
		this.money = money;
		this.nick = nick;
	}
	public int SpendMoney() {
	return 0;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

}
