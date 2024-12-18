package com.gn.practice02;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import com.gn.practice01.Practice;

public class Run {
	public static void main(String[] args) {
//		C:\\test\\sub 디렉토리 아래에 파일을 생성하세요.
//		파일명은 UUID를 활용하여 구성하세요.
//		단, 파일명에 -(하이픈)은 없어야 합니다.
//		확장자는 .txt를 사용하세요.
		
		File dir = new File("C:\\test\\sub");
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replace("-", "");
		File file = new File(dir,uuid+".txt");
		
		try {
			if(file.exists() == false) {
					file.createNewFile();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
		//삭제 
		File dir1 = new File("C:\\test\\sub\\test1.txt.txt");
		if(dir1.exists()) {
			dir1.delete(); System.out.println("test1.txt 파일 삭제");
		}
		
		
		
		
	}
}
