package com.gn.study.capsule.open;

// getter, setter 사용 x
public class Account1 {
	public String user;
	public int balance;
	
	// 기본 생성자
	public Account1() {}
	
	// 매개변수 생성자
	public Account1(String user,int balance) {
		this.user = user;
		this.balance = balance;
	}
	
}
