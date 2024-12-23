package com.gn.test;

public class Child extends Parent{
	public void paint() {
		super.draw();
		System.out.println("C");
	}
	public void draw() {
		System.out.println("D");
	}
}
