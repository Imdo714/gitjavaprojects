package testProject;
import java.util.*;
public class Practice3 {
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("입력1 : ");
		a = sc.nextInt();
		System.out.print("입력2 : ");
		b = sc.nextInt();
		System.out.print("입력3 : ");
		c = sc.nextInt();
		
		if(a==b && a==c && b==c) 
			System.out.print("true");
		else
			System.out.print("false");
	}
	
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("정수1 : ");
		num1 = sc.nextInt();
		System.out.print("정수2 : ");
		num2 = sc.nextInt();
		System.out.print("입력 : ");
		num3 = sc.nextInt();
		
		if(num3 <= num1 || num3 > num2 && num1 < num2)
			System.out.print("true");
		else
			System.out.print("false");
	}
	
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		String season;
		int month;
		System.out.print("몇 월(1~12) : ");
		month = sc.nextInt();
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
		}else if(month >= 3 && month <= 5) {
			season = "봄";
		}else if(month >= 6 && month <= 8) {
			season = "여름";
		}else if(month >= 9 && month <= 11) {
			season = "겨울";
		}else {
			season = "해당하는 계절이 없습니다.";
		}
		System.out.println(season);
		
	}
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		String season;
		int month;
		System.out.print("몇 월(1~12) : ");
		month = sc.nextInt();
		
		switch(month) {
			case 1: case 2: case 12:
				season = "겨울"; break;
			case 3: case 4: case 5:
				season = "봄"; break;
			case 6: case 7: case 8:
				season = "여름"; break;
			case 9: case 10: case 11:
				season = "가을"; break;
			default :
				season = "해당하는 계절이 없습니다.";
		}
		System.out.println(season);
		
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		final String MANAGER = "관리자";
		final String MEMBER = "회원";
		final String NO_MEMBER = "비회원";
		String user;
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		user = sc.nextLine();
		
		switch(user) {
			case MANAGER :
				System.out.println("회원관리, 게시글 관리, 게시글 작성,"
						+ " 게시글 조회, 댓글 작성");
				break;
			case MEMBER :
				System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
				break;
			case NO_MEMBER :
				System.out.println("게시글 조회");
				break;
			default :
				System.out.println("잘못입력하셨습니다.(관리자, 회원, 비회원)");
		}
	}
	
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		final String MANAGER = "관리자";
		final String MEMBER = "회원";
		final String NO_MEMBER = "비회원";
		String user;
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		user = sc.nextLine();
		
		if(user.equals(MANAGER)) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성,"
					+ " 게시글 조회, 댓글 작성");
		}else if(user.equals(MEMBER)) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(user.equals(NO_MEMBER)) {
			System.out.println("게시글 조회");
		}else {
			System.out.println("잘못입력하셨습니다.(관리자, 회원, 비회원)");
		}
		
	}
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		double m, kg;
		System.out.print("키(m)를 입력해 주세요");
		m = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요");
		kg = sc.nextDouble();
		
		double bmi = kg /(m * m);	
		System.out.println("BMI 지수 : " + bmi);
		
		if (bmi < 18.5)
			System.out.print("저체중");
		else if(bmi >= 18.5 && bmi < 23)
			System.out.print("정상체중");
		else if(bmi >= 23 && bmi < 25)
			System.out.print("과체중");
		else if(bmi >= 25 && bmi < 30)
			System.out.print("비만");
		else if(bmi >= 30)
			System.out.print("고도 비만");
	}
	public static void practice8() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		double result;
		String z;
		System.out.print("피연산자1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		
		z = sc.next();
		if(num1 > 0 && num2 > 0 ) {
			switch(z) {
			case "+" :
				result = (double)num1 + num2;
				System.out.print(num1 + " + " + num2 + " = " + result);
				break;
			case "-" :
				result = (double)num1 - num2;
				System.out.print(num1 + " - " + num2 + " = " + result);
				break;
			case "*" :
				result = (double)num1 * num2;
				System.out.print(num1 + " * " + num2 + " = " + result);
				break;
			case "/" :
				result = (double)num1 / num2;
			//	System.out.printf("%d %c %d = %.6f \n", num1, z, num2, (double)(num1 / num2));
				System.out.print(num1 + " / " + num2 + " = " + result);
				break;
			case "%" :
				result = (double)num1 % num2;
				System.out.print(num1 + " % " + num2 + " = " + result);
				break;
			default :
				System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				}
		}else {
				System.out.print("잘못입력하셨습니다.");
		}
		
//		if(num1 > 0 && num2 > 0 ) {
//			if(z.equals("+")) {
//				result = (double)num1 + num2;
//				System.out.print(num1 + " + " + num2 + " = " + result);
//			}else if(z.equals("-")) {
//				result = (double)num1 - num2;
//				System.out.print(num1 + " - " + num2 + " = " + result);
//			}else if(z.equals("*")) {
//				result = (double)num1 * num2;
//				System.out.print(num1 + " * " + num2 + " = " + result);
//			}else if(z.equals("/")) {
//				result = (double)num1 / num2;
//				System.out.print(num1 + " / " + num2 + " = " + result);
//			}else if(z.equals("%")) {
//				result = (double)num1 % num2;
//				System.out.print(num1 + " % " + num2 + " = " + result);
//			}else
//				System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
//		}else {
//			System.out.print("잘못입력하셨습니다.");
//		}
	}
	public static void practice9() {
		Scanner sc = new Scanner(System.in);
		int middle, finals, assignment, attendance;
		double total;
		System.out.print("중간 고사 점수 : ");
		middle = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		finals = sc.nextInt();
		System.out.print("과제 점수 : ");
		assignment = sc.nextInt();
		System.out.print("출석 회수 : ");
		attendance = sc.nextInt();
		
		//계산
		if(attendance <= 20 ) {
			System.out.print("============ 결과 ============");
			System.out.println("\n중간 고사 점수(20) :" + (middle * 0.2));
			System.out.println("기말 고사 점수(30) :" + (finals * 0.3));
			System.out.println("과제 점수      (30):"+ (assignment * 0.3));
			System.out.println("출석 점수      (20):" + (double)attendance);
			total = (middle * 0.2) + (finals * 0.3) + (assignment * 0.3) + attendance;
			System.out.println("총점 : " + total);
			
			
			if(total < 70)
				System.out.println("Fail[점수 미달]");
			else if(attendance <= (20 * 0.7))
				System.out.println("Fail[출석 미달]");
			else if(total >= 70)
				System.out.println("Pass");
		} else
			System.out.println("출석 점수는 20일 이하로 입력");		
	}
	
	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("실핼할 기능을 선택하세요.\n1. 권한 확인 "
				+ "\n2. BMI\n3. 계산기\n4. P/F");
		System.out.print("선택 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1: practice6(); break;
		case 2: practice7(); break;
		case 3: practice8(); break;
		case 4: practice9(); break;
		default :
			System.out.println("잘못 입력했습니다.");
		}

//		if (num == 1)
//			practice6();
//		else if(num == 2)
//			practice7();
//		else if(num == 3)
//			practice8();
//		else if(num == 4)
//			practice9();
//		else
//			System.out.println("잘못 입력했습니다.");
	}
	public static void main(String[] args) {
		practice10();
		
	}

}
