package com.kh.java08162;

public class Cat implements Animal {
	@Override
	public void eat(String food) {
		System.out.println(food + "를 먹는다.");
	}
	@Override
	public void move() {
		System.out.println("이동한다.");
	}
}
