package com.kh.weekhomework;

public class Cinema {
	Person person;
	Menu menu;
	int ticket;
	int capital;
	
	public Cinema() {}
	public Cinema(Person person, Menu menu, int ticket, int capital) {
		this.person = person;
		this.menu = menu;
		this.ticket = ticket;
		this.capital = capital;
	}
	
	

	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	public int getCapital() {
		return capital;
	}
	
	public void buyTicket(int ticket) {
		if(capital < 0) {
			capital = 0;
			return;
		}
		person.ticket += ticket;
		capital  += menu.getCash() * ticket;
		person.money -= menu.getCash() * ticket;
		menu.seat -= ticket;
		this.ticket -= ticket;
	}
	public void refundTicket(int ticket) {
		if(capital < 0) {
			capital = 0;
			return;
		}
		person.ticket -= ticket;
		capital  -= menu.getCash() * ticket;
		person.money += menu.getCash() * ticket;
		menu.seat += ticket;
		this.ticket += ticket;
	}
	
	public void reservationInfo() {
		System.out.println("영화 정보: " + menu.getTitle());
		System.out.println("영화 날짜: " + menu.getDate());
		System.out.println("결제한 아이디: " + person.getId());
		System.out.println("남은 티켓 : " + ticket);
		System.out.println("남은 좌석: " + menu.getSeat());
	
	}
	
	
	
	
}
