package com.kh.practice1;
import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
//		list.add("맛있는 과일"); 코드를 지운다.
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
