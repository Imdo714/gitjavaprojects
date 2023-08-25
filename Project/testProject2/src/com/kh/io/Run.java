package com.kh.io;
import java.io.*;
public class Run {

	public static void main(String[] args) {
		//파일 이름
		String filepath = "myFile.txt";
		
		//파일 생성
		try {
			File file = new File(filepath);
			boolean isFileCreated = file.createNewFile();
			if(isFileCreated) {
				System.out.print("파일 생성 완료 : " + filepath);
			}else
				System.out.print("파일 생성 실패");
		}catch(IOException e){
			e.printStackTrace();
		}
		//파일 글쓰기
//		try {
//			OutputStream out = new FileOutputStream(filepath);
//			out.write(12);
//			out.close();
//		}catch(IOException e ) {
//			e.printStackTrace();
//		}
//		//파일 출력
//		try {
//			InputStream in = new FileInputStream(filepath);
//			System.out.println(in.read());
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		try {
			FileWriter fw = new FileWriter(filepath, true);
			fw.append("hi");
			fw.append("jiwon");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 파일 출력
		try {
			InputStream in = new FileInputStream(filepath);
			System.out.println(in.read());

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
