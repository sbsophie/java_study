package com.gn.practice07;

public class Run {
	public static void main(String[] args) {
		
		Supplement[] sp;
		sp = new Supplement[4];
		
		Supplement a1 = new Supplement("유산균","1알",18000);
		sp[0] = a1;
		sp[1] = new Supplement("비타민B","1알",15000);
		sp[2] = new Supplement("루테인","2알",20000);
		sp[3] = new Supplement("비타민D","1알",12000);
		
		System.out.println("===========영양제 목록 ===========");
		System.out.println(sp[0].information()+"\n"+sp[1].information()+"\n"+sp[2].information()+"\n"+sp[3].information());
		
		
		
		
		
		
	}
}
