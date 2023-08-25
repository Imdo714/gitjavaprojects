package testProject;
import java.util.*;
public class lfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//
//		if(i>0) {
//			System.out.println("양수입니다.");
//		} else if(i ==0){
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}
		String season;
		
		int month = sc.nextInt();
		int temperature = sc.nextInt();
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			if(temperature <= -15) {
				season += " 한파 경보";
			}else if(temperature <= 12) {
				season += " 한파 주의보";
			}
		}
		else if(month >= 3 && month <= 5) {
			season = "봄";
		}
		else if(month >= 6 && month <= 8) {
			season = "여름";
			if(temperature >= 35) {
				season += " 폭염 경보";
			}else if(temperature >= 33) {
				season += " 폭염 주의보";
			}
		}
		else if(month >= 9 && month <= 11) {
			season = "가을";
		}
		else {
			season = "해당하는 계절이 없습니다.";
		}
		System.out.println(season);			
	}

}
