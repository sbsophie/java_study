package com.gn.study.controller;

import java.util.ArrayList;
import java.util.List;

public class ToDoListChecker {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		// 1. isEmpty()   리스트가 비어있는지 확인
		if(list.isEmpty()) {
			System.out.println("할 일이 아직 없습니다.");
		}
		
		// 2. add()   할 일 추가
		list.add("운동하기");
		list.add("책 읽기");
		
		// 3. contains(Object)  특정 항목이 있는지 확인
		if(list.contains("코딩 공부하기")) {
			System.out.println("o");
		} else {
			System.out.println("x");
			list.add("코딩 공부하기");
		}
		System.out.println(list);
		
		// 4. indexOf(Object)   특정 항목이 인덱스 몇번째에 있는지 확인
		System.out.println(list.indexOf("코딩 공부하기"));
		if(list.indexOf("영화보기") == -1) {
			list.add("영화보기");
		}
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
