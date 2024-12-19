package com.gn.homework01;

import java.io.BufferedOutputStream;
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
			String str = song;
//			byte[] arr = song.getBytes();
//			fos.write(arr);
//			fos.flush();
			System.out.println(str);
			
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
	
	public String method2(String song) {
		File dir = new File("C:\\test\\sub");
		if(dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir,"나비야2.dat");
		
		FileOutputStream fos = null;
		BufferedOutputStream bf = null;
		try {
			fos = new FileOutputStream(file);
			bf = new BufferedOutputStream(fos);
			String str = song;
			System.out.println(song);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bf != null) bf.close();
				if(fos != null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		return song;
	}
	
	
	
	
	
	
	
}
