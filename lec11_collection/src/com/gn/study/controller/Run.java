package com.gn.study.controller;

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
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
