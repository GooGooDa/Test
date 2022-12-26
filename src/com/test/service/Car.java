package com.test.service;

public class Car {
	private int now;
	private int[][] seat = new int[4][4];

	public int getNow() {
		return now;
	}
	public void setNow(int now) {
		this.now = now;
	}
	public int[][] getSeat() {
		return seat;
	}
	public void setSeat(int[][] seat) {
		this.seat = seat;
	}



}