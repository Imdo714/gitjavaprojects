package com.kh.List;

import java.util.*;
public class Run {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Boy");
		list.add("Robat");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();
		
		list.remove(0);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();
	}

}
