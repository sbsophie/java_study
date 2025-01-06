package com.gn.study;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufWriterRun {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		File file = new File(dir,"sample2.txt");
//		FileWriter fw = null;
//		BufferedWriter bw = null;
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
//		try(FileWriter fw = new FileWriter(file)){ 
//			fw = new FileWriter(file,true); //true넣으면 생성모드에서 추가모드로 바뀌면서 내용을 얹어줄 수 있음
//			bw = new BufferedWriter(fw);
			
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("반갑습니다.");
			bw.newLine();
			
		}catch(IOException e ) {
			e.printStackTrace();
		}
//		}finally{
//			try {
//				if(bw != null) bw.close();
//				if(fw != null) fw.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
