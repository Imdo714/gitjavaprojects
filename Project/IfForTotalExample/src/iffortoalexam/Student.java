package iffortoalexam;

public class Student {
	String name;
	int age;
	String gender;
	int mathScore;
	int enScore;
	int korScore;
	
	/*
	 * 생성자
	 * 인스턴스 객체를 생성할 때 데이터를 초기화하기 위해 
	 * 자동으로 한번만 실행하느 특별한 메서드 메서드처럼 접근해서 실행할 수 없으며
	 * class의 이름과 동일한 이름을 가진다. 초기화를 위한 메서드이기 때문에 변환값은 없다. 
	 * 기본생성자 생성자를 아무것도 작성하지 않았을 때
	 * 컴파일러가 기본적으로 생성해주는 생성자 (아무 기능이 없다.)
	 */
	public Student() {
		System.out.println("student의 기본 생성자");
	}
	public Student(String tName, int tAge, String tGender) {
		name = tName;
		age = tAge;
		gender = tGender;
	}
	/*
	 * 메서드(기능 집합)
	 * info 메서드 생성
	 * 저는 OO살 상OO OOO입니다. 출력기능
	 */
	public void info() {
		System.out.println("저는" + age +"살의 상" + gender + " "+ name + "입니다.");
	}
	//set메서드(setrer) => 필드데이터에 값을 저장하기 위한 메서드
	public void setEnScore(int tEnScore) {
		if(tEnScore < 0) {
			enScore = 0;
			return;
		}
		enScore = tEnScore;
	}
	
	public void setKoScore(int tKoScore) {
		if(tKoScore < 0) {
			korScore = 0;
			return;
		}
		korScore = tKoScore;
	}
	
	public void setmathScore(int tMathScore) {
		if(tMathScore < 0) {
			mathScore = 0;
			return;
		}
		mathScore = tMathScore;
	}
	//get 메서드(getter) => 필드데이터에 값을 사용하기 위한 메서드
	public int getEnscore() {
		return enScore;
	}
	public int getKoscore() {
		return korScore;
	}
	public int getMathscore() {
		return mathScore;
	}
	
	//기능을 담당하는 메서드
	//토탈값을 반환하는 메섣,
	public int getTotal() {
		int total = enScore + korScore + mathScore;
		return total;
	}
	public float getAvg() {
		//int total = enScore + korScore + mathScore;
		return getTotal() / 3.0f;
	}
	
	//합격인지 불합격인지 결과를 출력해주는 메서드
	public void checkPass() {
		if(korScore >= 40 && enScore >= 40 && mathScore >= 40 && getAvg() >= 60) {
			System.out.println("합격입니다.");
		}else
			System.out.println("불합격입니다.");
	}
	
	public boolean checkPassisTrue() {
		if(korScore >= 40 && enScore >= 40 && mathScore >= 40 && getAvg() >= 60) {
			return true;
		}else
			return false;
	}
	
	/*
	 * displayMyinfo 메서드를 만들어보자.
	 * 매개변수는 없고
	 * 리턴값도 존재하지 않는다.
	 * 실행해 결과로
	 * 저는 OO살의 OOO입니다.
	 * 국어 : OO점
	 * 영어 : OO점
	 * 수학 : OO점
	 * 합계 : OO점
	 * 평균 : OO점
	 * 으로 시험에 합격입니다.
	 */
	public void displayMyingo() {
		System.out.println("저는 " + age + "살의" + name + "입니다.");
		System.out.println("국어 : " + korScore);
		System.out.println("영어 : " + enScore);
		System.out.println("수학 : " + mathScore);
		System.out.println("합계 : " + getTotal());
		System.out.println("평균 : " + getAvg());
		if(checkPassisTrue()) {
			System.out.println("으로 시험에 합격입니다. ");
		}else
			System.out.println("으로 시험에 불합격입니다. ");
	}

}
