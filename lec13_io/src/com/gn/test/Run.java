package com.gn.test;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String text = "";
		switch(num) {
		case 1 : text = "가위";break;
		case 2 : text = "바위";break;
		case 3 : text = "보";break;
		}
		System.out.println(text);
		
	
		
		
		
		int year = sc.nextInt();

	    boolean leapYear = false;

	    if(year % 4 == 0){
	        if(year % 100 != 0 || year %400 ==0){
	            leapYear = true;
	        }
	    }
	    
	    if(leapYear){
	        System.out.println("윤년");
	    } else{
	        System.out.println("평년");
	    }

		
		int num = 0;
		if(su % 2 ==0) {
			for(int i =0; i <=su; i+=2) {
				num += i;
			}
		}else {
			for(int j =1; j <=su; j+=2) {
				num += j;
			}
		}
		System.out.println(num);
		
		
		
		int num = sc.nextInt();
		
		int su = 0;
		String str = Integer.toString(num);
		
		for(int i =0; i <str.length(); i++ ) {
			su += Character.getNumericValue(str.charAt(i));
		}
		System.out.println(su);
		
		
		
		public class Main{
		    public static void main(String args[]){
		        // 입력 받은 문자열을 저장할 변수 선언
		        Scanner scan = new Scanner(System.in);
		        String str = scan.nextLine();
		        
		        // 문자열 내 포함된 알파벳의 빈도수를 저장할 해시맵 선언
		        HashMap<Character, Integer> alphabetCount = new HashMap<>();
		        
		        // 각 문자를 순회하면서 해당 문자의 빈도수를 계산
		        for(char c : str.toCharArray()){
		            if(alphabetCount.containsKey(c)){
		                alphabetCount.put(c, alphabetCount.get(c)+1);
		            }else{
		                alphabetCount.put(c, 1);
		            }
		        }

		        // 문자별 빈도수 출력
		        for(Character key : alphabetCount.keySet()){
		            System.out.println(key + " : " + alphabetCount.get(key) +"개");
		        }
		    }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
