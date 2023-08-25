package com.kh.javab;

public class BorrowPerson {
	private String name; //회원 이름
	private String bookname; //빌리고 싶은 책
	private String date; //빌린 날짜
	private String returnDate; //돌려줄 날짜
	//기본생성자는 만들지 않음
	
	//생성자
	public BorrowPerson (String name, String bookname, String date, String returnDate) {
		this.name = name == null ? "이름없음" : name;
		this.bookname = bookname == null ? "이름없음" : bookname;
		this.date = date == null ? "이름없음" : date;
		this.returnDate = returnDate == null ? "이름없음" : returnDate;
	}
	//개터
	public String getName() {
		return this.name;
	}
	public String getBookName() {
		return this.bookname;
	}
	public String getDate() {
		return this.date;
	}
	public String getReturnDate() {
		return this.returnDate;
	}
	
	//새터
	public void setName(String name) {
		this.name = name == null ? "이름없음" : name;
	}
	public void setBookName(String bookname) {
		this.bookname = bookname == null ? "이름없음" : bookname;
	}
	public void setDate(String date) {
		this.date = date == null ? "이름없음" : date;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate == null ? "이름없음" : returnDate;
	}
	
}
