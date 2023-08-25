package kh.model.vo;

import java.io.*;
import java.util.Scanner;

public class Food implements Serializable {
	String name;
	int kcal;

	public Food() {
	}

	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}

	public String getName() {
		return this.name;
	}

	public int getKcal() {
		return this.kcal;
	}

	public void setName() {
		this.name = name;
	}

	public void setKcal() {
		this.kcal = kcal;
	}

	@Override
	public String toString() {
		return "이름은" + name + "칼로리는" + kcal;
	}

	public static void fileSave(String fileName) {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			String name;
			int kcal;
			Scanner sc = new Scanner(System.in);
			System.out.print("음식의 이름은 : "); 
			name = sc.nextLine(); //사과
			System.out.print("칼로리는 : "); //20
			kcal = sc.nextInt();
			Food food = new Food(name, kcal);
			oos.writeObject(food);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		fileSave("sd");
	}
}
