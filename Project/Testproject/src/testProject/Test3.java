package testProject;
import java.util.*;
public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double length;
		double width;
		String op;
		System.out.print("area/perimeter 중 입력하세요 : ");
		op = sc.nextLine();
		System.out.print("가로 : ");
		length = sc.nextDouble();
		System.out.print("세로 : ");
		width = sc.nextDouble();

//		double area = length * width;
//		double perimeter = (length + width) * 2;
//		System.out.println("면적 :" + area);
//		System.out.println("둘레 :" + perimeter);
		
		switch(op) {
		case "area" :
			double area1 = length * width;
			System.out.println("면적 :" + area1);
			break;
		case "perimeter" :
			double perimeter1 = (length + width) * 2;
			System.out.println("둘레 :" + perimeter1);
			break;
		default:
			break;	
		}
		


		

	}

}
