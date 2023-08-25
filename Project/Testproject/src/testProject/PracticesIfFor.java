package testProject;
import java.util.*;
public class PracticesIfFor {

	public static void practice1() {
		int num = 0;
		while(num < 1) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 : ");
			num = sc.nextInt();
			if(num > 0) {
				for(int i = 1; i <= num; i++) {
					if(i % 2 ==0)
						System.out.print("수");
					else
						System.out.print("박");
				}
			}else
				System.out.println("양수가 아닙니다.");
		}
	}
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String chs = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		int a = 0;
		
		for(int i = 0; i < chs.length(); i++) {
			if(ch == chs.charAt(i)){
				a++;
			}
		}
		System.out.println(chs + " 안에 포함된 " + ch + " 개수" + " : " + a);
	}
	
	public static void practice3() {
		 char y = 'y';
			 while(y == 'y' || y == 'Y') {
				 Scanner sc = new Scanner(System.in);
					System.out.print("문자열 : ");
					String chs = sc.nextLine();
					System.out.print("문자 : ");
					char ch = sc.next().charAt(0);
					int a = 0;
					
					for(int i = 0; i < chs.length(); i++) {
						if(ch == chs.charAt(i)){
							a++;
						}
					}
					System.out.println(chs + " 안에 포함된 " + ch + " 개수" + " : " + a);
					
					System.out.print("더 하시겠습니까? (y/n) : ");
					y = sc.next().charAt(0);
					while(y != 'y' && y != 'Y' && y != 'N' && y!= 'n') {
						System.out.println("잘못된 대답입니다. 다시 입력해주세요. ");
						System.out.print("더 하시겠습니까? (y/n) : ");
						 y = sc.next().charAt(0);
					}
			 }
	}

	public static void main(String[] args) {
		practice3();

	}

}
