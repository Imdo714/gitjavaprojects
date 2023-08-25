package com.kh.array07;

public class StudentMenu {
	private StudentController ssm;
	
	public StudentMenu() {
		ssm = new StudentController();
		System.out.println("========학생 정보 출력========");
		Student[] ss = ssm.printStudent();
		for(int i = 0; i < ss.length;i++) {
			System.out.println(ss[i].inform());
		}
		
		System.out.println();
		System.out.println("========학생 성적 출력========");
		System.out.println("학생 점수 합계 : " + ssm.sumScore());
		System.out.println("학생 점수 평균 : " + ssm.avgScore());
		
		System.out.println("========학생 결과 출력========");
		for(int i = 0; i < ss.length; i++) {
			if(ss[i].getScore() >= ssm.CUT_LINE) {
				System.out.println(ss[i].getName() + "학생은 통과입니다.");
			}else
				System.out.println(ss[i].getName() + "학생은 재시험 대상자입니다.");
		}

	}
	
}

