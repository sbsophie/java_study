package com.gn.practice;

public class Practice08 {

	public static void main(String[] args) {
		
		int num = 0;
		for(int i = 2; i <= 9; i++) {
			if(num == 45) {
				break;
			}
			System.out.println("==="+i+"단===");
			for(int j = 1; j <=9; j++) {
				num = i*j;
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println("계산 결과가 "+num+"입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int test = 0;
//		
//		for(int i = 2; i <= 9; i++) {
//			if(test == 27) {
//				break;
//			}
//			System.out.println("==="+i+"단 ===");
//			for(int j = 1 ; j <=9; j++) {
//				test = i *j;
//			System.out.println(i+ " * "+ j +" = "+(i*j));
//			}
//
//		}
		
		
		
		
		
		

	}

}
