package com.gn.homework01;

public class Book {
	public String title;
	public String author;
	public String category;
	public int price;
	
	public Book() {}
	
	public Book(String title,String author,String category,int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	public String getTitile() {
		
	}
	
	
	
	
	
	
	
	public String toString() {
		return "제목(저자명),장르,가격";
	}
	
	
	
}
