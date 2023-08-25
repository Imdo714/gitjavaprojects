package com.kh.inheritance;
import java.util.*;
public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	private int[] count = pc.PersonCount();
	public void mainMenu() {
		while(true) {
			System.out.println("학생은 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + count[0] +"명입니다." );
			System.out.println("사원은 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + count[1] +"명입니다." );
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch(num) {
				case 1: {
					studentMenu();
				}break;
				case 2: {
					employeeMenu();
				}break;
				case 9: {
					System.out.println("종료합니다.");
					return;
				}
				default:{
					System.out.println("잘못 입력하셧습니다. 다시 입력해주세요");
				}
			}
		}
	}
	public void studentMenu() {
		boolean isTrue = true;
		while(isTrue) {
			
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch(num) {
				case 1: {
					insertStudent();
				}break;
				case 2: {
					printStudent();
				}break;
				case 9: {
					System.out.println("메인으로 돌아갑니다.");
					isTrue = false;
				}break;
				default:{
					System.out.println("잘못 입력하셧습니다. 다시 입력해주세요");
				}
			}
		}
	}
	public void employeeMenu() {
		boolean isTrue = true;
		while(isTrue) {
			
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch(num) {
				case 1: {
					insertEmployee();
				}break;
				case 2: {
					printEmployee();
				}break;
				case 9: {
					System.out.println("메인으로 돌아갑니다.");
					isTrue = false;
				}break;
				default:{
					System.out.println("잘못 입력하셧습니다. 다시 입력해주세요");
				}
			}
		}
	}
	public void insertStudent() {
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("학생 이름 : ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.print("학생 전공 : ");
			String major = sc.nextLine();
			
			pc.inserStudent(name, age, height, weight, grade, major);
			if(count[0] > 2) {
				break;
			}else {
				System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키를 누르세요 :");
				char n = sc.next().charAt(0);
				if(n == 'n' || n == 'N') {
					isTrue = false;
				}
			}
		}
	}
	public void printStudent() {
		Student[] sm = pc.printStudent();
		for(int i = 0; i < sm.length; i++) {
			if(sm[i] != null) {
				System.out.println(sm[i].toString());
			}else {
				break;
			}
		}
	}
	public void insertEmployee() {
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("사원 이름 : ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("사원 나이 : ");
			int age = sc.nextInt();
			System.out.print("사원 키 : ");
			double height = sc.nextDouble();
			System.out.print("사원 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("사원 급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			
			pc.inserEmployee(name, age, height, weight, salary, dept);
			if(count[1] > 10) {
				break;
			}else {
				System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키를 누르세요 :");
				char n = sc.next().charAt(0);
				if(n == 'n' || n == 'N') {
					isTrue = false;
				}
			}
		}
	}
	public void printEmployee() {
		Employee[] em = pc.printEmployee();
		for(int i = 0; i < em.length; i++) {
			if(em[i] != null) {
				System.out.println(em[i].toString());
			}else {
				break;
			}
		}
	}
}
