package com.gn.test;

public class Test {

	public static void main(String[] args) {
		
//		for(int i = 1; i<= 100; i++) {
//				if(i % 3 == 0 || i % 5 == 0) {
//					System.out.println(i);
//				}
//		}

//		for(int i =1; i <=50; i++) {
//			if(i % 7 ==0) {
//				System.out.println(i);
//			}
//		}
		int sum =0;
		for(int i=1; i <=20; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		
		
		
	}
}
