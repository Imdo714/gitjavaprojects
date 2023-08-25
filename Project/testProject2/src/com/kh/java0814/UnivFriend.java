package com.kh.java0814;

public class UnivFriend extends Friend {
	private String major;
	
	public UnivFriend(String na, String mj, String ph) {
		super(na,ph);
		major = mj;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
	}
}
