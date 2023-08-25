package com.kh.practice1;
import java.util.*;
public class Practice4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력하세요: ");
			String str = sc.nextLine();
			if(str == "exit") {
				break;
			}else {
				System.out.println(str.length() +"글자입니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}
