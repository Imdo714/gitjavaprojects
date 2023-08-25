package com.kh.objectarray;

public class Member {
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;
	
	public Member() {}
	
	public Member(String id, String name, String password, String email, char gender, int age) {
		this.id = id == null ? "아이디없음" : id;
		this.name = name == null ? "이름없음" : name;
		this.password = password == null ? "비번없음" : password;
		this.email = email == null ? "이메일없음" : email;
		this.gender = gender;
		this.age = age <= 0 ? 0 : age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? "아이디없음" : id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? "이름없음" : name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? "비번없음" : password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? "이메일없음" : email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age <= 0 ? 0 : age;
	}
	
	public String inform() {
		String str = "id : " + this.id + " name : " + this.name + " \npassword : " 
					+ this.password + " email : " + this.email + "\ngender : " + this.gender + " age : " + this.age;
		
		return str;
	}
}
