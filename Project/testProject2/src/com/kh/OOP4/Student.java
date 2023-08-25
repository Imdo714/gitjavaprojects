package com.kh.OOP4;

public class Student extends Human implements Swimmable, sleepable{
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public void makeSound() {
		System.out.println("저는 " + super.name + "이고" + super.age + "살 입니다.");
	}
	public void swim() {
		System.out.println(super.name + "님은 수영을 합니다.");
	}
	
	public void sleep() {
		System.out.println(super.name + "님은 잠을 잡니다.");
	}
}
