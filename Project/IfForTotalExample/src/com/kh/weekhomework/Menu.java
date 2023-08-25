package com.kh.weekhomework;

public class Menu {
	private String title; //영화 제목
	private String date; //영화 날짜
	int seat; // 남은 좌석
	private int cash; // 결제 금액;
	
	public Menu() {}
	public Menu(String title, String date, int seat, int cash) {
		this.title = title;
		this.date = date;
		this.seat = seat;
		this.cash = cash;
	}
	
	//세터
	public void setTitle (String title) {
		this.title = title;
	}
	
	public void setDate (String date) {
		this.date = date;
	}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public void setCash(int cash) {
		this.cash = cash;
	}
	
	//게터
	public String getTitle() {
		return title;
	}
	public String getDate() {
		return date;
	}
	
	public int getSeat() {
		return seat;
	}
	public int getCash() {
		return cash;
	}
	
}
