package testProject;
import java.util.*;
public class ArrayExample4 {
	public static void practice1() {
		int[] intarr = new int[10];
		for(int i = 0; i<intarr.length;i++) {
			intarr[i] = i + 1;
			System.out.print(intarr[i] + " ");
		}
	}
	public static void practice2() {
		int[] intarr = new int[10];
		for(int i = 0, j=10; i<10; i++, j--) {
			intarr[i] = j;
			System.out.print(intarr[i] + " ");
		}
	}
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0; i < arr.length;i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		String[] str = {"사과", "귤", "포도", " 복숭아", "참외"};
		System.out.print(str[1]);
	}
	
	public static void practice5() {
		//application
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		System.out.print(str + "에 "+ ch + "가" + "존재하는 위치(인덱스) : ");
		for(int i = 0; i < str.length(); i++) {
			if(ch == str.charAt(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n" + ch + " 개수 : " + count);
	}
	public static void practice6() {
		//application
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		String[] str = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		switch(num) {
		case 0: System.out.println(str[0]);break;
		case 1: System.out.println(str[1]);break;
		case 2: System.out.println(str[2]);break;
		case 3: System.out.println(str[3]);break;
		case 4: System.out.println(str[4]);break;
		case 5: System.out.println(str[5]);break;
		case 6: System.out.println(str[6]);break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}	
	}
	public static void practice7() {
		//application
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();	
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번쨰 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n총 합 : " + sum);
		
	}
	public static void practice8() {
		//application
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			int sum = 0;
			if(num > 2 && num % 2 == 1) {
				int[] dis = new int[num];
				for(int i = 0; i < num; i++) {
					if(i <= (num/2)) {
						sum++;
						dis[i] = sum;
						System.out.print( dis[i] + ", ");
					}else {
						sum--;
						dis[i] = sum;
						System.out.print( dis[i] + ", ");
					}	
				}
				break;
			}else{
				System.out.println("다시 입력하세요.");	
			}
		}
	}
	
	public static void main(String[] args) {
		practice8();
	}

}
