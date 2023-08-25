package com.kh.weekhomework;

public class Person {
	private String name; //사용자 이름
	private String phone; //전화번호
	private String birth; //생년월일
	private String id; //아이디
	private String pw; //비밀번호
	int money;
	int ticket;
	
	Person() {
		this.name = null;
		this.phone = null;
		this.birth = null;
		this.id = null;
		this.pw = null;
		this.money = 0;
	}
	
	Person(String name, String phone, String birth, String id, String pw, int money) {
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		this.id = id;
		this.pw = pw;
		this.money = money;
	}
	
	//각각 데이터에 대한 set 함수
		void setName(String name) {
			this.name = name;
		}
		
		void setPhone(String phone) {
			this.phone = phone;
		}
		
		void setBirth(String birth) {
			this.birth = birth;
		}
		
		void setId(String id) {
			this.id = id;
		}
		
		void setPw(String pw) {
			this.pw = pw;
		}
		
		void setMoney(int money) {
			this.money = money;
		}
		
		//각각 데이터에 대한 get 함수
		String getName() {
			return name;
		}
		
		String getPhone() {
			return phone;
		}
		
		String getBirth() {
			return birth;
		}
		
		String getId() {
			return id;
		}
		int getMoney() {
			return money;
		}
		
		public void personInfo() {
			System.out.println("고객의 아이디 : " + id);
			System.out.println("고객의 이름 : " + name);
			System.out.println("고객의 생일 : " + birth);
			System.out.println("남은 금액 : " + money);
			System.out.println("폰 번호 : " + phone);
			System.out.println("구매한 티켓 개수 :" + ticket);
		}
}
