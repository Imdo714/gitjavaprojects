package com.kh.javap;
import java.util.*;
public class IdPass {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		POSSystem pos = POSSystem.getInstance(); //singleton
		
		boolean isLoop = true;
		while(isLoop) {
			switch(pos.printMenu()) {
				case 1:{//회원 등록
					pos.joinCustomer();
				}break;
				case 2:{ //회원 삭제
					pos.deleteLastCustomer();
				}break;
				case 3:{ //회원 목록출력
					pos.viewCustomerList();
				}break;
				case 4:{//로그인
					pos.customerLogin();
				}break;
				default:
					isLoop = false;
			}
		}
		
		
		
//		Customer[] customer = new Customer[10];
//		customer[0] = new Customer ("최상원", "myID", "myPassword12", "asd123@.com");
		//--------------------회원삭제--------------------
		//마지막으로 등록된 회원을 삭제
		
//		for(int i = 1; i < customer.length; i++) { //1 ,2,3,4,5,6,7,8,9
//			if(customer[i] == null && i != 0) { //1 ,2, 3,4,5,6,7,8,9
//				customer[i-1] = null;  //0,1,2,3,4,5,6,7,8
//				break;
//			} else if(i == customer.length - 1) {
//				customer[i] = null;
//			}
//		}
//		//역순
//		for(int i = customer.length - 1; i >= 0; i--) { //1 ,2,3,4,5,6,7,8,9
//			if(customer[i] != null) {
//				customer[i] = null;
//				break;
//			}
//		}
		// ------------------------모든 회원 출력 -----------------------------
//		System.out.println("이름\t아이디\t비밀번호\t이메일");
//		for(int i = 0; i < customer.length; i++) {
//			if(customer[i] != null) {
//				System.out.println(customer[i].toString());
//			}else
//				break;
//		}
		
		//----------------------------회원 가입-----------------------------
		//id, password, name, email을 입력받아 Customer객체를 추가해보자
//		for(int i = 0; i < customer.length; i++) {
//			if(customer[i] == null) {
//				String name, id, password, email;
//				System.out.print("아이디를 입력하세요. :");
//				id = sc.next();
//				System.out.print("비밀번호를 입력하세요. :");
//				password = sc.next();
//				System.out.print("이름을 입력하세요. :");
//				name = sc.next();
//				System.out.print("이메일을 입력하세요. :");
//				email = sc.next();
//				customer[i] = new Customer(name, id, password, email);
//				System.out.println(customer[i].toString());
//				System.out.println("회원정보가 정상적으로 등록되었습니다.");
//				break;
//			}else if(i == customer.length - 1) {
//				System.out.println("더이상 회원을 등록할 수 없습니다.");
//			}
//		}
		
		//-----------------------로그인--------------------------------------
//		Customer loginCustomer;
//		
//		String id, password;
//		
//		System.out.print("아이디 : ");
//		id = sc.next();
//		System.out.print("비밀번호 : ");
//		password = sc.next();
//		
//		String str = "";
//		int i = 0;
//		while(i < customer.length) {
//			if(customer[i] == null) {
//				System.out.print("등록된 회원정보를 찾을 수 없습니다.");
//				break;
//			}else if(customer[i].equals(id, password)) {
//				loginCustomer = customer[i];
//				System.out.print("로그인 성공");
//				break;
//			}else if(customer[i].idChk(id)) {
//				System.out.print("비밀번호가 틀렸습니다.");
//				break;
//			}else if(i == customer.length - 1) {
//				System.out.print("등록된 회원정보를 찾을 수 없습니다.");
//				break;
//			}
//			i++;
//		}
		
	}

}
