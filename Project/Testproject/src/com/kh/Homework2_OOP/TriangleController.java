package com.kh.Homework2_OOP;

public class TriangleController {
	private Shape s;
	
	public TriangleController() {
		s = new Shape();
	}
	
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		double area = s.getHeight() * s.getWidth();
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		s.setType(3);
		return "삼각형" + s.information() + " " + s.getColor();
	}
}
