package com.kh.Homework2_OOP;

public class SquareController {
	private Shape s;
	
	public SquareController() {
		s = new Shape();
	}
	
	public double calcPerimeter(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		double perimeter = (s.getHeight() * 2) + (s.getWidth() * 2);
		return perimeter;
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
		s.setType(4);
		return  "사각형 " + s.information() + " " + s.getColor();
	}
}
