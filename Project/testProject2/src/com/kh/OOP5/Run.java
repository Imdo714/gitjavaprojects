package com.kh.OOP5;

public class Run {

	public static void main(String[] args) {
		Box<Integer> aBox = new Box<>();
		Box<Double> oBox = new Box<Double>();
		
		aBox.set(3);
		oBox.set(5.3);
		
		Integer ap = aBox.get();
		Double og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}
}
