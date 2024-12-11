package com.gn.study.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieTheater {
	public static void main(String[] args) {
		List<String> seats = new ArrayList<String>();
		seats.add("A2");
		seats.add("A1");
		seats.add("B1");
		seats.add("B2");
		
		System.out.println("초기 좌석 목록 :"+seats);
		
		seats.add(2,"A3");
		System.out.println("A3 좌석 추가 후 : "+seats);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("예약 좌석 : ");
		String info = sc.nextLine();
		
		int a = seats.indexOf(info);
		if(a != -1) {
			seats.set(a,info+"(예약)");
		} else {
			System.out.println(info+"는(은) 존재하지 않는 좌석입니다.");
		}
		System.out.println("좌석 예약 후 : "+seats);
		
		
		String delate = sc.next();
		int b = seats.indexOf(delate);
		if(b != -1 ) {
			seats.remove(b);
		} 
		System.out.println("좌석 삭제 후"+seats);
		
		Collections.sort(seats);
		System.out.println("좌석 정렬 후 : "+seats);
		
		
		
		
		
		
		
		
	}
}
