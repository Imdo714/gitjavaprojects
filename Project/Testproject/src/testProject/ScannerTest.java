package testProject;
import java.util.*;
public class ScannerTest {

	public static void main(String[] args) {
		float num;
		Scanner sc = new Scanner(System.in);

		//newtInt() : int를 입력받는다.
		//num = sc.nextInt();
		//num2 = sc.nextInt();
		//int num3 = num + num2;
		//System.out.println("num + num2 =" + num3);
		
		//newtFloat() : 소수를 입력받는다.
		//		num = sc.nextFloat();
		//		System.out.println(num + num);
		
		//String 입력 : next(), nextLine()
		String str1, str2, str3;
		
		str1 = sc.next(); // next() : 공백까지만 입력된다.
		str2 = sc.nextLine(); // nextLing() : \n 만날떄까지 실행된다.
		str3 = sc.next();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
