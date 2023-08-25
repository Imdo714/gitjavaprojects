package com.kh.javai;

public class Human {
	//필드
	 String name;
	 int age;
	 char gender;
	 double height;
	 double weight;
	 
	 
	//생성자
	public Human() {}
	
	public Human(String n, int a, char g, double h, double w){
		name = n;
		age = a;
		gender = g;
		height = h;
		weight = w;
	}
	
	public void sprint() {
		System.out.println("안녕하세요");
		System.out.println("저의 이름은 " + name + " 나이가 " + age + "인" + gender + "자 입니다.");
		System.out.println("제 키는 " + height + "이고 몸무게는 " + weight + "입니다.");
	}
	
}
