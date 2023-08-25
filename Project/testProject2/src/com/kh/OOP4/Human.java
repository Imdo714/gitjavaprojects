package com.kh.OOP4;

public abstract class Human {
	protected String name;
	protected int age;
	
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public abstract void makeSound();
	
}
