package com.gn.homework.dimensional;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		Practice practice = new Practice();

		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int number = sc.nextInt();
		
		int[] arr = new int[number];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+number;
			System.out.println(arr[i]);
		}
		
		for(int sum :arr) {
			System.out.println(sum);
		}
		
		
		
		
		
	}

}
