package com.kh.javai;
public class MainStart {
	
	public void eat(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Human human =new Human("아무개", 45, '남', 185, 80);
		human.sprint();
	}
}
