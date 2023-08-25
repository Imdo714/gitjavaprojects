package testProject;

import java.util.Scanner;

public class forPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num = 100;
//		while(num < 1) {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if(num < 1)
//				System.out.println("1이상의 숫자를 입력해주세요.!");
//			else {
//				int i = 1;
//				while(i <= num) {
//					System.out.print(i + " ");
//					i++;
//				}	
//			}
//		}
//		do {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if(num < 1)
//				System.out.println("1이상의 숫자를 입력하세요!!!");
//			else {
//				int i = 1;
//				do {
//					System.out.print(i + " ");
//					i++;
//				}while(i <= num);
//			}
//		}while(num < 1);
//		do {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			
//			if(num < 1) {
//				System.out.println("1이상의 숫자를 입력하세요.");
//			}else {
//				for(int i = num; i >= 1; i--) {
//					System.out.print(i + " ");
//				}
//			}
//		}while(num < 1);
//		
//		while(num < 1){
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			
//			if(num < 1) {
//				System.out.println("1이상의 숫자를 입력하세요.");
//			}else {
//				for(int i = num; i >= 1; i--) {
//					System.out.print(i + " ");
//				}
//			}
//		}
		
//		for(;num<1;) {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			
//			if(num < 1) {
//				System.out.println("1이상의 숫자를 입력하세요.");
//			}else {
//				for(int i = num; i >= 1; i--) {
//					System.out.print(i + " ");
//				}
//			}
//		}
		
//		System.out.print("정수를 하나 입력하세요 : ");
//		int num = sc.nextInt();
//		int total = 0;
//		for(int i = 1; i <= num; i++) {
//			total = i + total;
//			
//			if(i < num) {
//				System.out.print(i + " + ");
//			}else if(i == num) {
//				System.out.print(i + " = " + total);
//			}
//		}
		int num1 = 0, num2 = 0;
		
		while(num1 < 1 || num2 < 1) {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			
			if(num1 > 0 && num2 > 0) {
//				if(num1 < num2) {
//					for(int i = num1; i<=num2;i++) {
//						System.out.print(i+ " ");
//					}
//				}else{
//					for(int i = num2;i<=num1;i++) {
//						System.out.print(i+ " ");
//					}
//				}
				for(int i = (num1 > num2 ? num2 : num1); i<=(num1 > num2 ? num1 : num2); i++) {
					System.out.print(i+ " ");
				}
			}else {
				System.out.print("1 이상의 숫자를 입력해주세요\n");
			}
		}
		
	}
}
