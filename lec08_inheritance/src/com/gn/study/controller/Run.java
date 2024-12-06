package com.gn.study.controller;

import com.gn.study.model.vo.Flower;
import com.gn.study.model.vo.Juice;
import com.gn.study.model.vo.Pizza;

public class Run {
	public static void main(String[] args) {
//		Dog d = new Dog();
//		d.eat();
//		
//		Parent p = new Parent();
//		System.out.println(p.getA());
//		Child c = new Child();
		
		Juice j = new Juice("트로피칼",500,"용과");
		j.printInfo(); //위 세가지 다 출력됨
		j.juiceInfo(); //용과 하나만 출력됨
	
// Pizza		
		Pizza p = new Pizza();
		p.printReaction();
		
// Flower
		Flower f1 = new Flower("장미","빨간색");
		Flower f2 = new Flower("장미","빨간색");
		
		if(f1.equals(f2)) {
			System.out.println("똑같아요!");
		} else {
			System.out.println("X");
		}
		
		// flower클래스의 override2라고 한것을 입력하고 출력하려면 아래출력문 쓰기
		System.out.println(f1);
		
		
		
	}
}
