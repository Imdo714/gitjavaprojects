package iffortoalexam;

public class Student {
	String name;
	int age;
	String gender;
	int mathScore;
	int enScore;
	int korScore;
	
	/*
	 * ������
	 * �ν��Ͻ� ��ü�� ������ �� �����͸� �ʱ�ȭ�ϱ� ���� 
	 * �ڵ����� �ѹ��� �����ϴ� Ư���� �޼��� �޼���ó�� �����ؼ� ������ �� ������
	 * class�� �̸��� ������ �̸��� ������. �ʱ�ȭ�� ���� �޼����̱� ������ ��ȯ���� ����. 
	 * �⺻������ �����ڸ� �ƹ��͵� �ۼ����� �ʾ��� ��
	 * �����Ϸ��� �⺻������ �������ִ� ������ (�ƹ� ����� ����.)
	 */
	public Student() {
		System.out.println("student�� �⺻ ������");
	}
	public Student(String tName, int tAge, String tGender) {
		name = tName;
		age = tAge;
		gender = tGender;
	}
	/*
	 * �޼���(��� ����)
	 * info �޼��� ����
	 * ���� OO�� ��OO OOO�Դϴ�. ��±��
	 */
	public void info() {
		System.out.println("����" + age +"���� ��" + gender + " "+ name + "�Դϴ�.");
	}
	//set�޼���(setrer) => �ʵ嵥���Ϳ� ���� �����ϱ� ���� �޼���
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
	//get �޼���(getter) => �ʵ嵥���Ϳ� ���� ����ϱ� ���� �޼���
	public int getEnscore() {
		return enScore;
	}
	public int getKoscore() {
		return korScore;
	}
	public int getMathscore() {
		return mathScore;
	}
	
	//����� ����ϴ� �޼���
	//��Ż���� ��ȯ�ϴ� �޼�,
	public int getTotal() {
		int total = enScore + korScore + mathScore;
		return total;
	}
	public float getAvg() {
		//int total = enScore + korScore + mathScore;
		return getTotal() / 3.0f;
	}
	
	//�հ����� ���հ����� ����� ������ִ� �޼���
	public void checkPass() {
		if(korScore >= 40 && enScore >= 40 && mathScore >= 40 && getAvg() >= 60) {
			System.out.println("�հ��Դϴ�.");
		}else
			System.out.println("���հ��Դϴ�.");
	}
	
	public boolean checkPassisTrue() {
		if(korScore >= 40 && enScore >= 40 && mathScore >= 40 && getAvg() >= 60) {
			return true;
		}else
			return false;
	}
	
	/*
	 * displayMyinfo �޼��带 ������.
	 * �Ű������� ����
	 * ���ϰ��� �������� �ʴ´�.
	 * ������ �����
	 * ���� OO���� OOO�Դϴ�.
	 * ���� : OO��
	 * ���� : OO��
	 * ���� : OO��
	 * �հ� : OO��
	 * ��� : OO��
	 * ���� ���迡 �հ��Դϴ�.
	 */
	public void displayMyingo() {
		System.out.println("���� " + age + "����" + name + "�Դϴ�.");
		System.out.println("���� : " + korScore);
		System.out.println("���� : " + enScore);
		System.out.println("���� : " + mathScore);
		System.out.println("�հ� : " + getTotal());
		System.out.println("��� : " + getAvg());
		if(checkPassisTrue()) {
			System.out.println("���� ���迡 �հ��Դϴ�. ");
		}else
			System.out.println("���� ���迡 ���հ��Դϴ�. ");
	}

}
