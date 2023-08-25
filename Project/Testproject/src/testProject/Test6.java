package testProject;
import java.util.*;
public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double math, kor, eng;
		System.out.print("국어 : ");
		math = sc.nextDouble();
		System.out.print("영어 : ");
		kor = sc.nextDouble();
		System.out.print("수학 : ");
		eng = sc.nextDouble();
		
		
		double total = math + kor + eng;
		double average = total / 3;
		System.out.println("총점 : "+ (int)total);
		System.out.println("평균 : " + (int)(average));
		
	}

}