package com.kh.practice1;

public class Practice2<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
	
	public static void main(String[] args) {
		Practice2<Integer> iBox = new Practice2();
		iBox.set(125);
		int num = iBox.get();
		System.out.println(num);
	}
}
