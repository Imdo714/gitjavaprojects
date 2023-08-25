package com.kh.objectarray;
import java.util.*;
public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	private int count = mc.existMemberNum();
	
	public void mainMenu() {
		while(true) {
			System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
			System.out.println("현재 등록된 수는 " + count +"명입니다.");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
				case 1: {
					insertMember();
				}break;
				case 2:{
					searchMember();
				}break;
				case 3: {
					updateMember();
				}break;
				case 4: {
					deleteMember();
				}break;
				case 5: {
					printAll();
				}break;
				case 9: {
					return;
				}
				default:{
					System.out.println("잘못입력하셨습니다. 다시입력하세요.");
				}
			}
		}
	}
	
	public void insertMember() {
		String id = null, name, password, email;
		char gender;
		int age;
		
		boolean isTrue = true;
		while(isTrue) {
			System.out.println();
			System.out.print("아이디 : ");
			id = sc.nextLine();
			if(mc.checkId(id) == true) {
				isTrue = false;
			}else
				System.out.println("중복된 아이디입니다. 다시입력하세요.");
		}
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		password = sc.nextLine();
		System.out.print("이메일 : ");
		email = sc.nextLine();
		while(true) {
			System.out.print("성별 : ");
			gender = sc.next().charAt(0);
			if((gender == 'm' || gender == 'M') || (gender == 'f' || gender == 'F')) {
				break;
			}else
				System.out.println("성별을 다시 입력하세여(m/M, f/F)");
		}
		sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, gender, age);
		count++;
	}
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		switch(num) {
			case 1: {
				serchId();
			}break;
			case 2: {
				serchName();
			}break;
			case 3: {
				serchEmail();
			}break;
			case 9: {
				System.out.println("메인으로 돌아갑니다.");
			}return;
			default:{
				System.out.println("잘못입력하셨습니다.");
				return;
			}
		}
	}
	public void serchId() {
		
		System.out.println("찾는 아이디 : ");
		String id =sc.nextLine();
		sc.nextLine();
		if(mc.searchId(id).equals("검색 결과가 없습니다.")) {
			return;
		}else {
			System.out.println("찾으신 회원 조회 결과 입니다.");
			System.out.println(mc.searchId(id).toString());
		}
		
	}
	public void serchName() {
		System.out.println("찾는 이름 : ");
		String name =sc.nextLine();
		if(mc.searchId(name).equals("검색 결과가 없습니다.")) {
			return;
		}else {
			System.out.println("찾으신 회원 조회 결과 입니다.");
			System.out.println(mc.searchId(name).toString());
		}
	}
	public void serchEmail() {
		System.out.println("찾는 이메일 : ");
		String email =sc.nextLine();
		if(mc.searchId(email).equals("검색 결과가 없습니다.")) {
			mainMenu();
		}else {
			System.out.println("찾으신 회원 조회 결과 입니다.");
			System.out.println(mc.searchId(email).toString());
		}
	}
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 :");
		int num = sc.nextInt();
		switch(num) {
			case 1: {
				updatePassword();
			}break;
			case 2:{
				updateName();
			}break;
			case 3:{
				updateEmail();
			}return;
			case 9:{
				return;
			}
			default:{
				System.out.println("잘못 입력하셧습니다.");
				mainMenu();
			}
		}
	}
	public void updatePassword() {
		System.out.print("비밀 번호를 수정할 아이디 : ");
		String id = sc.nextLine();
		sc.nextLine();
		System.out.print("수정할 비밀번호 : ");
		String password = sc.nextLine();
		if(mc.updatePassword(id, password) == false) {
			System.out.println("존재하지 않는 아이디입니다.");
			mainMenu();
		}else
			System.out.println("수정이 성공적으로 되었습니다.");
	}
	public void updateName() {
		System.out.print("이름을 수정할 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		if(mc.updateName(id, name) == false) {
			System.out.println("존재하지 않는 아이디입니다.");
			mainMenu();
		}else
			System.out.println("수정이 성공적으로 되었습니다.");
	}
	public void updateEmail() {
		System.out.print("이메일을 수정할 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이메일 : ");
		String email = sc.nextLine();
		if(mc.updateEmail(id, email) == false) {
			System.out.println("존재하지 않는 아이디입니다.");
		}else
			System.out.println("수정이 성공적으로 되었습니다.");
	}
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1: {
			deleteOne();
			
		}break;
		case 2: {
			deleteAll();
		}return;
		case 9: {
			System.out.println("메인으로 돌아갑니다.");
		}return;
		default:{
			System.out.println("잘못입력하셨습니다.");
		}return;
		}
	}
	public void deleteOne() {
		System.out.print("삭제할 회원의 id를 입력하세요 : ");
		String id = sc.nextLine();
		sc.nextLine();
		System.out.print("정말 삭제하실건가요?(y/Y 입력시 삭제) : ");
		char y = sc.next().charAt(0);
		if(y == 'y' || y == 'Y') {
			if(mc.delete(id) == true) {
				System.out.println("성공적으로 삭제하였습니다.");
				count--;
				mainMenu();
			}else {
				System.out.println("존재하지 않는 아이디 입니다.");
				mainMenu();
			}	
		}else {
			System.out.println("메인으로 돌아갑니다.");
			mainMenu();
		}
	}
	public void deleteAll() {
		mc.delete();
		count = 0;
	}
	public void printAll() {
		Member[] m = mc.printAll();
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				System.out.println(m[i].inform());
			}
		}
	}
}
