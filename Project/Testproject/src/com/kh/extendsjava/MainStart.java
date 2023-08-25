package com.kh.extendsjava;

public class MainStart {

	public static void main(String[] args) {
		
		//객체를 생성할 때 상속받은 클레스(부모)가 있다면
//		Man choi = new Man();
//		choi.name = "ji";
//		choi.tellYourName();

		
		BusinessMan kim = new BusinessMan("KH", "강사", "최지원");
		kim.tellYourInfo();
//
//		kim.name = "choi";
//		kim.tellYourName();
//		kim.company = "KH"; 
//		kim.position = "신입";
//		kim.tellYourInfo();
	}

}
