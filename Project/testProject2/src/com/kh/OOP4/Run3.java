package com.kh.OOP4;
import java.util.Scanner;
public class Run3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 : ");
		
		//num 입력
		int num = sc.nextInt();
		//10보다 크면 10초과  작거나 같으면 10 이하
		if(num <= 10) {
			System.out.println("10 이하");
		}else
			System.out.println("10 초과");
		
		
		//1000에서 1부터 num까지 순서대로 전부 뺀 값 출력
		int num2 = 1000;
		for(int i = 1; i <= num ; i++) {
			num2 -= i;
		}
		System.out.println(num2);
		//num 크기의 배열
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = num;
			System.out.println(i +"번째 값 :" + arr[i]);
		}
		
		
		
			
	}
}
	
