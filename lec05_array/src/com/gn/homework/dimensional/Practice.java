package com.gn.homework.dimensional;

public class Practice {  //[완료~!!]
	public void practice01() {
		int tall1 = 152;
		int tall2 = 180;
		int tall3 = 165;
		int tall4 = 158;
		int tall5 = 171;
		
		int[] tall = {152,180,165,158,171};
		
		int[] num;
		num = new int[5];
		
		//0 -> 1,2,3,4
		//1-> 2,3,4
		//2-> 3,4
		//3-> 4
		
		for(int i = 0; i < tall.length-1; i++) {
			for(int j = i+1; j < tall.length; j++) {
				if(tall[i] > tall[j]) {
					int temp = tall[i];
					tall[i] = tall[j];
					tall[j] = temp;
				}
			}
		}
		for(int t : tall) {
			System.out.println(t);
		}


	}

	
	public void practice02() {
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
