package com.gn.homework01;

import java.util.Scanner;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		int su = 0;
		do {
			System.out.println("메뉴 선택: ");
			su = sc.nextInt();
			if(su == 9) {
				System.out.println("프로그램을 종료합니다");
			}
		}while(true);
		
//		if(bc.contains(1,2,3,4,5,9)) {
//			System.out.println();
//		} else {
//			System.out.println("잘못 입력하였습니다");
//		}
		
	}
	public void insertBook() {
		String title = sc.nextLine();
		String author = sc.nextLine();
		int category = sc.nextInt();
		int price = sc.nextInt();
		
		public Book(String title,String author,int category,int price) {
			this.title = title;
			this.author = author;
			this.category = category;
			this.price = price;
		}
		Book bk = new Book(title,author,category,price);
	        // 5. 매개변수 생성자를 이용하여 Book 객체 생성
	        // 장르명 입력은 숫자로 받지만 객체 생성할때는 문자열로 넘기기
	        // (1:인문 / 2:자연과학 / 3:어린이 / 그 외:기타)
	        // 6. BookController의 insert로 Book 객체 전달
		
		
		
	}
	public void selectList() {
		// 1. BookController의 selectList 메소드 호출
		bc.selectList();
        // -> 결과값을 임의의 리스트 bookList생성하여 대입
        // 2. 조건식 이용
        // 2-1. bookList가 비어있는 경우
        // -> "존재하는 도서가 없습니다."라는 문구 출력
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
