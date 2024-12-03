package com.gn.study.field.model.vo;

public class Car {
// [접근제한자]	
	// 인스턴스 변수(필드)
	// 명시적 초기화(=초기값;)
	public static final String name="avante";
	// 브랜드
	// public -> 본인,같은패키지,후손,전체안에 있는 애들만 접근할 수 있음
	public static String brand;
	// 색깔
	// protected -> 본인,같은패키지,후손안에 있는 애들만 접근할 수 있음
	protected String color;
	// 가격
	// (default) -> 본인,같은패키지안에 있는 애들만 접근할 수 있음
	int price;
	// 제조년도
	// private -> 본인안에 있는 애들만 접근할 수 있음
	private int year;
	
// [예약어] 종류 3가지 : static, final, static final
// [초기화] 종류 3가지 : 명시적 초기화,초기화 블록을 통한 초기화,생성자를 이용한 초기화

	// 인스턴스 블록
	{year = 2024;}  //이렇게 정해져 있어서 이렇게만 써야함
	
	// 클래스 블록
	static {brand = "폭스바겐";}
	
	
	
	
}
