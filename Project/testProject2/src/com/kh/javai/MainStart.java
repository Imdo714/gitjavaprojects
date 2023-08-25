package com.kh.javai;
import java.util.Scanner;

// main메서드를 실행해주기위한 class
public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 인스턴스 객체생성 방법
		// 클레스 객체이름 = new 생성자(클레스와 이름이 동일한 메서드);
//		Student choi = new Student("최지원", 48, "여자");
//		Student kim = new Student("김라라", 12, "남자");
//		아래 두 코드를 실행되면 각기 다른 결과값이 나타난다
//		이를통해 각기 다른 메모리공간을 확보하고 사용한다는 것을 알 수 있다.
//		choi.info();
//		kim.info();
		
		
// ---------------------------------------------------------------------
//		영어점수 수학점수 국어점수를 입력받아
//      각과목이 40점이상이고 평균이 60점 이상일 때 합격
//      조건을 충족하지 못하면 불합격을 나타내주는 프로그램작성
//      ex) 영어점수 : 40
//          국어점수 : 70
//          수학점수 : 70
//      	총 합 : 180
//			평 균 : 60.0
//          합격입니다.		
		
//		Student choi = new Student("최지원", 65, "남자");
//		
//		System.out.print("영어점수 : ");
//		choi.setEnScore(sc.nextInt());
//		
//		System.out.print("국어점수 : ");
//		choi.setKoScore(sc.nextInt());
//		
//		System.out.print("수학점수 : ");
//		choi.setMathScore(sc.nextInt());
//		
//		choi.displayMyInfo();
		
//-------------------------------------------------------------
		
//		//Car(String color, String company, String type, String engine, String date, int maxSpeed, int zero100, int maxCc)
//		Car jiwonCar = new Car("횐색", "bmw", "중형", "가솔린", "2023-08-04", 150, 5, 100);
//		jiwonCar.statusDisplay(1);
//		
//		// 행동을 입력받고 진행하는 프로그램을 작성하세요
//		// 1. 달린다.
//		// 2. 멈춘다.
//		// 3. 기름을 충전한다.
//		// 4. 속도와 잔여기름양을 확인한다.
//		// 다른버튼을 누르면 종료
//		boolean isFinish = false;
//		while(!isFinish) {
//			int num;
//			System.out.println("원하는 행동의 버튼을 클릭하세요.");
//			System.out.println("---------------------------");
//			System.out.println("1. 달린다.");
//			System.out.println("2. 멈춘다");
//			System.out.println("3. 기름을 충전한다.");
//			System.out.println("4. 속도와 잔여기름양을 확인한다.");
//			System.out.println("다른버튼을 누르면 종료");
//			System.out.println("---------------------------");
//			
//			num = sc.nextInt();
//			switch(num) {
//				case 1:
//					jiwonCar.onAxel();
//					jiwonCar.statusDisplay(2);
//					break;
//				case 2:
//					jiwonCar.onBreak();
//					jiwonCar.statusDisplay(2);
//					break;
//				case 3:
//					System.out.print("얼마나 충전하시겠습니까?");
//					int cc = sc.nextInt();
//					jiwonCar.insertCc(cc);
//					break;
//				case 4:
//					jiwonCar.statusDisplay(2);
//					break;
//				default:
//					isFinish = true;
//			}
//		}
		
		//package com.kh.javai;
//		Student choi = new Student("소망", 26, "남자");
//		Student kim = new Student("사랑", 23, "여자");
//		Student yoon = new Student("희망", 24, "남자");
//		Student.showCount();
		
		//최대 학생의 수는 30인 클레스(i, h, j)를 3개 만들어라
		Student[] iban = new Student[30];
		Student[] hban = new Student[30];
		Student[] jban = new Student[30];
		//선택한 반의 주소값을 가지고 있는 참조변수
		Student[] selectBan;
		
		while(true) {
			System.out.print("관리할 클레스를 선택해 주세요(i j h 반 중 선택 다른 키워드 입력시 종료) : ");		
			
			// 관리할 클레스를 선택해 주세요(i j k)
			switch(sc.next().charAt(0)) {
			case 'i' : 
				selectBan = iban;
				break;
			case 'j' :
				selectBan = jban;
				break;
			case  'h' :
				selectBan = hban;
				break;
			default:
				selectBan = null;
			}
			if(selectBan == null)
				break;
			boolean isTrue = true;
			
			while(isTrue) {
				System.out.println("1. 학생 추가");
				System.out.println("2. 학생 제거");
				System.out.println("3. 학생 목록 확인");
				System.out.println("4. 학생 조회");
				System.out.println("// 기타입력시 뒤로");
				switch(sc.nextInt()) {
				case 1: {//1. 학생 추가
					//selectBan의 마지막 빈자리를 찾는다.
					int index = 0;
					while(index < selectBan.length && selectBan[index] != null) {
						index++;
					}
					//selectBan에 자리가 있을 시 학생을 추가해준다.
					if(index == selectBan.length)
						System.out.println("더이상 해당반에는 학생을 추가할 수 없습니다.");
					else {
						System.out.println("추가할 학생의 이름, 나이, 성별을 입력해주세요.");
						selectBan[index] = new Student(sc.next(), sc.nextInt(), sc.next());
					}
				}break;
				case 2: {//2. 학생 제거
					int index = 0;
					while(index < selectBan.length && selectBan[index] != null) {
						index++;
					}
					if(index == 0)
						System.out.println("삭제할 학생이 없습니다.");
					else {
						selectBan[index-1] = null;
						Student.count--;
					}
				}break;
				case 3: {//3. 학생 목록 확인
					System.out.println("====================================");
					System.out.println("이름\t나이\t성별");
					for(int i = 0; i<selectBan.length;i++) {
						if(selectBan[i] == null)
							break;
						selectBan[i].info();
					}
					System.out.println("====================================");
				}break;
				case 4:{
					System.out.print("조회할 학생의 정보(이름, 나이, 성별)");
					String name = sc.next();
					int age = sc.nextInt();
					String gender = sc.next();
					Student tmp = null;
//					tmp = new Student(sc.next(), sc.nextInt(), sc.next());
					
					for(int i = 0; i < selectBan.length; i++) {
						
//						if(selectBan[i] == null)
//							break;
//						else if (selectBan[i].getAge() == age && selectBan[i].getName().equals(name) && selectBan[i].getGender().equals(gender)) {
//							tmp = selectBan[i];
//							break;
//						}
						
//						if(selectBan[i] == null)
//							break;
//						else if(selectBan[i].getAge() == tmp.getAge() && selectBan[i].getName().equals(tmp.getName()) && selectBan[i].getGender().equals(tmp.getGender())) {
//							System.out.println("해당 학생은 이미 등록 완료되었습니다.");
//							break;
//						}else
//							System.out.println("해당학생을 찾을 수 없습니다.");
//							break;
						
//						if(selectBan[i] == null)
//							break;
//						else if(selectBan[i].equals(name, age, gender)) {
//							tmp = selectBan[i];
//							break;
//						}
						if(selectBan[i] == null)
							break;
						else if(selectBan[i].equals(tmp)) {
							System.out.println("해당 학생은 이미 등록 완료되었습니다.");
							break;
						}
						
						
					}
//					 if(tmp != null)
//						 System.out.println("해당 학생은 이미 등록 완료되었습니다."); 
//					 else
//						 System.out.println("해당학생을 찾을 수 없습니다.");
					
				}
				default:
					isTrue = false;
				}
			}
		}
		
		System.out.print("총 학생의 수 : " + Student.count + "개 등록 완료하였습니다.");
		
	}
}
