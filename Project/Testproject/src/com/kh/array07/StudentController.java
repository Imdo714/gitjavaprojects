package com.kh.array07;

public class StudentController {
	private Student[] sArr;
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		sArr = new Student[5];
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	public Student[] printStudent() {
		return sArr;
	}
	
	public int sumScore() {
		int score = 0;
		for(int i = 0; i < sArr.length; i++) {
			score += sArr[i].getScore();
		}
		return score;
	}
	public double avgScore() {
		int sum = sumScore();
		double[] avgs = new double[2];
		avgs[0] = sum;
		avgs[1] = avgs[0] / 5;
		
		return avgs[1];
	}
}
