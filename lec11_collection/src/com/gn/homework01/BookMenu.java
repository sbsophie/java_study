package com.gn.homework01;

import java.util.Scanner;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===\n원하시는 업무의 번호를 선택하세요");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.println("메뉴 선택: ");
		int select = sc.nextInt();
		//contain사용해보기
	}
	public void insertBook() {}
	public void selectList() {}
	public void searchBook() {}
	public void deleteBook() {}
	public void ascBook() {}
	
	
	
	
	
	
	
	
}
