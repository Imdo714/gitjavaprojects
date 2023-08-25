package kh.model.net;

import java.io.*;

public class IOexample {
	public void output() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("test.txt");
			fw.write(97);
			fw.write(65);
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		IOexample ie = new IOexample();
		ie.output();
	}
}
