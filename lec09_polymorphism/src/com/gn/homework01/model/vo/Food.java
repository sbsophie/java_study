package com.gn.homework01.model.vo;

public class Food extends Product {
	private int expirationDays;
	
	public Food() {}
	
	public Food(String name,int price,int expirationDays) {
		super(name,price);
		this.expirationDays = expirationDays;
	}
	
	public int getExpirationDays() {
		return 3;
	}
	public int calculateDiscountRate() {
		if(expirationDays < 1) {
			return 80;
		} else if(expirationDays < 5) {
			return 50;
		} else if(expirationDays < 10) {
			return 20;
		} else {
			return 0;
		}
	}
	
	
	// 원래가격*(100-80)/100
	//할인률(할인전금액-할인후금액)/할인*100
	@Override
	public int calculatePrice() {
		// return calculateDiscountRate;
		return ((getPrice()*(100-calculateDiscountRate()))/100);
	}
	
	
}
