package testProject;
import java.math.*;
import java.util.Scanner;

public class Study0803 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//double형 num에 3.75 대입
//		double num = 3.75;
//		
//		//int로 입력받아 num2에 대입
//		System.out.print("배열의 길이 : ");
//		int num2 = sc.nextInt();
//		
//		//int형 배열에 num2길이만큼 받고 5 대입
//		int[] arr1 = new int[num2];
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i] = 5;
//		}
//		//배열값이 5일 때 5 출력 아니면 5가 아닙니다.
//		arr1[2] = 0;
//		for(int i = 0; i < arr1.length; i++) {
//			if(arr1[i] == 5) {
//				System.out.println(i + "번째는 5 입니다. ");
//			}else
//				System.out.println( i + "번째는 5가 아닙니다.");
//		}
//		int kor, eng, math, sum;
//		double avrg;
//		System.out.print("국어 :");
//		kor = sc.nextInt();
//		System.out.print("영어 :");
//		eng = sc.nextInt();
//		System.out.print("수학 :");
//		math = sc.nextInt();
//		
//		sum = kor + eng + math;
//		avrg = (double)sum / 3;
//		
//		System.out.println("합계 :" + sum);
//		System.out.println("평균 :" + avrg);
//		if(kor >= 50 && eng >= 50 && math >= 50 && avrg >= 70) {
//			System.out.println("합격");
//		}else
//			System.out.println("불합격");
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		int num;
//		while(true) {
//			System.out.print("1이상의 숫자를 입력하세요 :");
//			num = sc.nextInt();
//			int a = num;
//			if(num > 0) {
//				for(int i = 1; i <= num; i++) {
//					System.out.print(a-- + " ");
//				}
//				break;
//			}else {
//				System.out.print("1이상의 숫자를 입력해주세요.\n");
//			}
//		}
//		int num1, num2;
//		while(true) {
//			System.out.print("행 크기 : ");
//			num1 = sc.nextInt();
//			System.out.print("열 크기 : ");
//			num2 = sc.nextInt();
//			if(num1 > 0 && num2 > 0 && num1 < 11 && num2 < 11) {
//				char[][] arr = new char[num1][num2];
//				for(int i = 0; i < arr.length;i++) {
//					for(int j = 0; j < arr[i].length; j++) {
//						arr[i][j] =  (char)(Math.random() * 26 + 65);
//						System.out.print(arr[i][j] + " ");
//					}
//					System.out.println();
//				}
//				break;
//			}else
//				System.out.println("정수를 다시 입력해주세요.");
//		}
//		
//		
//		int b = (int)(Math.random() * 26 + 65);
//		System.out.println(b);
		
