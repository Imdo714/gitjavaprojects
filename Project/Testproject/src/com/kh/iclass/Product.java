package com.kh.iclass;

public class Product {
	private String menu; //메뉴
	private int price; //가격
	private String description; //설명
	private String size; //크기
	private String temperature; //온도 ice, hot
	
	private int count; //재고
	private final int MAX = 50;
	
	public Product(String menu, int price, String description, String size, String temperature) {
		this.menu = menu == null ? "이름없음" : menu;
		this.price = price < 0 ? 0 : price;
		this.description = description == null ? "이름없음" : description;
		this.size = size == null ? "이름없음" : size;
		this.temperature = temperature == null ? "이름없음" : temperature;
		this.count = MAX;
	}
	//게터
	public String getMenu() {
		return this.menu;
	}
	public int getPrice() {
		return this.price;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public String getTemperature() {
		return this.temperature;
	}
	
	
	public void setMenu(String menu) {
		this.menu = menu == null ? "이름없음" : menu ;
	}
	
	public void setPrice(int price) {
		this.price = price < 0 ? 0 : price;
	}
	
	public void setDescription(String description) {
		this.description = description == null ? "이름없음" : description;
	}
	
	public void setSize(String size) {
		this.size = size == null ? "이름없음" : size;
	}
	
	public void setTemperature(String temperature) {
		this.temperature = temperature == null ? "이름없음" : temperature;
	}
	
	public String toString() {
		String str = this.menu + " " + this.price + " " + this.size + " " + this.temperature +"\t" + this.description;
		return str;
	}

}
