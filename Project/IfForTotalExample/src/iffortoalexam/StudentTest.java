package iffortoalexam;
import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�ν��Ͻ� ��ü ���� ���
		//Ŭ���� ��ü�̸� = new ������(Ŭ������ �̸��� ������ �޼���);
//		Student choi = new Student("�ֻ��", 48, "����");
//		Student kim = new Student("����", 12, "����");
		//�Ʒ� �� �ڵ带 ����Ǹ� ���� �ٸ� ������� ��Ÿ����.
		//�̸����� ���� �ٸ� �޸� ������ Ȯ���ϰ� ����Ѵٴ� ���� �� �� �ִ�.
//		choi.info();
//		kim.info();
		
		//�������� �������� ���������� �Է¹޾�
		//�������� 40�� �̻��̰� ����� 60�� �̻��� �� �հ�
		//������ �������� ���ϸ� ���հ��� ��Ÿ���ִ� ���α׷� �ۼ�
//      ex) �������� : 40
//      �������� : 70
//      �������� : 70
//      �� �� : 180
//      �� �� : 60.0
//      �հ��Դϴ�.      
		Student choi = new Student("�ֻ��", 48, "����");
		System.out.print("���� : ");
		choi.setEnScore(sc.nextInt());
		System.out.print("���� : ");
		choi.setKoScore(sc.nextInt());
		System.out.print("���� : ");
		choi.setmathScore(sc.nextInt());
		
		System.out.println("�������� : " + choi.getEnscore());
		System.out.println("�������� : " + choi.getKoscore());
		System.out.println("�������� : " + choi.getMathscore());
		System.out.println("���� : " + choi.getTotal());
		System.out.println("��� : " + choi.getAvg());
		
		choi.checkPass();
		
		
		//choi.displayMyingo();

		
		
	}

}