//		String[][] strArr = new String[][] {{"이","까","왔","앞","힘"},
//											{"차","지","습","으","냅"},
//											{"원", "열", "니", "로", "시"},
//											{"배", "심", "다", "좀", "다"},
//											{"열","히","! ","더", "!! "}};
//		for(int i = 0; i<strArr.length;i++) {
//			for(int j = 0; j < strArr[i].length; j++) {
//				System.out.print(strArr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		int num , num2;
//		char a = 'a';
//		System.out.print("행의 크기 :");
//		num = sc.nextInt();
//		char[][] arr = new char[num][];
//		for(int i = 0; i < num; i++) {
//			System.out.print(i + "행의 열 크기 : ");
//			num2 = sc.nextInt();
//			arr[i] = new char[num2];
//		}
//		
//		for(int i = 0; i< arr.length;i++) {
//			for(int j = 0; j <arr[i].length; j++) {
//				arr[i][j] = a++;
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		String[] arr = new String[]{"강건강", "남나나", "도대담", 
//				"류라라", "문미미", "박보배", 
//				"송성실", "윤예의", "진재주", 
//				"차천축", "피풍표", "홍하하"};
//		
//		String[][] arr2 = new String[3][2];
//		String[][] arr3 = new String[3][2];
//		
//		int index = 0;
//		System.out.println("1분단");
//		for(int i = 0; i< arr2.length;i++) {
//			for(int j = 0; j <arr2[i].length; j++) {
//				arr2[i][j] = arr[index++];
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//	}
//		System.out.println("2분단");
//
//		for(int i = 0; i< arr3.length;i++) {
//				for(int j = 0; j <arr3[i].length; j++) {
//					arr3[i][j] = arr[index++];
//					System.out.print(arr3[i][j] + " ");
//				}
//				System.out.println();
//		}
//		System.out.println("=============================================");
//		
//		
//		System.out.print("검색할 학생 이름을 입력하세요 : ");
//		String st = sc.next();
//		int  bundan = 0, line = 0, isRight = 0;
//		boolean isTrue = false;
//		
//		for(int i = 0; i< arr2.length && !isTrue;i++) {
//			for(int j = 0; j <arr2[i].length && !isTrue; j++) {
//				if(arr2[i][j].equals(st)) {
//					bundan = 1;
//					line = i+1;
//					isRight = j+1;
//					isTrue = true;
//				}
//			}
//		}
//		
//		if(isTrue) {
//			for(int i = 0; i< arr2.length;i++) {
//				for(int j = 0; j <arr2[i].length; j++) {
//					if(arr3[i][j].equals(st)) {
//						bundan = 2;
//						line = i;
//						isRight = j;
//						isTrue = true;
//					}
//				}
//			}
//		}
//		
//		if(!isTrue) {
//				System.out.println("검색하신 " + st + "학생은 " + bundan +"분단 " 
//				+ (line == 0 ? ("첫번째") : (line == 1 ? ("두번째") : ("세번째"))) + 
//				" 줄" +(isRight == 0 ? "왼쪽" : "오른쪽")+ "에 있습니다.");
//		}else {
//			System.out.println("검색하신 " + st + "학생은 찾지 못햇습니다.");
//		}
//		
//		
//		
	    String[] students = { //String[] students = new String[12]
	            "강건강", "남나나", // students[0] = "강건강";
	            "도대담", "류라라", // students[~11] = "홍하하";
	            "문미미", "박보배", 
	            "송성실", "윤예의",
	            "진재주", "차천축", 
	            "피풍표", "홍하하"
	        };
	        
	        String[][] classRoom1 = new String[3][2]; //{강건강[0], 남나나[1]},{도대담[2], 류라라[3]} {문미미[4], 박보배[5]} 
	        String[][] classRoom2 = new String[3][2]; //{송성실[6], 윤예의[7]},{진재주[8], 차천축[9]} {피풍표[10], 홍하하[11]} 
	        
	        int index = 0;
	        
	        // classRoom1에 students[0~5]의 값을 대입 시킨다.
	      for (int i = 0; i < classRoom1.length; i++) { //length = 3;
	         for (int j = 0; j < classRoom1[i].length; j++) {	//length = 2;
	            classRoom1[i][j] = students[index++]; // classRoom1[0~2][0~1] = students[0~5]
	         }
	      }
	      	// classRoom2에 students[6~11]의 값을 대입 시킨다.
	      for (int i = 0; i < classRoom2.length; i++) {//length = 3;
	         for (int j = 0; j < classRoom2[i].length; j++) { //length = 2;
	            classRoom2[i][j] = students[index++]; // classRoom1[0~2][0~1] = students[6~11]
	         }
	      }
	        //1분단 출력
	      System.out.println("== 1분단 ==");
	      for (int i = 0; i < classRoom1.length; i++) { //length = 3;
	         for (int j = 0; j < classRoom1[i].length; j++) { // length = 2;
	            System.out.print(classRoom1[i][j] + " "); //classRoom1[0][0],classRoom1[2][1] 까지 출력
	         }												//출력결과 {강건강 남나나}{도대담 류라라}{문미미 박보배}
	         System.out.println(); 
	      }
	      System.out.println("== 2분단 ==");
	      for (int i = 0; i < classRoom2.length; i++) {//length = 3;
	         for (int j = 0; j < classRoom2[i].length; j++) { // length = 2;
	            System.out.print(classRoom2[i][j] + " ");//classRoom1[0][0],classRoom1[2][1] 까지 출력
	         }												//출력결과 {강건강 남나나}{도대담 류라라}{문미미 박보배}
	         System.out.println(); // length 2를 끝내면 엔터;
	      }
	      
	      System.out.println("검색할 학생 이름을 입력하세요.");
	      String target = sc.next();					 //학생이름을 String으로 받는다.
	      int bundan = 0, line = 0, isRight = 0;		//몇분단(bundan), 몇번째줄(line), 어느손(isRight)
	      boolean isTrue = false;
	      
	      for (int i = 0; i < classRoom1.length && !isTrue; i++) { //3보다 작으면서 true면  
	         for (int j = 0; j < classRoom1[i].length && !isTrue; j++) {
	            if (classRoom1[i][j].equals(target)) {
	               bundan = 1;
	               line = i;
	               isRight = j;
	               isTrue = true;
	            }
	         }
	      }
	      
	      if (!isTrue) {
	         for (int i = 0; i < classRoom2.length && !isTrue; i++) {
	            for (int j = 0; j < classRoom2[i].length && !isTrue; j++) {
	               if (classRoom2[i][j].equals(target)) {
	                  bundan = 2;
	                  line = i;
	                  isRight = j;
	                  isTrue = true;
	               }
	            }
	         }
	      }
	      
	      
	      if (isTrue) {
	         System.out.print("검색하신 "+ target +" 학생은 "+ bundan +
	         "분단 "+( line == 0 ? ("첫번째") : (line == 1 ? ("두번째") : ("세번째")) )+" 줄"
	               + " "+(isRight == 0 ? "왼쪽" : "오른쪽")+"에 있습니다.");
	      } else {
	         System.out.print("검색하신 " + target + "학생은 찾지 못했습니다.");
	      }
		
		
		
		
	}

}
