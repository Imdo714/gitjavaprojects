package testProject;

public class whileTest {

	public static void main(String[] args) {
		
		int dan = 2;
		for(int i = 1; i< 9; i++) {
			System.out.println(dan + " * " + i + " = " +(i * dan));
		}
		
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " +(i * j));
			}
			System.out.println(i+"단");
			
		}
	}

}
