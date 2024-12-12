package com.gn.homework01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===\n원하시는 업무의 번호를 선택하세요");
		System.out.println("1. 새 도서 추가");
//		insertBook();
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.println("메뉴 선택: ");

		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1 : insertBook(); break;
		case 2 : selectList(); break;
		case 3 : searchBook(); break;
		case 4 : deleteBook(); break;
		case 5 : ascBook(); break;
		case 9 : System.out.println("프로그램을 종료합니다");
		return;
		default : System.out.println("잘못 입력하였습니다.");
		}
	}
		
}
	public void insertBook() {
		String title = sc.nextLine();
		String author = sc.nextLine();
		int category = sc.nextInt();
		int price = sc.nextInt();
		
		String c = "";
		if(category == 1) {
			c = "인문";
		} else if(category == 2) {
			c = "자연과학";
		} else if(category == 3) {
			c = "어린이";
		} else {
			c = "기타";
		}
		
		Book sum = new Book(title,author,c,price);
	    // 6. BookController의 insert로 Book 객체 전달
		//getter/setter 사용해야하나??
		
		
	}
	
	public void selectList() {
		bc.selectList();
        // -> 결과값을 임의의 리스트 bookList생성하여 대입
		selectList b1 = new BookList();
		ArrayList selectList = bc.serchBook(Keyword);
		if(bookList.isEmpty()) {
			System.out.println("검색되는 도서가 없습니다.");
		} else {
			for(int i = 0;)
		}
       
        // 2-2. bookList가 비어있지 않은 경우
        // -> 반복문을 통해 bookList안의 Book 객체들 출력
		
	}
	public void searchBook() {
		// 1. 검색할 도서명 키워드 입력 받기(String keyword)
        // 2. BookControllr의 searchBook 메소드로 위의 keyword 전달
        // -> 결과 값을 임의의 리스트 searchList를 생성후 대입
        // -> 키워드가 완전한 도서명이 아니라 도서명의 일부 일 수 있고
        // 일부 키워드를 입력한 경우 해당 키워드를 포함하는 여러 개의 도서 조회됨
        // 단일 객체가 아니라 리스트로 조회
        // 3. 조건식 이용
        // 3-1. searchList가 비어 있는 경우
        // -> "검색 결과가 없습니다."라는 문구 출력
        // 3-2. searchList가 비어 있지 않은 경우
        // -> 반복문으로 searchList 안의 Book 객체 출력
		
		
		
	}
	public void deleteBook() {
		 // 1. 삭제할 도서명 입력 받기 (String title)
        // 2. 삭제할 저자명 입력 받기 (String author)
        // -> 같은 도서명을 가졌지만 저자명이 다른 경우
        // 다른 도서명을 가졌지만 저자명이 같은 경우도 있을 수 있음
        // 3. BookController의 deleteBook() 메소드로 title, author 전달
        // -> 결과값을 임의의 Book(참조변수명 remove) 객체에 대입
        // 4. 조건식 이용
        // 4-1. remove가 존재하는 경우
        // -> "성공적으로 삭제되었습니다." 문구 출력
        // 4-2. remove가 존재하지 않는 경우
        // -> "삭제할 도서를 찾지 못했습니다."라는 문구 출력
		
		
		
	}
	public void ascBook() {
		// 1. BookController의 ascBook() 메소드 호출
        // 2. 메소드 호출 결과가 1이면 성공, 그 외 실패
        // 3. 성공시 "정렬에 성공하였습니다." 출력 후 전체 목록 조회
        // 4. 실패시 "정렬에 실패하였습니다." 출력
		
		
		
	}
	
	
	
	
	
	
	
	
}
