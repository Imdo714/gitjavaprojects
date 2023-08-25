package com.kh.weekhomework;

public class Person {
	private String name; //����� �̸�
	private String phone; //��ȭ��ȣ
	private String birth; //�������
	private String id; //���̵�
	private String pw; //��й�ȣ
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
	
	//���� �����Ϳ� ���� set �Լ�
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
		
		//���� �����Ϳ� ���� get �Լ�
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
			System.out.println("���� ���̵� : " + id);
			System.out.println("���� �̸� : " + name);
			System.out.println("���� ���� : " + birth);
			System.out.println("���� �ݾ� : " + money);
			System.out.println("�� ��ȣ : " + phone);
			System.out.println("������ Ƽ�� ���� :" + ticket);
		}
}
