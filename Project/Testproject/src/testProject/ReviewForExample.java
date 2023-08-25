package testProject;
import java.util.Scanner;
public class ReviewForExample {
	
	public static void Practice1(){
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) 
			for(int i = (num1 > num2 ? num2 : num1); i <= (num1 > num2 ? num1 : num2); i ++) {
				System.out.print(i + " ");
			}
		else
			System.out.print("1 이상의 숫자를 입력하세요.");
	}
	
	public static void Practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}	
	}
	public static void Practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if(num <= 9) {
			for(int i = num; i < 10; i++) {
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
				System.out.println("=====" + i + "단 ===== ");
			}
		}else
			System.out.print("9 이하의 숫자만 입력해주세요");
	}
	
	public static void Practice4() {
		
		int num = 10;
		while(num > 9) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 : ");
			num = sc.nextInt();

			if(num > 9) {
				System.out.print("9 이하의 숫자만 입력해주세요\n");
			}else {
				for(int i = num; i < 10; i++) {
					for(int j = 1; j < 10; j++) {
						System.out.println(i + " * " + j + " = " + (i * j));
					}
					System.out.println("=====" + i + "단 ===== ");
				}
			}	
		}
	}
	public static void Practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		System.out.print(num1 + " ");
		for(int i = 0; i < 9; i++)
			System.out.print( (num1 += num2) + " ");
	}
	
	public static void Practice6() {
		String op = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("연산자( +, -, *, /, % ) : ");
			op = sc.next();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.print("정수1 : ");
				int num1 = sc.nextInt();
				System.out.print("정수2 : ");
				int num2 = sc.nextInt();
				
				
				switch (op) {
					case "+" : 
						System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
						break;
					case "-" : {
						if(num1>num2) {
							System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
							break;
						}					
						else {
							System.out.println(num2 + " - " + num1 + " = " + (num2 - num1));
							break;
						}		
					}
					case "*" :
						System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
						break;
					case "/" : {
						if(num1 == 0 && num2 == 0) {
							System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
							break;
						}else
							System.out.println(num1 + " + " + num2 + " = " + (num1 / num2));
						break;
					}
					case "%" :
						System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
						break;
					default :
						System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
				}
			}
		}while(!op.equals("exit"));
	}
	public static void Practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = num; j >= i; j--) {
				System.out.print("*");
			}
	
			System.out.println();
		}
	}
//	public static void Practice9() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		char ch = '*';
//		
//		for(int j = 1; j <= num; j++) {
//			for(int i = 1; i<= num;i++) {
//				System.out.print(ch);
//			}
//			System.out.println();	
//		}
//		
//	}
	public static void main(String[] args) {
		Practice8();
	}

}
