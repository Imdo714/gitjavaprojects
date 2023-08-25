package com.kh.OOP4;

public class Run4 {

	public static void main(String[] args) {
		Human s = new Student("김김김", 15);
		s.makeSound();
		((Student)s).sleep();
		((Student)s).swim();
	}

}
