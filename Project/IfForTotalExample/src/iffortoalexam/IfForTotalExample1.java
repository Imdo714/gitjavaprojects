package iffortoalexam;
import java.util.*;

public class IfForTotalExample1 {
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		if(num > 0 && num != 0) {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					System.out.print("수");
				}else
					System.out.print("박");
			}
		}else
			System.out.print("정수가 아닙니다.");
	}
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		if(num > 0 && num != 0) {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					System.out.print("수");
				}else
					System.out.print("박");
			}
		}else
			System.out.print("양수가 아닙니다.");
	}
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i< str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(str + " 안에 포함된 " + ch + "개수 : " + count);
	}
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		while((ch == 'y' && ch == 'Y') || (ch != 'N' && ch != 'n')) {
			
			System.out.print("문자열 : ");
			String str = sc.next();
			System.out.print("문자 : ");
			ch = sc.next().charAt(0);
			int count = 0;
			for (int i = 0; i< str.length(); i++) {
				if(ch == str.charAt(i)) {
					count++;
				}
			}
			System.out.println(str + " 안에 포함된 " + ch + "개수 : " + count);
			while(ch != 'y') {
				System.out.print("더 하시겠습니까? (y/n) : ");
				ch = sc.next().charAt(0);
				if(ch == 'y' || ch == 'Y') {
					ch = 'y';
				}else if (ch != 'n' && ch != 'N') {
					System.out.print("잘못된 입력입니다. 다시 입력해주세요.\n");
				}else {
					break;
				}
					
			}
			
		}
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int nan = random.nextInt(100);
		System.out.println("난수를 입력하세요 : " + nan);
		int num = 1, count = 0;
	
		while(nan != num) {
			if(num <= 0 || num > 100) {
				System.out.println("1~ 100사이의 숫자를 입력해주세요.");
				num = 1;
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			}else {
				System.out.print("1~100사이의 임의의 난수를 맞춰보세요. : ");
				num = sc.nextInt();
				count++;
				if(nan > num)
					System.out.println("UP!");
				else
					System.out.println("DOWN!");
			}
		}
		System.out.println("정답입니다!!");
		System.out.println(count + "회만에 맞추셨습니다.");

	}
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		
	}
	public static void main(String[] args) {
		practice6();
	}

}
