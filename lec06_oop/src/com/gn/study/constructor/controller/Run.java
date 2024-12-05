package com.gn.study.constructor.controller;

import com.gn.study.constructor.model.vo.Book;
import com.gn.study.constructor.model.vo.Cake;
import com.gn.study.constructor.model.vo.Car;
import com.gn.study.constructor.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		// 기본생성자
		Car c1 = new Car();
		
		// 매개변수 생성자
		Car c2 = new Car("현태","회색",2024);
		
		// Run 클래스에 Book 객체 생성하기
		Book b1 = new Book(15900);
		Book b2 = new Book(20000);
		
		
		// 오버로딩 초기화
		String[] students = {"김철수","이영희","홍길동"};
		for(int i = 0; i < students.length; i++) {
			Student s = new Student();
			s.printInfo(i);
			s.printInfo(students[i]);
			s.printInfo(i,students[i]);
		}
		
		System.out.println("============ 케이크 =============");
		
		// Cake 초기화
		Cake c = new Cake();
		//인스턴스 변수
		// 4.변수 기본값
		// 5.명시적 초기화
		// 2순위 : 초기화 블록
		// 1순위 : 생성자를 이용한 초기화
		System.out.println(c.flavor);
		
		// 클래스 변수(static)
		// 3순위(제일 낮은순위) : 변수 기본값
		// 2순위 : 명시적 초기화
		// 1순위 : 초기화 블록
		System.out.println(c.price);
		
		
		
		
	}
}
