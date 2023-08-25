package com.kh.javap;
import java.util.*;
//pos의 전체적인 관리를 위한 class
public class POSSystem {
	Scanner sc = new Scanner(System.in);
	//외부에서 접근이 불가능한 pos 객체 생성
	private final static Customer[] CUSTOMER_LIST = new Customer[10];
	private static POSSystem posInstance = new POSSystem();
	
	private POSSystem() {}
	
	public static POSSystem getInstance() {
		return posInstance;
	}
	//pos 메뉴를 나타내주는 메서드
	public int printMenu() {
		System.out.println("=========================");
		System.out.println("1. 회원등록 ");
		System.out.println("2. 회원삭제 ");
		System.out.println("3. 회원목록출력 ");
		System.out.println("4. 로그인 ");
		System.out.println("=========================");
		System.out.print("원하시는 번호를 입력하세요. (다른 거 입력시 종료)");
		int i = sc.nextInt();
		return i;
	}
	//회원가입 정보입력받아 배열에 저장하는 메서드
	public void joinCustomer() {
			if(this.CUSTOMER_LIST[this.CUSTOMER_LIST.length - 1] != null) {
				System.out.println("더이상 회원을 등록할 수 없습니다.");
				return;
			}
			
			Customer newUser = insertCustomer();
			saveCustomer(newUser);
	}
	
	//회원가입 정보입력을 위한 메서드
	public Customer insertCustomer() {
		String name, id, password, email;
		System.out.print("아이디를 입력하세요. :");
		id = sc.next();
		System.out.print("비밀번호를 입력하세요. :");
		password = sc.next();
		System.out.print("이름을 입력하세요. :");
		name = sc.next();
		System.out.print("이메일을 입력하세요. :");
		email = sc.next();

		return new Customer(name, id, password, email);
	}
	
	
	//회원을 실제로 배열에 저장하는 메서드
	public void saveCustomer(Customer user) {
		for(int i = 0; i < this.CUSTOMER_LIST.length; i++) {
			if(this.CUSTOMER_LIST[i] == null) {
				this.CUSTOMER_LIST[i] = user;
				
				System.out.println(this.CUSTOMER_LIST[i].toString());
				System.out.println("회원정보가 정상적으로 등록되었습니다.");
				break;
			}
		}
	}
	//회원을 삭제
	public void deleteLastCustomer() {
		for(int i = this.CUSTOMER_LIST.length - 1; i >= 0; i--) { //1 ,2,3,4,5,6,7,8,9
			if(this.CUSTOMER_LIST[i] != null) {
				System.out.println(this.CUSTOMER_LIST[i].getName() + "회원을 삭제했습니다.");
				this.CUSTOMER_LIST[i] = null;
				break;
			}
		}
	}
	//회원목록출력
	public void viewCustomerList() {
		System.out.println("이름\t아이디\t비밀번호\t이메일");
		for(int i = 0; i < this.CUSTOMER_LIST.length; i++) {
			if(this.CUSTOMER_LIST[i] != null) {
				System.out.println(this.CUSTOMER_LIST[i].toString());
			}else
				break;
		}
	}
	
	//회원 로그인
	public void customerLogin() {
		Customer loginCustomer;
		
		String id, password;
		
		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("비밀번호 : ");
		password = sc.next();
		
		int i = 0;
		while(i < this.CUSTOMER_LIST.length) {
			if(this.CUSTOMER_LIST[i] == null) {
				System.out.println("등록된 회원정보를 찾을 수 없습니다.");
				break;
			}else if(this.CUSTOMER_LIST[i].equals(id, password)) {
				loginCustomer = this.CUSTOMER_LIST[i];
				System.out.println("로그인 성공");
				break;
			}else if(this.CUSTOMER_LIST[i].idChk(id)) {
				System.out.println("비밀번호가 틀렸습니다.");
				break;
			}else if(i == this.CUSTOMER_LIST.length - 1) {
				System.out.println("등록된 회원정보를 찾을 수 없습니다.");
				break;
			}
			i++;
		}
	}
	
	
}
