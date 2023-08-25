package com.kh.OOP6;

public class Run {
	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.makeBox("Sweet");
		Box<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(sBox.get());
		String str = sBox.get();
		System.out.println(str);
		
	}
}
