package testProject;
import java.util.Scanner;
public class Practices {
	public static void Practice1(){
		int num = 0;
		while(num < 1) {
			Scanner sc = new Scanner(System.in);
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if(num > 0) {
				for (int i = 1; i<= num; i++) {
					System.out.print(i + " ");
				}
			}else
				System.out.println("1이상의 숫자를 입력해주세요.!!");
		}
		
	}
	public static void Practice2(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if(i == num) {
				System.out.print(i + " = " + sum);
			}else
				System.out.print(i + " + " );
		}
	}

	public static void main(String[] args) {
		 
		Practice2();

	}
}
