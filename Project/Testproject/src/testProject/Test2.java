package testProject;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//두 변수의 입력
		int num1;
		int num2;

		String op;
		
		System.out.print("첫 번째 정수 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		num2 = sc.nextInt();
		System.out.print("+,-,*,/ 중에 입력하세요 : ");
		op = sc.next();
		
		System.out.println("-------------------------");
		
		//+,-,*,/ 연산 수행 후 출력
//		int add = num1 + num2; //더하기
//		System.out.println("더하기 결과 : " + add);
//		
//		int sub = num1 - num2; //빼기
//		System.out.println("빼기 결과 : " + sub);
//		
//		int mul = num1 * num2; //곱하기
//		System.out.println("곱하기 결과 : " + mul);
//		
//		int div = num1 / num2; //나누기
//		System.out.println("나누기 결과 : " + div);
		
		//switch로 원하는 계산
		switch(op) {
		case "+" :
			int add = num1 + num2;
			System.out.println("더하기 결과 : " + add);
			break;
		case "-" :
			int sub = num1 - num2;
			System.out.println("더하기 결과 : " + sub);
			break;
		case "*" :
			int mul = num1 * num2;
			System.out.println("더하기 결과 : " + mul);
			break;
		case "/" :
			int div = num1 / num2;
			System.out.println("더하기 결과 : " + div);
			break;
		default:
			break;
		}
	}

}
