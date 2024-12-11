package com.gn.study.practice02;

public class Run {
	public static void main(String[] args) {
		// 1. Pair타입 객체 생성 , 괄호안에 매개변수 생성자 활용
		Pair<String,Integer> p = new Pair<String,Integer>("apple",10);
		// getter를 통해 필드값 출력
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
		
	}
}
