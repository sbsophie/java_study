package com.gn.practice07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File file = new File("C:\\test\\sub\\practice\\output.txt.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			StringBuilder sb = new StringBuilder();
			while(true) {
				String data = br.readLine();
				if(data == null) {
					break;
				} 
				sb.append(data).append("\n");
			}

			System.out.println(sb.toString());
			
			String str = sb.toString();
//			str.replace(" ", "");
//			System.out.println(str);
			str = str.replace(" ", "");
//			System.out.println(str);
			System.out.println(str.length());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
