package com.gn.test;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		
//		String text = "";
//		switch(num) {
//		case 1 : text = "가위";break;
//		case 2 : text = "바위";break;
//		case 3 : text = "보";break;
//		}
//		System.out.println(text);
//		
//	
//		
//		
//		
//		int year = sc.nextInt();
//
//	    boolean leapYear = false;
//
//	    if(year % 4 == 0){
//	        if(year % 100 != 0 || year %400 ==0){
//	            leapYear = true;
//	        }
//	    }
//	    
//	    if(leapYear){
//	        System.out.println("윤년");
//	    } else{
//	        System.out.println("평년");
//	    }
//
//		
//		int num = 0;
//		if(su % 2 ==0) {
//			for(int i =0; i <=su; i+=2) {
//				num += i;
//			}
//		}else {
//			for(int j =1; j <=su; j+=2) {
//				num += j;
//			}
//		}
//		System.out.println(num);
//		
//		
//		
//		int num = sc.nextInt();
//		
//		int su = 0;
//		String str = Integer.toString(num);
//		
//		for(int i =0; i <str.length(); i++ ) {
//			su += Character.getNumericValue(str.charAt(i));
//		}
//		System.out.println(su);
//		
//		
//		
//		public class Main{
//		    public static void main(String args[]){
//		        // 입력 받은 문자열을 저장할 변수 선언
//		        Scanner scan = new Scanner(System.in);
//		        String str = scan.nextLine();
//		        
//		        // 문자열 내 포함된 알파벳의 빈도수를 저장할 해시맵 선언
//		        HashMap<Character, Integer> alphabetCount = new HashMap<>();
//		        
//		        // 각 문자를 순회하면서 해당 문자의 빈도수를 계산
//		        for(char c : str.toCharArray()){
//		            if(alphabetCount.containsKey(c)){
//		                alphabetCount.put(c, alphabetCount.get(c)+1);
//		            }else{
//		                alphabetCount.put(c, 1);
//		            }
//		        }
//
//		        // 문자별 빈도수 출력
//		        for(Character key : alphabetCount.keySet()){
//		            System.out.println(key + " : " + alphabetCount.get(key) +"개");
//		        }
//		    }
//		}
//		
//		
//		
//		
//		int su = scan.nextInt();
//	    String str = String.valueOf(su);
//
//	    boolean b = true;
//	    for(int i =0; i<str.length()/2; i++){
//	        if(str.charAt(i) != str.charAt(str.length()-i-1)){
//	            b = false;
//	            break;
	
//		System.out.println("숫자를 입력하세요:");
//        int number = scan.nextInt();
//        
//        String strNumber = String.valueOf(number);
//        boolean isSymmetric = true;
//
//        for(int i=0 ; i<strNumber.length()/2 ; i++){
//            if(strNumber.charAt(i) != strNumber.charAt(strNumber.length() - i - 1)){
//                isSymmetric = false;
//                break;
//            }
//        }
//
//        if(isSymmetric){
//            System.out.println(strNumber + " => 대칭수");
//        } else{
//            System.out.println(strNumber + " => 대칭수아님");
//        }
//    }
//}
		
		
//		Scanner scan = new Scanner(System.in);
//
//		int totalAnimal = scan.nextInt();
//		int totalLegs = scan.nextInt();
//
//		for(int dogs= 0; dogs<=totalAnimal; ++dogs) {
//			int chicks = totalAnimal-dogs;
//			int legs = dogs*4+chicks*2;
//			if(totalLegs == legs&&dogs>=0&&chicks>=0) {
//				System.out.printf("%d %d",dogs,chicks);
//				return;
//			}else if(totalLegs != legs&&dogs<0&&chicks<0) {
//				continue;
//			}
//		}
//		System.out.println("계산불가");
//		
//		
//		
		
		
		
		
		
		
//		if(totalLegs<2*totalAnimal || totalLegs<4*totalAnimal) {
//			System.out.println("계산불가");
//		}else {
//			int dog = totalLegs-2*totalAnimal;
//			int chick = totalAnimal-dog;
//			System.out.println(dog+" "+chick);
//		}
		
		public class Main {
			 public static void main(String args[]) {
			    Scanner scan = new Scanner(System.in);
			    int cost = scan.nextInt();

			    int[] coins = {500,100,50,10,1};
			    double[] d = new double[coins.length];

			    for(int i =0; i <coins.length; i++){
			        if(cost>=coins[i]){
			            d[i] = cost/coins[i];
			            cost -= d[i]*coins[i];
			        }else{
			            d[i] =0;
			        }
			        System.out.println(coins[i]+"원:"+(int)d[i]+"개");
			    }

			 }
			}	
		
		
	
		
//		int[] arr = new int[5];
//		for(int i=0; i < arr.length-1; i--) {
//			arr[i] = i+10;
//			System.out.println(arr[i]);
//		}
//		for(int sum : arr) {
//			System.out.println(sum);
//		}
		

		int[] num = {-62,107,-12,89,-35};
		for(int a : num) {
			if(a > 50) {
				System.out.println(a);
			}
		}
		
		//홀수
		//오름차순 1,3,5,7,9
		
		
		
		
		
		
	}

}
