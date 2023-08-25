package testProject;

public class Studymain {

	public static void main(String[] args) {
		BankAccountP0 choi1 = new BankAccountP0();
		BankAccountP0 choi2 = new BankAccountP0(1000);
		BankAccountP0 choi3 = new BankAccountP0(1000, "지원");
		choi1.deposit(1000);
		
		choi1.checkMyBalance();
	}

}
