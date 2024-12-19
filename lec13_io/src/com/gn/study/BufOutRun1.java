package com.gn.study;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufOutRun1 {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub\\241219");
		if(dir.exists()==false) {
			dir.mkdirs();
		}
		
		// 2. 파일 객체 생성
		File file = new File(dir,"sample3.dat");
		// 3. 스트림 생성
		FileOutputStream fos = null;   // 터널
		BufferedOutputStream bos = null;  //에스컬레이터
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String str = "how are you?\n" + "I'm fine thank you\n";
			bos.write(str.getBytes());
						
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos!=null) bos.close();  // 에스컬레이터 먼저 닫아줘야함
				if(fos!=null) fos.close();  // 그 다음 터널 close
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
