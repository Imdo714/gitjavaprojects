package com.kh.OOP2;

public class RectangleController {
	private Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);

		int area = width * height;
		return r.toString() + " / " + area;
	}

	public String calcPerimeter(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);

		int perimeter = 2 * (width + height);
		return "둘레 : " + r.toString() + " / " + perimeter;
	}
}
