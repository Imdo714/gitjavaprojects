package com.kh.OOP4;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		//짝수 홀수
		if(num % 2 == 1) {
			System.out.println("홀수 입니다.");
		}else
			System.out.println("짝수 입니다.");
		//합계
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//배열
		int[] num2 = new int[num];
		for(int i = 0; i < num2.length; i++) {
			num2[i] = i+1;
			System.out.println( i+"번쨰는 " +num2[i]);
		}

		
	}

}
