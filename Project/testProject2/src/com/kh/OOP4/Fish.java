package com.kh.OOP4;

public class Fish extends Animal implements Swimmable {
	
	public Fish(String name, int age) {
		super(name,age);
	}
	@Override
	public void makeSound() {
		System.out.println(this.name + "가 물에서 울고 있습니다.");
	}
	@Override
	public void swim() {
		System.out.println(this.name + "가 물에서 헤엄친다.");
	}
	
}
