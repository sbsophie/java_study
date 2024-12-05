package com.gn.study.constructor.model.vo;

public class Test {
	public void test(int i) {}
	
	public void test(String str) {}  // 타입이 다르기 때문에 성립
	public void test(int i,String str) {} // 매개변수 개수가 다르기 떄문에 성립
//	public void test(int num){}
//	public char test(int point){}
	public void test(int i, int k) {} // 타입은 같지만 개수가 다르기 때문에 성립
//	public void test(int num,String string) {}
	public void test(String str, int i) {} // 두번째랑 순서가 다르기 떄문에 성립함
}
