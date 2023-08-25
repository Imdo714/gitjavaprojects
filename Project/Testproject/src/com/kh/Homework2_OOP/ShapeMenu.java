package com.kh.Homework2_OOP;
import java.util.*;
public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	
	private SquareController scr;
	private TriangleController tc;
	
	public ShapeMenu() {
		scr = new SquareController();
		tc = new TriangleController();
	}
	
	public void inputMenu() {
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 :");
			switch(sc.nextInt()) {
				case 3: {
					triangleMenu();
				}break;
				case 4 :{
					squareMenu();
				}break;
				case 9 :{
					System.out.println("프로그램을 종료합니다");
					isTrue = false;
				}break;
				default :
					System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}
	public void triangleMenu() {
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("====삼각형=====");
			System.out.println("1.삼각형 면적");
			System.out.println("2.삼각형 색칠");
			System.out.println("3.삼각형 정보");
			System.out.println("9.메인으로");
			System.out.print("메뉴 번호 :");
			int n = sc.nextInt();
			if( n == 9) {
				isTrue = false;
			}
			inputSize(3, n);
		}
		
	}
	public void squareMenu() {
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("====사각형=====");
			System.out.println("1.사각형 둘레");
			System.out.println("2.사각형 면적");
			System.out.println("3.사각형 색칠");
			System.out.println("4.사각형 정보");
			System.out.println("9.메인으로");
			System.out.print("메뉴 번호 :");
			
			int n = sc.nextInt();
			if( n == 9) {
				isTrue = false;
			}
			inputSize(4, n);
		}
	}
	public void inputSize(int type, int menuNum) {
		switch(type){
			case 3 :{
				switch(menuNum) {
					case 1: {
						System.out.print("높이: ");
						double num1 = sc.nextDouble();
						System.out.print("너비: ");
						double num2 = sc.nextDouble();
						System.out.println("삼각형의 면적은 : " + tc.calcArea(num1, num2));
					}break;
					case 2: {
						System.out.print("색깔을 입력하세요 : ");
						String color = sc.next();
						tc.paintColor(color);
					}break;
					case 3: {
						printInformation(3);
					}break;
					case 9: {
						System.out.println("메인으로 돌아갑니다.");
					}break;
					default:{
						System.out.println("잘못된 입력입니다.");
					}
				}
			}break;
			case 4 :{
				switch(menuNum) {
				case 1: {
					System.out.print("높이: ");
					double num1 = sc.nextDouble();
					System.out.print("너비: ");
					double num2 = sc.nextDouble();
					System.out.println("사각형의 둘레는 : " + scr.calcPerimeter(num1, num2));
				}break;
				case 2: {
					System.out.print("높이: ");
					double num1 = sc.nextDouble();
					System.out.print("너비: ");
					double num2 = sc.nextDouble();
					System.out.println("사각형의 면적은 : " + scr.calcArea(num1, num2));
				}break;
				case 3: {
					System.out.print("색깔을 입력하세요 : ");
					String color = sc.next();
					scr.paintColor(color);
				}break;
				case 4: {
					printInformation(4);
				}break;
				case 9: {
					System.out.println("메인으로 돌아갑니다.");
				}break;
				default:{
					System.out.println("잘못된 입력입니다.");
					}
				}
			}
		}
	}
		
	public void printInformation(int type) {
		switch(type) {
		case 3: {
			System.out.println(tc.print());
		}break;
		case 4 :{
			System.out.println(scr.print());
		}break;
		default :
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
		}
	}
}
