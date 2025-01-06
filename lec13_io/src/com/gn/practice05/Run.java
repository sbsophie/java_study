package com.gn.practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
	
		File dir = new File("C:\\test\\sub");
		File file = new File(dir,"애국가1.dat");
		
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			
			byte[] arr = new byte[(int)file.length()];
			int idx = 0;
			
			int data = 0;
			while(true) {
				data = in.read();
				if(data == -1) break;
				arr[idx++] = (byte)data;
			}
			String str = new String(arr);
			System.out.println(str);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) in.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
