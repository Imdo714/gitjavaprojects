package com.kh.weekhomework;
import java.util.*;
public class Weekhome0805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1번
//		int num;
//		while(true) {
//			System.out.print("정수 입력 : ");
//			num = sc.nextInt();
//			if( num >= 5) {
//				for(int i = 1; i <= num; i++) {
//					System.out.print(i + " ");
//				}
//				break;
//			}else
//				System.out.println("5이상의 정수를 입력하세요");
//		}
		
		//2번
//		int num;
//		int[] arr;
//		System.out.print("배열의 길이 설정 : ");
//		num =sc.nextInt();
//		arr = new int[num];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//			System.out.print(arr[i] + " ");
//		}
		

		//3번
		Person sangwon = new Person();
		sangwon.setBirth("2023.00.00");
		sangwon.setId("100");
		sangwon.setMoney(100000);
		sangwon.setName("상원");
		sangwon.setPw("1");
		sangwon.setPhone("010-0000-0000");
		
		//4번
		sangwon.personInfo();
		System.out.println();
		Menu movename = new Menu("괴물", "2023-08-06", 30, 3000);
		Cinema cinema = new Cinema(sangwon, movename, 30, 0);
		
		cinema.buyTicket(3);
		System.out.println();
		cinema.reservationInfo();
		System.out.println();
		sangwon.personInfo();
		//
 
	}

}
