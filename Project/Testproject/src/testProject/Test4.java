package testProject;
import java.util.*;
public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month, day, hour, minute, second;
		
		System.out.print("년: ");
		year = sc.nextInt();
		System.out.print("월: ");
		month = sc.nextInt();
		System.out.print("일: ");
		day = sc.nextInt();
		System.out.print("시: ");
		hour = sc.nextInt();
		System.out.print("분: ");
		minute = sc.nextInt();
		System.out.print("초: ");
		second = sc.nextInt();

		if(12 < month) {
			System.out.println("error : second가 60보다 높습니다.");
		}else if(0 > month){
			System.out.println("error : second가 0보다 작습니다.");
		}
		
		if(24 < hour) {
			System.out.println("error : hour가 60보다 높습니다.");
		}else if(0 > hour){
			System.out.println("error : hour가 0보다 작습니다.");
		}
		
		if(60 <= minute) {
			System.out.println("error : minute가 60보다 높습니다.");
		}else if(0 > minute){
			System.out.println("error : minute가 0보다 작습니다.");
		}
		
		if(60 <= second) {
			System.out.println("error : second가 60보다 높습니다.");
		}else if(0 > second){
			System.out.println("error : second가 0보다 작습니다.");
		}
		
		

		System.out.println("지금은"+ year + "년 " + month + "월 "+ day 
				+ "일 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
			
		
		
	}

}
