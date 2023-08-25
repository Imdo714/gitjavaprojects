package com.kh.objectarray;

public class MemberController {
	private final int SIZE = 10;
	private Member[] m = new Member[SIZE];
	
	public int existMemberNum() {
		int num = 0;
		return num;
	}
	
	public boolean checkId(String inputId) {
		boolean isTrue = true;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(inputId)) {
				isTrue = false;
				break;
			}
		}
		return isTrue;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member();
				m[i].setId(id);
				m[i].setName(name);
				m[i].setPassword(password);
				m[i].setEmail(email);
				m[i].setGender(gender);
				m[i].setAge(age);
				break;
			}
		}
	}
	
	public String searchId(String id) {
		String str = "검색 결과가 없습니다.";
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				str =  id + "찾으신 회원 조회 결과입니다.";
				break;
			}
		}
		return str;
	}
	
	public String searchName(String name) {
		String str = "검색 결과가 없습니다.";
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)) {
				str =  name + "찾으신 회원 조회 결과입니다.";
				break;
			}
		}
		return str;
	}
	
	public String searchEmail(String email) {
		String str = "검색 결과가 없습니다.";
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getEmail().equals(email)) {
				str =  email + "을 찾았습니다.";
				break;
			}
		}
		return str;
	}
	
	public boolean updatePassword(String id, String password) {
		boolean isTrue = false;
		for(int i = 0; i < m.length ; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				isTrue = true;
				break;
			}
		}
		return isTrue;
	}
	public boolean updateName(String id, String name) {
		boolean isTrue = false;
		for(int i = 0; i < m.length ; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				isTrue = true;
				break;
			}
		}
		return isTrue;
	}
	
	public boolean updateEmail(String id, String email) {
		boolean isTrue = false;
		for(int i = 0; i < m.length ; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				isTrue = true;
				break;
			}
		}
		return isTrue;
	}
	
	public boolean delete(String id) {
		boolean isTrue = false;
		int i = 0;
		while(i < m.length) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
			}
			
			if(m[i] == null && i < m.length-1) {
				m[i] = m[i+1];
			}else if(i <= m.length-1){
				m[i-1] = m[i];
				break;
			}
			isTrue = true;
			i++;
			
		}
//		for(int i = 0; i < m.length ; i++) {
//			if(m[i] != null && m[i].getId().equals(id)) {
//				m[i] = null;
//				while(i < m.length - 1) {
//					m[i] = m[i+1];
//				}
//				isTrue = true;
//				break;
//			}
//		}
		return isTrue;
		
	}
	
	public void delete() {
		for(int i = 0; i < m.length ; i++) {
			if(m[i] == null) {
				break;
			}else
				m[i] = null;
		}
	}
	
	public Member[] printAll() {
		return m;
	}
}
