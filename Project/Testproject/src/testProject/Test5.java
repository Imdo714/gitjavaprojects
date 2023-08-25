package testProject;
import java.util.*;
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("문자 : ");
		ch = sc.next().charAt(0);
		System.out.println( ch + " unicode :" + (int)ch);
		System.out.println( ch + " unicode :" + (ch + 0));
	}
}
