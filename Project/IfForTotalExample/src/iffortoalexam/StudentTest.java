package iffortoalexam;
import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//인스턴스 객체 생성 방법
		//클레스 객체이름 = new 생성자(클레스와 이름이 동일한 메서드);
//		Student choi = new Student("최상원", 48, "남자");
//		Student kim = new Student("김라라", 12, "여자");
		//아래 두 코드를 실행되면 각기 다른 결과값이 나타난다.
		//이를통해 각기 다른 메모리 공간을 확보하고 사용한다는 것을 알 수 있다.
//		choi.info();
//		kim.info();
		
		//영어점수 수학점수 국어점수를 입력받아
		//각과목이 40점 이상이고 평균이 60점 이상일 때 합격
		//조건을 충족하짐 못하면 불합격을 나타내주는 프로그램 작성
//      ex) 영어점수 : 40
//      국어점수 : 70
//      수학점수 : 70
//      총 합 : 180
//      평 균 : 60.0
//      합격입니다.      
		Student choi = new Student("최상원", 48, "남자");
		System.out.print("영어 : ");
		choi.setEnScore(sc.nextInt());
		System.out.print("국어 : ");
		choi.setKoScore(sc.nextInt());
		System.out.print("수학 : ");
		choi.setmathScore(sc.nextInt());
		
		System.out.println("영어점수 : " + choi.getEnscore());
		System.out.println("국어점수 : " + choi.getKoscore());
		System.out.println("수학점수 : " + choi.getMathscore());
		System.out.println("총합 : " + choi.getTotal());
		System.out.println("평균 : " + choi.getAvg());
		
		choi.checkPass();
		
		
		//choi.displayMyingo();

		
		
	}

}
