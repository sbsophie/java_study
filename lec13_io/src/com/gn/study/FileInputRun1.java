package com.gn.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputRun1 {
	public static void main(String[] args) {

// int 방식	
		// 1. 파일 위치 지정
		File dir = new File("C:\\test\\sub");
		File file = new File(dir,"sample1.dat");
		// 2. 파일 입력 스트림 선언
		FileInputStream in = null;
		// 3. 파일 입력 스트림 생성
		try {
			in = new FileInputStream(file);
			// 4. 읽은 데이터를 보관할 배열을 만들어주기
			// (1) 아래 파일 크기만한 비어있는 배열을 만든거임
			byte[] arr = new byte[(int)file.length()];
			int idx = 0;   // 등번호
			// 5. 읽어오기
			// (2) 잃어올 데이터 담을 변수 만들어주기
			int data;
			// (3) 반복문을 사용하여 파일 내부 정보 잃어오는 방법
			while(true) {
				data = in.read();
				if(data == -1) break;
				arr[idx++] = (byte)data;
			}
			// 6.확인하는 방법			
			String str = new String(arr);
			System.out.println(str);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 7. 닫아주기
			try {
				if(in != null) in.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
