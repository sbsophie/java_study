package com.gn.study.practice02;

public class Pair<T,U> {
	private T first;
	private U second;
	
	//기본생성자(생성자에는 반환형이 없기 때문에 void쓰면 안됨)
	public Pair() {}
	//매개변수 생성자
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	public U getSecond() {
		return second;
	}

	
}
