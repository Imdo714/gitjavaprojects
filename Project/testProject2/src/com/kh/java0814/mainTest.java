package com.kh.java0814;

public class mainTest {

	public static void main(String[] args) {
		CompFriend cf = new CompFriend("상원", "개발", "010-0000-0000");
		UnivFriend uf = new UnivFriend("태원", "전공", "010-0000-0000");
		
		cf.showInfo();
		uf.showInfo();
	}

}
