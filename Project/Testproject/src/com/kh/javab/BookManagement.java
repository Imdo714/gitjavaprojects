package com.kh.javab;
import java.util.*;
public class BookManagement {

	public static void main(String[] args) {
		Management manageMent = Management.getInstance();
		boolean isTrue = true;
		while(isTrue) {
			switch(manageMent.printMenu()) {
				case 1: {
					manageMent.joinBook();
				}break;
				case 2: {
					manageMent.deleteListBook();
				}break;
				case 3: {
					manageMent.viewBook();
				}break;
				case 4: {
					manageMent.bookFind();
				}break;
				default :
					isTrue = false;
			}
		}
//		Scanner sc = new Scanner(System.in);
//		Book[] book = new Book[10];
//		book[0] = new Book("공간", "2023.05.05", "김철수", 500);
//		boolean isTrue = true;
//		//책 등록
//		for(int i = 0; i < book.length; i++) {
//			if(book[i] == null) {
//				String bookname, date, person;
//				int num;
//				System.out.print("책이름 :");
//				bookname = sc.next();
//				System.out.print("날짜 :");
//				date = sc.next();
//				System.out.print("저자 :");
//				person = sc.next();
//				System.out.print("쪽수 :");
//				num = sc.nextInt();
//				book[i] = new Book(bookname, date, person, num);
//				break;
//			}
//		}
//		//마지막 책 삭제
//		for(int i = book.length-1; i >= 0; i--) {
//			if(book[i] != null) {
//				System.out.println(book[i].getBookName() + "책을 삭제했습니다.");
//				book[i] = null;
//				break;
//			}
//		}
//		//책 목록
//		for(int i = 0; i < book.length; i++) {
//			if(book[i] != null) {
//				System.out.println(book[i].toStirng());
//				System.out.println(Book.count);
//			}else
//				break;
//		}
//		//책 찾기
//		
//		System.out.print("어떤 책을 찾고 있니? (책이름, 저자, 날짜, 쪽수)");
//		System.out.println("책이름 :" );
//		String bookName = sc.next();
//		System.out.println("날짜 :" );
//		String bookDate = sc.next();
//		System.out.println("저자 :" );
//		String bookAuthor = sc.next();
//		System.out.println("쪽수 :" );
//		int bookNum = sc.nextInt();
//		
//		Book findBook = new Book(bookName, bookDate, bookAuthor, bookNum);
//		for(int i = 0; i < book.length; i++) {
//			if(book[i].bookEquals(findBook)) {
//				System.out.println(book[i].getBookName() + "책을 찾았습니다.");
//			}else {
//				System.out.println("책은 없습니다.");
//			}
//			
//		}
	
	}

}
