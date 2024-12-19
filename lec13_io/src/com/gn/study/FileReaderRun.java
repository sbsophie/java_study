package com.gn.study;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderRun {
	public static void main(String[] args) {
		// 1. 디렉토리,파일 생성하기 (읽어들일때는 디렉토리에 파일 같이 생성해도 괜찮음)
		File file = new File("C:\\test\\sub\\sample1.txt");
		
		// 2. 파일 입력 스트림 선언(텍스트)
		FileReader fr = null;
		try {
			// 3. 파일 입력 스트림 생성 방법
			fr = new FileReader(file);
			// 4. 읽을 단위를 지정해주는 방법 -> int, char[]
			// (1) int  -> 한땀한땀 가지고 올때 사용
			StringBuilder sb = new StringBuilder();
//			while(true) {
//				int data = fr.read();
//				if(data == -1) break;
//				sb.append((char)data);
//			}
			// (2) char[]  -> 바가지로 가지고 올때 사용
			char[] std = new char[3];
			while(true) {
				int data = fr.read(std);
				if(data == -1) break;
				sb.append(std,0,data);
			}

			System.out.println(sb.toString());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
