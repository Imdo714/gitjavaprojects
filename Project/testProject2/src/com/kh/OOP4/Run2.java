package com.kh.OOP4;

public class Run2 {

	public static void main(String[] args) {
		Bird s = new Bird("독수리", 15);
		s.makeSound();
		s.fly();
		
		Fish a = new Fish("돌고래", 5);
		a.makeSound();
		a.swim();

	}

}
