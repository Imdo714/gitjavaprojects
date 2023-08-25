package com.kh.object;

public class SnackController {
	private Snack s;
	public SnackController() {
		s = new Snack();
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장완료";
	}
	
	public String confirmData() {
		
		return s.information();
	}
}
