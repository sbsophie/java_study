package com.gn.practice04;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		List<Product> product = new ArrayList<Product>();
		product.add(new Product("사과",1000));
		product.add(new Product("바나나",2000));
		product.add(new Product("딸기",3000));
		
		for(Product p : product) {
			System.out.println(p);
		}
		
		product.remove(1);
		System.out.println(product);
		
		product.set(0,new Product("오렌지",1500));
		System.out.println(product);
		
		for(int i =0; i < product.size(); i++) {
			System.out.println(product.get(i));
		}
		
		
		
		
		
		
		
		
		
		
	}
}
