package com.gn.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gn.study.model.vo.Container;
import com.gn.study.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
	
//Boxing
	Integer iNum = 100;
	
//Unboxing
	int num = iNum;
	
//parse메소드
	String str1 = "123";
	String str2 = "456";
	System.out.println(str1+str2); // 123456으로 출력됨
	
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
	System.out.println(num1+num2); // 579 더한값으로 출력됨
	
	str2 ="1.34";  // 재할당
	System.out.println(str2+str2);
	double num3 = Double.parseDouble(str2);
	System.out.println(num3+num3);
	
// NumberFormatException    숫자가 아닌 문자열을 잡아주기위해 try사용
	try {
		String[] arr = new String[3];
		arr[0] = "일";
		int arrnum = Integer.parseInt(arr[0]);
	}catch(NumberFormatException e) {
		e.printStackTrace();
	}
	System.out.println("숫자가 아닌 문자열");
	
// ClassCastException 형변환을 하다가 문제가 생기는경우
	try {
	Object o = 9;
	String oStr = (String)o;
	}catch(ClassCastException e) {
		e.printStackTrace();
	}
	System.out.println("선넘은 형변환");
	
// 제네릭
	Container<Integer> con = new Container<Integer>();
	con.setItem(50);
	Container<String> tain = new Container<String>();
	tain.setItem("안녕");
	
// List(ArrayList)
	// 1. 선언,생성하고 import하기
	List<String> list = new ArrayList<String>();  
	// 2. 추가 
	List<String> meal = new ArrayList<String>();
	meal.add("아침");
	meal.add("점심");
	System.out.println(meal);
	
	meal.add(1,"간식");
	System.out.println(meal);
	
	// 3.삭제
	meal.remove(1);
	System.out.println(meal);
	
	meal.clear();
	System.out.println(meal);
	
	// 4. 요소 변경
	List<Integer> nums = new ArrayList<Integer>();
	nums.add(15);
	nums.add(10);
	nums.add(23);
	System.out.println(nums);
	
	nums.set(1, 500);   //안에 들어가 있는걸 바꾸는거 set
	System.out.println(nums);
	
	// 5. 요소 조회  getter 표준출력문안에 넣어서 출력해야함
	System.out.println(nums.get(0));
	//반복문 for문
	for(int i = 0; i < nums.size(); i++) {   //length말고 size를 사용
		System.out.println(i+" : "+nums.get(i));
	}
	// 향상된 for문(for each문)
	for(Integer n : nums) {    //Integer 부분에 int라고 써도 괜찮음
		System.out.println(n);
	}
	
	// ArrayList의 정렬
	System.out.println("정렬 전 : "+nums);
	
	Collections.sort(nums);
	System.out.println("오름차순 : "+nums);
	
	Collections.sort(nums,Collections.reverseOrder());
	System.out.println("내림차순 : "+nums);
	
	// ArrayList <객체>
	List<Student> students = new ArrayList<Student>();
	students.add(new Student("김철수",50));
	System.out.println(students);  // 출력했을때 주소값이 나와서 예쁘게 출력
	 							//하고 싶으면 stuent클래스에 toString해주기
	
	if(students.contains(new Student("김철수",50))) {
		System.out.println("o");
	}else {
		System.out.println("x");
	}
// Run에 있는 equals로 재정리해줘야함
	if(students.indexOf(new Student("김철수",50))!= -1) {
		System.out.println("o");
	}else {
		System.out.println("x");
	}
	
	
	students.add(new Student("이영희",40));
	students.add(new Student("홍길동",30));
	System.out.println("정렬 전 : "+students);
	Collections.sort(students);
	System.out.println("정렬 후 : "+students);
	
	
	
	
	
	
	
	
	
	}
}
