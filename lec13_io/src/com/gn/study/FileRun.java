package com.gn.study;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class FileRun {
	public static void main(String[] args) {
//		// 1. 디렉토리 생성
//		//(1) File 객체 선언
//		File dir1;
//		//(2) File 객체 생성 -> 디렉토리 경로 지정
//		dir1 = new File("C:\\exampleDir");
//		//(3) 디렉토리 생성
//		dir1.mkdir();
//		
//		File dir2 = new File("C:\\parentDir\\childDir");
//		dir2.mkdirs();
		
		// 2. 디렉토리 삭제
		//(1) File 객체 선언 및 생성
//		File path1 = new File("C:\\exampleDir");
		//(2) delete() 메소드 호출
//		path1.delete();
		
//		File path2 = new File("C:\\parentDir\\childDir");
//		File path2 = new File("C:\\parentDir");
//		path2.delete();

		// 3. 디렉토리 존재 유뮤 확인
//		File dir3 = new File("C:\\testDir");
//		if(dir3.exists() == false) {  //if(!dir3.exists()) 이렇게도 쓸 수 있음(같은의미)
////			dir3.mkdirs();
//			if(dir3.mkdirs()) {
//				System.out.println("정상 생성");
//			} else {
//				System.out.println("실패");
//			}
//		} else {
//			System.out.println("이미 존재하는 경로");
//		}
	
		//삭제
//		if(dir3.exists()) {
//			if(dir3.delete()) {
//				System.out.println("정상 삭제");
//			} else {
//				System.out.println("실패");
//			}
//		}
		
		// 있으면 없애고 없애면 생기게 하는 방법
//		if(dir3.exists()) {
//			dir3.delete();
//		} else {
//			dir3.mkdirs();
//		}
		
		// 4. 파일 생성
//		File dir1 = new File("C:\\parentDir\\childDir"); //폴더가 아닌 파일을 만들려면 이거 추가 
//		File file1 = new File("C:\\parentDir\\childDir\\example.txt");
//		try {
//			if(!dir1.exists()) {
//				dir1.mkdirs();
//			}
//			if(file1.createNewFile()) {
//				System.out.println("파일 생성 성공");
//			} else {
//				System.out.println("파일 생성 실패");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// 5. 파일 삭제
//		if(file1.exists()) {
//			if(file1.delete()) {
//				System.out.println("삭제 성공");
//			} else {
//				System.out.println("삭제 실패");
//			}
//		}
		
		// 6. 파일 디렉토리 정보 확인
		// (1) 배열 : listFiles()   //컴퓨터 안에 파일위치 접근(조회) 가능
		File testDir = new File("C:\\dev\\java\\program");
		File[] files = testDir.listFiles();
		for(File f : files) {
			System.out.println(f);
		}
		// (2) 유형확인
		// isDirectory() 디렉토리인지 확인하는 방법
		// isFile()  파일인지 확인하는 방법
		File test = new File("C:\\test\\sub\\test1.txt.txt");
		if(test.isDirectory()) System.out.println("디렉토리!!");
		if(test.isFile()) System.out.println("파일~");
		if(test.exists()) {
			if(test.isFile()) System.out.println("진짜 파일");
		}
		//삼항연산자 활용 방법
		String type = test.isDirectory() ? "디렉토리" : "파일";
		
		// (3) 부모 확인  (상위 디렉토리 확인)
		// getParent() 나 위에 있는 부모의 디렉토리를 문자형태로 
		System.out.println(test.getParent());
		
		// (4) 이름 확인  (파일명 확인)
		// getName()  본인이름 
		System.out.println(test.getName());
		
		// 5. 파일의 전체 경로 확인
		// getPath() 
		System.out.println(test.getPath());
		
		// 6. 파일의 마지막 수정 날짜 확인
		// lastModified()    long으로 반환하는아이   
		// 마지막 수정시간을 밀리초단위로 반환/SimpleDateFormat사용하여 예쁘게 출력가능
		long millis = test.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(millis);
		System.out.println(date);
		
		
		long byte1 = test.length();
		System.out.println(byte1/1024.0);
		// byte를 kb로 변환하기
		double kbSize = byte1/1024.0;
		// kb
		double result = Math.round(kbSize*10)/10.0;
		System.out.println(result);
		
		// 랜덤 UUID
		UUID rnd = UUID.randomUUID();
		System.out.println(rnd);
		// 7. UUID와 파일명
		File dir = new File("C:\\tset\\sub");
		String uuid = UUID.randomUUID().toString();
		File file = new File(dir,uuid+".dat");
		try {
			if(file.exists() == false) {
				file.createNewFile();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
