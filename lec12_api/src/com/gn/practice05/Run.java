package com.gn.practice05;

public class Run {
	public static void main(String[] args) {
		String[] words = {"java", "application", "programming", "interface"};
		
//		배열 words에 있는 모든 단어를 연결해서 문장으로 만드세요.
//		단, 단어 사이에는 한 칸 공백을 넣고, 마지막 단어 뒤에는 공백을 넣지 않습니다.
		String allWords = String.join(" ", words);
		System.out.println("문장 : "+allWords);
//		연결된 문장에서 두번째 단어의 첫글자, 세번째 단어의 첫글자, 네번째 단어의 첫글자까지 추출하여 대문자로 변환한 새 문자열을 출력하세요.
		allWords = allWords.toUpperCase();
		System.out.print("변환 : ");
		System.out.print(allWords.substring(5,6));
		System.out.print(allWords.substring(17,18));
		System.out.print(allWords.substring(29,30));
		
//		선생님 답안
//		String result = "";
//		for(int i = 1; i < words.length; i++) {
//			result += words[i].substring(0,1).toUpperCase();
//		}
		
		
		
	}
}
