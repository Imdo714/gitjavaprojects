package com.kh.javai;

public class Car {
	String color; //색상
	String company; //제조회사
	String type; //타입(준준형, 중형, 대형, 스포츠카)
	String engine;//엔진(가솔린, 디젤, 하이브리드, 가스)
	String date;// ex)2023-08-04
	int maxSpeed;// 최대속도
	int zero100;// 제로백
	int speed;//속도
	int maxCc;// 최대 주유량
	int cc;//주유량
	
	//색상, 제조회사, 타입, 엔진, 제조날짜를 넘겨받아 초기화하는 생성자를 생성, zero100, maxCc
	// 나머지 값들은 알맞은 방식으로 초기화
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
	
	//onAxel 메서드를 호출하면 speed+5 하고 속도리턴
	//최대속도일때는 고정해서 리턴
	public int onAxel() {
		if ((speed + 5) >= maxSpeed) {
			speed = maxSpeed;
		} else {
			speed += 5;
		}
		return speed;
	}
	
	//onBreak메서드를 호출하면 speed-5 하고 속도리턴
	//최저속도는 0
	public int onBreak() {
		if ((speed - 5) <= 0) {
			speed = 0;
		} else {
			speed -= 5;
		}
		return speed;
	}
	// 넣은 기름만큼 추가 남은양 반환
	public int insertCc(int plusCc) {
		if (cc + plusCc > maxCc) {
			int tmpCc = (cc + plusCc - maxCc);
			cc = maxCc;
			return tmpCc;
		} else {
			cc += plusCc;
			return 0;
		}
	}
	
	//statusDisplay 차량상태 확인
	//("횐색", "bmw", "중형", "가솔린", "2023-08-04", 150, 5, 100);
	public void statusDisplay(int type) {
		switch(type) {
			case 1: {
				System.out.println("제차는 " + this.company + "에서 만든 " + 
						this.type+" " + this.engine + "차 입니다.\n"
						+ this.date + "에 출고되어 최대" + this.maxSpeed +
						"km로 " + this.maxCc + "cc가 다 소진될 때 까지 "
						+ "달릴 수 있습니다.");
			}break;
			case 2: {
				System.out.println("속도 : " + this.speed);
				System.out.println("잔여 기름 : " + this.cc);
			}
		}
	}
	
	
}
