package com.kh.javap;

public class Customer {
	private String name;
	private String id;
	private String password;
	private String email;
	
	public Customer(String name, String id, String password, String email) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public String getID() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		String str = this.name + "\t" + this.id + "\t" + this.password + "\t" + this.email;
		return  str;
	}
	
	public boolean idChk(String id) {
		return (this.id.equals(id));
	}
	public boolean passChk(String password) {
		return (this.password.equals(password));
	}
	public boolean equals(String id, String password) {
		return (this.id.equals(id) && this.password.equals(password));
	}
	
	

}
