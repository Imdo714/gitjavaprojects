package com.kh.inheritance;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	private static int[] count = new int[2];
	
	public static int[] PersonCount(){
		count[0] = 0;
		count[1] = 0;
		return count;
	}
	public void inserStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student();
				s[i].setName(name);
				s[i].setAge(age);
				s[i].setHeight(height);
				s[i].setWeight(weight);
				s[i].setGrade(grade);
				s[i].setMajor(major);
				break;
			}
		}
		
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void inserEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i < e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee();
				e[i].setName(name);
				e[i].setAge(age);
				e[i].setHeight(height);
				e[i].setWeight(weight);
				e[i].setSalary(salary);
				e[i].setDept(dept);
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
