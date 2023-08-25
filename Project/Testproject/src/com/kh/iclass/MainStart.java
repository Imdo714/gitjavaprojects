package com.kh.iclass;
import java.util.*;
public class MainStart {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		POSSystem pos = POSSystem.getInstance();
		while(pos.getIsRun()) {
			switch(pos.printMenu()) {
				case 1 : {//메뉴 생성
					pos.insertMenu();
				}break;
				case 2 : { //삭제
					pos.deleteDrinkSelect();
				}break;
				case 3 : { // 수정
					pos.updateDrinkUnit();
				}break;
				case 4 : { // 조회
					pos.searchDrinkUnit();
				}break;
				case 5 : { //전체출력
					pos.printDrinkArr();
				}break;
				default:
					pos.setIsRun(false);
			}
		}
		
		//=========================================================
		
		final int MAX = 20;
		//객체배열생성
		Product[] menu = new Product[MAX];
		menu[0] = new Product("아메리카노", 1000, "시원해요", "S", "hot");
	
//		//=============================================================
//		//객체 배열 음료를 입력받는다.
//		String name, str, size, t;
//		int price;
//		System.out.print("음료명 : ");
//		name = scan.next();
//		System.out.print("금액 : ");
//		price = scan.nextInt();
//		System.out.print("설명 : ");
//		str = scan.next();
//		System.out.print("사이즈(S, R, L) : ");
//		size = scan.next();
//		System.out.print("온도(hot/ice) : ");
//		t = scan.next();
//		
//		for(int i = 0; i < menu.length; i++) {
//			if(menu[i] == null) {
//				menu[i] = new Product(name, price, str, size, t);
//				System.out.println(menu[i].getMenu() + "가 메뉴에 추가되었습니다.");
//				break;
//			}else if(menu[i].getMenu().equals(name)){
//				System.out.print(name + "은 이미 등록되었습니다.");
//				break;
//			}else if(i == (menu.length -1)){
//				System.out.println("더이상 메뉴를 추가할 수 없습니다.");
//				break;
//			}
//		}
//		
//		//음료 목록 출력
//		for(int i = 0; i < menu.length; i++) {
//			if(menu[i] == null) {
//				System.out.println(i + "- - -");
//			}else {
//				System.out.println(i + " " + menu[i].toString());
//			}
//		}
		//음료 삭제
		//저장된 목록 삭제
//		for(int i = (menu.length - 1); i >= 0; i--) {
//			if(menu[i] != null) {
//				System.out.println(menu[i].getMenu() + " 메뉴가 삭제되었습니다.");
//				menu[i] = null;
//				break;
//			} else if(i == 0) {
//				System.out.println("삭제할 메뉴가 존재하지 않습니다.");
//			}
//		}
		
		//조회
		//조회할 메뉴의 이름을 입력하세요:
		
//		String name2;
//		System.out.print("조회하고 싶은 음료명 : ");
//		name2 = scan.next();
//		
//		
//		for(int i = 0; i < menu.length; i++) {
//			if(menu[i] == null) {
//				System.out.println("해당메뉴가 존재하지 않습니다.");
//				break;
//			}else if(menu[i].getMenu().equals(name2)) {
//				System.out.println(i + " " + menu[i].toString());
//				break;
//			}else if(i == (menu.length -1)) {
//				System.out.println("해당메뉴가 존재하지 않습니다.");
//			}
//		}
		
		//수정할 정보를 입력하세요 : (이름, 가격, 설명)
		//새로운 이름을 입력하세요
//		Product selectMenu;
//		System.out.print("수정할 메뉴의 번호를 입력하세요 :");
//		int number = scan.nextInt();
//
//		selectMenu = menu[number];
//		if(selectMenu == null) {
//			System.out.print("해당메뉴가 존재하지 않습니다.");
//		}else {
//			System.out.print("수정할 정보를 입력하세요 : (이름, 가격, 설명) :");
//			switch(scan.next()) {
//			case "이름" : {
//				scan.nextLine();
//				System.out.print("수정할 이름을 입력하세요:");
//				selectMenu.setMenu(scan.nextLine());
//				System.out.println(number + "\t" + selectMenu.toString());
//			}break;
//			case "가격" : {
//				scan.nextLine();
//				System.out.print("수정할 가격을 입력하세요:");
//				selectMenu.setPrice(scan.nextInt());
//				System.out.println(number + "\t" + selectMenu.toString());
//			}break;
//			case "설명" : {
//				scan.nextLine();
//				System.out.print("수정할 설명을 입력하세요:");
//				selectMenu.setDescription(scan.nextLine());
//				System.out.println(number + "\t" + selectMenu.toString());
//			}break;
//			default:
//				System.out.print("잘못입력하셨습니다.");
//			}
//		}
		
	}

}
