package com.gn.test;

public class Test {

	public static void main(String[] args) {
		
		    	int price = 0;
		        double discount = 0;
		      
		        if(price >= 500000){
		             discount = 0.2;
		        } else if(price >= 300000){
		            discount = 0.1;
		        } else if(price >= 100000){
		            discount = 0.05;
		        }

		        System.out.println(price);
		        
		        public int[] solution(int money)
		        int[] answer = {};
		        int max = money/5500;
		        int change = money-(5500*max);
		        answer = new int[] {max,change};
		        return answer;
		        
		        
		        
	}
}
