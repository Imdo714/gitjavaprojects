package com.kh.inheritance;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {}
	public Person(String name, int age, double height, double weight) {
		this.name = name == null ? "이름없음" : name;
		this.age = age <= 0 ? 0 : age;
		this.height = height <= 0 ? 0 : height;
		this.weight = weight <= 0 ? 0 : weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + this.name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
}
