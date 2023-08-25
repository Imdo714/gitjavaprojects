package testProject;
import java.util.*;
public class swicthTest {
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num == 1)
			System.out.println("입력 메뉴입니다.");
		else if(num == 2)
			System.out.println("수정 메뉴입니다.");
		else if(num == 3)
			System.out.println("조회 메뉴입니다.");
		else if(num == 4)
			System.out.println("삭제 메뉴입니다.");
		else if(num == 7)
			System.out.println("종료 메뉴입니다.");

	}
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1: System.out.println("입력 메뉴입니다."); break;
		case 2: System.out.println("수정 메뉴입니다."); break;
		case 3: System.out.println("조회 메뉴입니다."); break;
		case 4: System.out.println("삭제 메뉴입니다."); break;
		case 7: System.out.println("종료 메뉴입니다."); break;
		default: 
			break;
		}

	}
	
		public static void practice3() {
			Scanner sc = new Scanner(System.in);
			String h;
			h = sc.nextLine();
			String ret;
			String[] modNum = h.split("-");
			for(int i = 0; i<modNum.length; i++) {
				ret = modNum[i];
				System.out.println("ret"+ i + " = "+ ret);
			}
	    }
		
		public static void prac1() {
			String str2 = "서울, 대전, 대구, 부산, 인천, 울산";
			String[] cityArr = str2.split(",");
			for(int i = 0; i<str2.length(); i++) {
				System.out.println(cityArr[i]);
			}
		}
		
	    public static void practice4() {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = a%2;
			if (a < 0)
				System.out.println("양수만 입력해주세요.");
			else if(b == 0)
				System.out.println("짝수다.");
			else if(b != 0)
				System.out.println("홀수다.");
		}
	    
	    public static void practice5() {
			Scanner sc = new Scanner(System.in);
			int kor, math, eng, total;
			double avrg;
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
			System.out.print("수학 점수 : ");
			math = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
			
			total = kor + math + eng;
			avrg = total / 3;
			
			if(kor>=40 && math >= 40 && eng >=40 && avrg >= 60) {
				System.out.println("국어 : " + kor);
				System.out.println("수학 : " + math);
				System.out.println("영어 : " + eng);
				System.out.println("합계 : " + total);
				System.out.println("평균 : " + avrg);
				System.out.println("축하합니다. 합격입니다!");
			}else
			    System.out.println("불합격입니다.");
	    }
	    public static void practice6() {
	    	Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			String day = sc.next();
			
			switch(num) {
				case 1:
					System.out.print("1입니다.");
				case 2:
					System.out.print("2입니다.");
				default:	
			}
			switch(day) {
			case "월": 
			case "화": 
			case "수": 
			case "목": 
			case "금": System.out.print("금일은 정상 영업합니다.");
					  break;
			case "토": 
			case "일":System.out.print("금일은 휴일 입니다.");
						break;
			default: System.out.print("잘못입력");
						break;
			}
	    }
	    
	    public static void practice7() {
	    	Scanner sc = new Scanner(System.in);
	    	final String ID = "myID";
	    	final String PASSWORD = "myPassword12";
	    	
	    	String id, password;
	    	
	    	System.out.print("아이디 : ");
	    	id = sc.next();
	    	System.out.print("비밀번호 : ");
	    	password = sc.next();
	    	
	    	//switch로 작성
	    	switch(id) {
	    	case ID : 
	    		switch(password) {
	    		case PASSWORD : System.out.print("로그인 성공");
	    					break;
	    		default : System.out.println("비밀번호가 틀렸습니다.");
	    					break;	
	    		}
	    		break;	
	    	default : System.out.println("아이디가 틀렸습니다");
	    			break;
	    		
	    	}
	    	//if로 작성
//	    	if(ID.equals(id) && PASSWORD.equals(password)) {
//	    		System.out.print("로그인 성공");
//	    	}else {
//	    		if(!ID.equals(id)){
//		    		System.out.println("아이디가 틀렸습니다");
//		    	}else if(!PASSWORD.equals(password)) {
//		    		System.out.println("비밀번호가 틀렸습니다.");
//		    	}
//	    	}

	    }

	public static void main(String[] args) {
		prac1();	
	}

}
