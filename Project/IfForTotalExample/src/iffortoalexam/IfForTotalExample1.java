package iffortoalexam;
import java.util.*;

public class IfForTotalExample1 {
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		if(num > 0 && num != 0) {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					System.out.print("��");
				}else
					System.out.print("��");
			}
		}else
			System.out.print("������ �ƴմϴ�.");
	}
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		if(num > 0 && num != 0) {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					System.out.print("��");
				}else
					System.out.print("��");
			}
		}else
			System.out.print("����� �ƴմϴ�.");
	}
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.next();
		System.out.print("���� : ");
		char ch = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i< str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(str + " �ȿ� ���Ե� " + ch + "���� : " + count);
	}
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		while((ch == 'y' && ch == 'Y') || (ch != 'N' && ch != 'n')) {
			
			System.out.print("���ڿ� : ");
			String str = sc.next();
			System.out.print("���� : ");
			ch = sc.next().charAt(0);
			int count = 0;
			for (int i = 0; i< str.length(); i++) {
				if(ch == str.charAt(i)) {
					count++;
				}
			}
			System.out.println(str + " �ȿ� ���Ե� " + ch + "���� : " + count);
			while(ch != 'y') {
				System.out.print("�� �Ͻðڽ��ϱ�? (y/n) : ");
				ch = sc.next().charAt(0);
				if(ch == 'y' || ch == 'Y') {
					ch = 'y';
				}else if (ch != 'n' && ch != 'N') {
					System.out.print("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.\n");
				}else {
					break;
				}
					
			}
			
		}
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int nan = random.nextInt(100);
		System.out.println("������ �Է��ϼ��� : " + nan);
		int num = 1, count = 0;
	
		while(nan != num) {
			if(num <= 0 || num > 100) {
				System.out.println("1~ 100������ ���ڸ� �Է����ּ���.");
				num = 1;
				System.out.println("�ѤѤѤѤѤѤѤѤ�");
			}else {
				System.out.print("1~100������ ������ ������ ���纸����. : ");
				num = sc.nextInt();
				count++;
				if(nan > num)
					System.out.println("UP!");
				else
					System.out.println("DOWN!");
			}
		}
		System.out.println("�����Դϴ�!!");
		System.out.println(count + "ȸ���� ���߼̽��ϴ�.");

	}
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		
	}
	public static void main(String[] args) {
		practice6();
	}

}
