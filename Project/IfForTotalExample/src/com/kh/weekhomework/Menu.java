package com.kh.weekhomework;

public class Menu {
	private String title; //��ȭ ����
	private String date; //��ȭ ��¥
	int seat; // ���� �¼�
	private int cash; // ���� �ݾ�;
	
	public Menu() {}
	public Menu(String title, String date, int seat, int cash) {
		this.title = title;
		this.date = date;
		this.seat = seat;
		this.cash = cash;
	}
	
	//����
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
	
	//����
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
