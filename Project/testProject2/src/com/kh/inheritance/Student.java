package com.kh.inheritance;

public class Student extends Person {
	private int grade; //학년
	private String major; //전공
	
	public Student() {}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade <= 0 ? 0 : grade;
		this.major = major == null ? "이름없음" : major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + " toString()= " + super.toString() +"]";
	}
	
	
}
