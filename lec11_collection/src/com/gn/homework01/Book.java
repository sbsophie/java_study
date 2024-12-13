package com.gn.homework01;

public class Book implements Comparable <Book>{
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {}
	
	public Book(String title,String author,String category,int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}
	public int getPrice() {
		return price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String toString() {
		return "제목(저자명),장르,가격";
	}

	@Override
	public int compareTo(Book other) {
		return (this.title.compareTo(other.title));
	
	}

	
	
	
	
}
