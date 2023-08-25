package com.kh.practice1;

public class Practice1<L, R> {
	private L left;
	private R right;

	public void set(L o, R r) {
		left = o;
		right = r;
	}

	@Override
	public String toString() {
		return left + " & " + right;
	}

	public static void main(String[] args) {
		Practice1 <String, Integer> box = new Practice1();
		box.set("Apple", 25);
		System.out.println(box);
	}
}
