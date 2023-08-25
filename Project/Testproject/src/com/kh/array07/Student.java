package com.kh.array07;

public class Student {
	private String name;
	private String subject;
	private int score;
	
	public Student() {}
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	//setter
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public String inform() {
		String str = "이름 : "+ this.name + " / 과목 : " + this.subject + " / 점수 : " + this.score;
		return str;
	}
	
	
}
