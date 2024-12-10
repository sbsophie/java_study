package com.gn.homework02.run;

import com.gn.homework02.model.vo.Dish;
import com.gn.homework02.model.vo.Drink;
import com.gn.homework02.model.vo.Menu;

public class Main {
	public static void main(String[] args) {
		Menu[] arr = new Menu[5];

//		2. 각 인덱스별로 무작위로 Drink, Dish 객체를 생성
//		3. 반복문으로 각 인덱스별 객체의 cook() 메소드 실행
//		for문
		for(int i = 0; i < arr.length; i++) {  //Math.length
			int rnd = (int)(Math.random()*11);
			
			if(rnd > 5) {
			arr[i] = new Dish("떡뽁이",15000,"떡");
			} else {
				arr[i] = new Drink("밀크티",5000,"타피오카");
			}
		} 
		
		for(Menu a:arr) {
			a.cook();
		}
		
		
		
		
	}
}
