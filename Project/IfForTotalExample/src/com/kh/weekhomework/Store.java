package com.kh.weekhomework;

public class Store {
	String food;
	String juice;
	int price;
	
	public Store() {}
	
	public Store(String food, String juice, int price) {
		this.food = food;
		this.juice = juice;
		this.price = price;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public void setJuice(String juice) {
		this.juice = juice;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getFood() {
		return food;
	}
	public String getJuice() {
		return juice;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void foodPrice(String food) {
		if(getFood().equals(food))
			System.out.print(getFood() + "의 가격은 : " + getPrice());
		else
			System.out.print(getJuice() + "의 가격은 : " + getPrice());
	}
	
}
