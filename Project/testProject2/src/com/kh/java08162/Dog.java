package com.kh.java08162;

public class Dog implements Animal {

	@Override
	public void eat(String food) {
		System.out.println(food + "가 너무 맛있다(멍멍)");
	}

	@Override
	public void move() {
		System.out.println("이동");
	}

}
