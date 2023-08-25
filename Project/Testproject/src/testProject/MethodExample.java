package testProject;

public class MethodExample {

	public static void main(String[] args) { //객체 없이 생성가능 (정적)
		BankAccount yoon = new BankAccount(5000,"sangwon");
		yoon.printBank();
		BankAccount won = new BankAccount();
		won.balance = 5000;
		won.name = "won";
		won.printBank();
		
		Person sang = new Person();
		
		sang.setName("Sangwon");
			
		}
}

class Person {
	private String name;
	private float height;
	private float weight;
	
	public Person() {}
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
}

class BankAccount {
	int balance;
	String name;
	
	public BankAccount() {
		balance = 0;
		name = null;
	}
	public BankAccount(int balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	public void information(String name, int age, char gender) {
		System.out.println(name +", " + age + ", " + gender);
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public void printBank() {
		System.out.println("이름 : " + name);
		System.out.println("잔액 : " + balance);
	}
}


