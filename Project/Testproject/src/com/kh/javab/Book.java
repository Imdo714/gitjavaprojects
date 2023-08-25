package com.kh.javab;

public class Book {
	//필드
	public static int count; //책 권수
	
	private String bookName; //책 이름
	private String date; // 발행날짜
	private	String author; // 책 저자
	private int pageNumber; // 책쪽수
	
	public Book(String bookName, String date, String author, int pageNumber) {
		this.bookName = bookName;
		this.date = date;
		this.author = author;
		this.pageNumber = pageNumber;
	}
	//새터
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	//개터
	public String getBookName() {
		return bookName;
	}
	public String getDate() {
		return date;
	}
	public String getAuthor() {
		return author;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	//출력
	public String toStirng() {
		String str = "책 이름 : " + bookName + "\n" + "날 짜 : " + date 
				+ "\n저 자 :" + author + "\n쪽 수 : " + pageNumber;
		return str;
	}
	
	//객체 비교 함수
	public boolean bookEquals(Book book) {
		return (this.bookName.equals(book.bookName));
	}
}
