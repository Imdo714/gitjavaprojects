package com.kh.javab;
import java.util.*;
public class Management {
	Scanner sc = new Scanner(System.in);
	private static final Book[] BOOKLIST =  new Book[10];
	private static Management bookInstance = new Management();
	
	private Management(){}
	
	public static Management getInstance() {
		return bookInstance;
	}
	
	public int printMenu() {
		System.out.println("=========================");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 삭제");
		System.out.println("3. 책 목록 출력");
		System.out.println("4. 책 찾기");
		System.out.println("5. 도서 대출");
		System.out.println("=========================");
		System.out.print("원하시는 번호를 입력하세요. (다른 거 입력시 종료)");
		return sc.nextInt();
	}
	//책 등록
	public void joinBook() {
		if(this.BOOKLIST[this.BOOKLIST.length - 1] != null) {
				return;
			}
			Book.count++;
			saveBook(insertBook());
	}
	
	//책 실제로 배열에 저장
	public void saveBook(Book book) {
		for(int i = 0; i < this.BOOKLIST.length; i++) {
			if(this.BOOKLIST[i] == null) {
				this.BOOKLIST[i] = book;
				System.out.println(this.BOOKLIST[i].toStirng());
				break;
			}
			 
		}
	}
	
	// 등록할 책 작성
	public Book insertBook() {
		String bookname, date, person;
		int num;
		System.out.print("책이름 :");
		bookname = sc.next();
		System.out.print("날짜 :");
		date = sc.next();
		System.out.print("저자 :");
		person = sc.next();
		System.out.print("쪽수 :");
		num = sc.nextInt();
		
		return new Book(bookname, date, person, num);
	}
	
	//책 삭제
	public void deleteListBook() {
		for(int i = this.BOOKLIST.length - 1; i >= 0; i--) {
			if(this.BOOKLIST[i] != null) {
				System.out.println(this.BOOKLIST[i].getBookName() + "책을 삭제했습니다.");
				this.BOOKLIST[i] = null;
				Book.count--;
				break;
			}else if(this.BOOKLIST[i] == null && i == 0){
				System.out.println("더 이상 책이 없습니다.");
				break;
			}
		}
	}
	
	//대출
	public void loanBook() {
		System.out.println("어떤 책을 대출하겠습니까 : ");
		System.out.println("책이름 :" );
		String bookName = sc.next();
		
		
	}
	//책 목록
	public void viewBook() {
		for(int i = 0; i < this.BOOKLIST.length; i++) {
			if(this.BOOKLIST[i] != null) {
				System.out.println(this.BOOKLIST[i].toStirng());
			}else
				break;
			System.out.println("=========================");
		}
		System.out.println("총 권수 : " + Book.count);
	}
	
	//책 찾기
	public void bookFind() {
		System.out.println("어떤 책을 찾고 있니?");
		System.out.println("책이름 :" );
		String bookName = sc.next();
		System.out.println("날짜 :" );
		String bookDate = sc.next();
		System.out.println("저자 :" );
		String bookAuthor = sc.next();
		System.out.println("쪽수 :" );
		int bookNum = sc.nextInt();
		
		Book findBook = new Book(bookName, bookDate, bookAuthor, bookNum);
		for(int i = 0; i < this.BOOKLIST.length; i++) {
			if(this.BOOKLIST[i].bookEquals(findBook)) {
				System.out.println(this.BOOKLIST[i].getBookName() + "책을 찾았습니다.");
				break;
			}else {
				System.out.println("책은 없습니다.");
				break;
			}
			
		}
	}
}
