package com.kh.object;
import java.util.*;
public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
			String str1, str2, str3;
			int num1, num2;
			System.out.print("종류: ");
			str1 = sc.next();
			System.out.print("이름: ");
			str2 = sc.next();
			System.out.print("맛: ");
			str3 = sc.next();
			System.out.print("개수: ");
			num1 = sc.nextInt();
			System.out.print("가격: ");
			num2 = sc.nextInt();
			System.out.println(scr.saveData(str1, str2, str3, num1, num2));
			System.out.print("저장 정보를 확인하겠습니까? (y/n) :");
			
			char n = sc.next().charAt(0);
			if(n == 'y') {
				System.out.println(scr.confirmData());
			}else {
				return;
			}
			
	}
}
