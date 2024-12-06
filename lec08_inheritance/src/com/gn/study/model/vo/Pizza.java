package com.gn.study.model.vo;

public class Pizza extends Food{
	@Override //이걸 넣어놓으면 틀린부분,오류등을 알려줌
	public void printReaction() {
		System.out.println("Buono!!");
	}
}
