package iffortoalexam;

public class Car {
	String color; //����
	String company; //����ȸ��
	String type; //Ÿ��(������, ����, ����,������ī)
	String engine; //����(���ָ�, ����, ���̺긮��, ����)
	String date; //2023-08-04;
	int maxSpeed; //�ִ� �ӷ�
	int zero100; //���ι�
	int speed; // �ӵ�
	int maxCc; //�ִ� ������
	int cc; //������
	
	//����, ����ȸ��, Ÿ��, ����, ������¥�� �Ѱܹ޾� �ʱ�ȭ�ϴ� �����ڸ� ����, zero100, maxCc
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
	//onAxel �޼��带 ȣ���ϸ� speed +5�ϰ� �ӵ�����
	//�ִ�ӵ��ϴ�� �����ؼ� ����
	public int onAxel() {
		if((speed + 5) >= maxSpeed) {
			speed = maxSpeed;
		}else {
			speed += 5; 
		}
		return speed;
	}
	
}
