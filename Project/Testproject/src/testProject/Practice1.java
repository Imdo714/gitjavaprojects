package testProject;
import java.util.*;
public class Practice1 {
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i % 2 == 0)
			System.out.println("짝수다");
		else
			System.out.println("홀수다");
	}
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		if(i>0)
			System.out.println("양수다");
		else if(i==0)
				System.out.println("0입니다");
		else
			System.out.print("양수아니다.");

	}
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int a = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int i = sc.nextInt();

		System.out.println("\n1인당 사탕 개수 : " + (i / a));
		
		System.out.println("남은 사탕 개수 : " + ( i % a));
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만 : ");
		int a = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int b = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int c = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char d = sc.next().charAt(0);
		if(d == 'M')
			d = '남';
		else if(d == 'F')
			d = '여';
		else
			System.out.println("성별이 아닙니다.");
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double e = sc.nextDouble();
		
		System.out.print("\n" + a + "학년 " + b + "반 "+ c +"번 "+ name +" "+ d 
				+ "학생의 "+ "성적은 " + e +"이다.");

	}
	
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만 : ");
		int a = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int b = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int c = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char d = sc.next().charAt(0)== 'M' ?'남' : '여';

		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double e = sc.nextDouble();
		
		System.out.print("\n" + a + "학년 " + b + "반 "+ c 
				+"번 "+ name +" "+ d 
				+ "학생의 "+ "성적은 " + e +"이다.");

	}
	
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String grade;
		
		if(age <= 13) 
			grade = "어린이";
		else if(age > 13 && age <= 19)
			grade = "청소년";
		else if(age <= 0) 
			
			grade = "양수로 입력해주세요";
		else
			grade = "성인";

		System.out.println(grade);
		
		grade = (age <= 13) ? "어린이" : ((age > 13 && age <= 19) ? "청소년" : "성인");
		System.out.println(grade);
		
	}
	public static void practice8() {
		int kor, eng, math, total;
		double avrg;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();

		total = kor + eng + math;
		avrg = (double)total / 3;
		System.out.println("\n합계 : " + total);
		System.out.println("평균 : " + avrg);
		if(kor>=40 && eng >= 40 && math >= 40 && avrg >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
	}
	public static void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String m = sc.next();

		if(m.charAt(7) == '1' || m.charAt(7) == '3')
			System.out.println("남자");
		else
			System.out.println("여자");
	}
	
	public static void practice10() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("A사원의 연봉 : ");
		int amoney = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int bmoney = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int cmoney = sc.nextInt();
		
		double a = amoney * 1.4;
		double b = bmoney * 1;
		double c = cmoney * 1.15;
		
		if(a < 3000) {
		System.out.println("A사원의 연봉/연봉 + a : " + amoney + "/" + a);
		System.out.println("3000 미만");
		}else{
			System.out.println("A사원의 연봉/연봉 + a : " + amoney + "/" + a);
			System.out.println("3000 이상");
		}
		if(b < 3000) {
			System.out.println("B사원의 연봉/연봉 + a : " + bmoney + "/" + b);
			System.out.println("3000 미만");
			}else{
				System.out.println("B사원의 연봉/연봉 + a : " + bmoney + "/" + b);
				System.out.println("3000 이상");
			}
		if(c < 3000) {
			System.out.println("C사원의 연봉/연봉 + a : " + cmoney + "/" + c);
			System.out.println("3000 미만");
			}else{
				System.out.println("C사원의 연봉/연봉 + a : " + cmoney + "/" + c);
				System.out.println("3000 이상");
			}
	} 
	public static void main(String[] args) {
		practice10();
	}

}
