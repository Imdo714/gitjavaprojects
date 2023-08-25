package testProject;

public class BankAccountP0 {
	private int balance;
	String name;

	public BankAccountP0() {}
	
	public BankAccountP0(int i) {
		balance = i;
	}

	public BankAccountP0(int money, String pname) {
		balance = money;
		name = pname;
	}

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	
}
