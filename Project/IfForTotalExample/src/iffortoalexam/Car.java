package iffortoalexam;

public class Car {
	String color; //색상
	String company; //제조회사
	String type; //타입(준준형, 중형, 대형,스포츠카)
	String engine; //엔젠(가솔린, 디젤, 하이브리드, 가스)
	String date; //2023-08-04;
	int maxSpeed; //최대 속력
	int zero100; //제로백
	int speed; // 속도
	int maxCc; //최대 주유량
	int cc; //주유량
	
	//색상, 제조회사, 타입, 엔진, 제조날짜를 넘겨받아 초기화하는 생성자를 생성, zero100, maxCc
	public Car() {}
	
	public Car(String color, String company, String type, String engine, String date, int maxSpeed, int zero100, int maxCc) {
		this.color = color;
		this.company = company;
		this.type = type;
		this.engine = engine;
		this.date = date;
		this.maxSpeed = maxSpeed;
		this.zero100 = zero100;
		this.maxCc = maxCc;
		this.cc = 0;
		this.speed = 0;
	}
	//onAxel 메서드를 호출하면 speed +5하고 속도리턴
	//최대속도일대는 고정해서 리턴
	public int onAxel() {
		if((speed + 5) >= maxSpeed) {
			speed = maxSpeed;
		}else {
			speed += 5; 
		}
		return speed;
	}
	
}
