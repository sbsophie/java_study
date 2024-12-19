package com.gn.homework01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
	public String method1(String song) {
		File dir = new File("C:\\test\\sub");
		if(dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir,"나비야1.dat");
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			System.out.println(song);
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try{
				if(fos != null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		return song;
	}
	
//	public String method2(String song) {
//		return song;
//	}
	
	
	
	
	
	
	
}
