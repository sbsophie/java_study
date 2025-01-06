package com.gn.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
// continue 활용하는 방법		
//		for(int i =1; i <10; i++) {
//			if(i%2==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
//		String str = sc.nextLine();
//		
//		for(int i =0; i <str.length(); i++) {
//			if(str.charAt(i) == ' ') {
//				continue;
//			}
//		}
		
//배열		
				
				

//		String[] friends = {"박지영","김태우","이지훈","최유진","정승호"};
//		
//		for(int i =0; i< friends.length; i++) {
//			int num = i+1;
//			if(i %2 == 0) {				
//				System.out.println(num+" : "+friends[i]);
//			}
//		}
//		
//		String text = "안녕 정현아";
//		char[] charArr = text.toCharArray() ;
//		for(int i =0; i <charArr.length; i++) {
//			System.out.println(charArr[i]);
//		}
		
		int[] attend = {1,1,1,1,1,0,1,0,0,1};
		
		int sum =0;
		for(int i =0; i < attend.length; i++) {
			if(attend[i] ==1) {
				sum ++;	
			}			
		}
		System.out.println(sum);
		

		
		
		
		
	}
}
