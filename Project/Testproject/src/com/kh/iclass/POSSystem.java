package com.kh.iclass;

import java.util.Scanner;

public class POSSystem {
	private Scanner sc = new Scanner(System.in);
	private static POSSystem posInst;
	private final int MAX_COUNT = 10;
	private final Product[] DRINK_ARR = new Product[MAX_COUNT];
	private boolean isRun = true;
	
	private final int MAX_PERSON = 30;
	
	
	private POSSystem() {}
	
	public static POSSystem getInstance() {
		if(posInst == null)
			posInst = new POSSystem();
		return posInst;
	}
	public boolean getIsRun() {
		return this.isRun;
	}
	
	public void setIsRun(boolean isRun) {
		this.isRun = isRun;
	}
	
	//메뉴창
	public int printMenu() {
		
		System.out.println("=================================================");
		System.out.println("1.메뉴 생성");
		System.out.println("2.메뉴 삭제");
		System.out.println("3.메뉴 수정");
		System.out.println("4.메뉴 조회");
		System.out.println("5.메뉴 전체출력");
		System.out.println("=================================================");
		System.out.print("원하시는 메뉴를 선택해주세요.");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	//메뉴생성
	public void insertMenu() {
		//객체 배열 음료를 입력받는다.
		String name, str, size, t;
		int price;
		
		System.out.print("음료명 : ");
		name = sc.nextLine();
		System.out.print("금액 : ");
		price = sc.nextInt();
		sc.nextLine();
		System.out.print("설명 : ");
		str = sc.nextLine();
		System.out.print("사이즈(S, R, L) : ");
		size = sc.nextLine();
		System.out.print("온도(hot/ice) : ");
		t = sc.nextLine();
		
		for(int i = 0; i < this.DRINK_ARR.length; i++) {
			if(this.DRINK_ARR[i] == null) {
				this.DRINK_ARR[i] = new Product(name, price, str, size, t);
				System.out.println(this.DRINK_ARR[i].getMenu() + "가 메뉴에 추가되었습니다.");
				break;
			}else if(this.DRINK_ARR[i].getMenu().equals(name)){
				System.out.print(name + "은 이미 등록되었습니다.");
				break;
			}else if(i == (this.DRINK_ARR.length -1)){
				System.out.println("더이상 메뉴를 추가할 수 없습니다.");
				break;
			}
		}
	}
	//메뉴 출력
	public void printDrinkArr() {
		for(int i = 0; i < this.DRINK_ARR.length; i++) {
			if(this.DRINK_ARR[i] == null) {
				System.out.println(i + "\t-\t-\t-");
			}else {
				System.out.println(i + " " + this.DRINK_ARR[i].toString());
			}
		}
	}
	//메뉴 수정
	public void updateDrinkUnit() {
		printDrinkArr();
		Product selectMenu;
		System.out.print("수정할 메뉴의 번호를 입력하세요 :");
		int number = sc.nextInt();

		selectMenu = this.DRINK_ARR[number];
		if(selectMenu == null) {
			System.out.print("해당메뉴가 존재하지 않습니다.");
		}else {
			System.out.print("수정할 정보를 입력하세요 : (이름, 가격, 설명) :");
			switch(sc.next()) {
			case "이름" : {
				sc.nextLine();
				System.out.print("수정할 이름을 입력하세요:");
				selectMenu.setMenu(sc.nextLine());
				System.out.println(number + "\t" + selectMenu.toString());
			}break;
			case "가격" : {
				sc.nextLine();
				System.out.print("수정할 가격을 입력하세요:");
				selectMenu.setPrice(sc.nextInt());
				System.out.println(number + "\t" + selectMenu.toString());
			}break;
			case "설명" : {
				sc.nextLine();
				System.out.print("수정할 설명을 입력하세요:");
				selectMenu.setDescription(sc.nextLine());
				System.out.println(number + "\t" + selectMenu.toString());
			}break;
			default:
				System.out.print("잘못입력하셨습니다.");
			}
		}
	}
//	public void deleteDrinkUniut() {
//		//저장된 목록 삭제
//		for(int i = (this.DRINK_ARR.length - 1); i >= 0; i--) {
//			if(this.DRINK_ARR[i] != null) {
//				System.out.println(this.DRINK_ARR[i].getMenu() + " 메뉴가 삭제되었습니다.");
//				this.DRINK_ARR[i] = null;
//				break;
//			} else if(i == 0) {
//				System.out.println("삭제할 메뉴가 존재하지 않습니다.");
//			}
//		}
//	}
	//삭제하고 싶은 번호 삭제
	public void deleteDrinkSelect() {

		Product selectMenu;
		System.out.print("삭제하고 싶은 자리 : ");
		int num = sc.nextInt();
		
		selectMenu = this.DRINK_ARR[num];
		if(selectMenu == null) {
			System.out.println("찾지 못했습니다.");
		}else {
			for(int i = num; i < this.DRINK_ARR.length; i++) {
				if(i < this.DRINK_ARR.length -1) {
					this.DRINK_ARR[i] = this.DRINK_ARR[i+1];
					
				}else if(i == this.DRINK_ARR.length - 1) {
					this.DRINK_ARR[i] = null;
					break;
				}
			}
		}
	}
	//메뉴 조회
	public void searchDrinkUnit() {
		String name2;
		System.out.print("조회하고 싶은 음료명 : ");
		name2 = sc.next();
		
		
		for(int i = 0; i < this.DRINK_ARR.length; i++) {
			if(this.DRINK_ARR[i] == null) {
				System.out.println("해당메뉴가 존재하지 않습니다.");
				break;
			}else if(this.DRINK_ARR[i].getMenu().equals(name2)) {
				System.out.println(i + " " + this.DRINK_ARR[i].toString());
				break;
			}else if(i == (this.DRINK_ARR.length -1)) {
				System.out.println("해당메뉴가 존재하지 않습니다.");
			}
		}
	}
	
}
