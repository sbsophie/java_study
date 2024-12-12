package com.gn.practice06.controller;

import java.util.HashSet;
import java.util.Set;

import com.gn.practice06.model.vo.Food;

public class Run {
	public static void main(String[] args) {
		Set<Food> set = new HashSet<Food>();
		set.add(new Food("샐러드",14000));
		set.add(new Food("치킨",23000));
		set.add(new Food("치킨",50000));
		
		set.remove(new Food("치킨",50000));
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
	}
}
