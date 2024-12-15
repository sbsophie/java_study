package com.gn.homework02.controller;

import java.util.HashSet;
import java.util.Set;

import com.gn.homework02.model.vo.Lottery;

public class LotteryController {
	private Set<Lottery> lottery = new HashSet<Lottery>();
	private Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		// 1. 전달 받은 l을 lottry HashSet에 추가
		lottery.add(l);
		// 2. 추가 결과를 boolean 값으로 반환
		return l;
		
		
		
	}
	public boolean deleteObject(Lottery l) {
		// 1. 전달 받은 l을 lottery에서 삭제
		// 2. 당첨자 목록 win중에 삭제된 추첨 대상자가 존재할 수 있음
		// 3. 삭제 결과인 boolean 값과 win 객체가 null이 아닐 때에만
		// win에도 해당 추첨 대상자 삭제
		
		
		
		
		
	}
	public Set<Lottery> searchObject(){
		// lottery를 리턴
		return lottery;
		
		
		
	}
	public Set<Lottery> winObject(){
		// 1. 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		// -> 당첨 목록을 찾기 전에 추첨 대상의 수가 4보다 큰지 먼저 확인
		// -> lottery의 크기가 4보다 작은 경우 null 리턴
		// 2. 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고
		// 인덱스를 이용해 win에 당첨자 저장
		// 이때, 당첨자 수는 무조건 4명 이를 위한 추첨자 수는 4명 이상
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외
		// 삭제된 사람의 자리만 새로운 추첨자로 채우기
		
		
	
		
	}
	public Set<Lottery> sortedWinObject(){
		// 1. 이름을 오름차순으로 정렬
		// 이름이 같으면 번호로 오름차순 정렬
		// 정렬의 결과를 반환
		// 이때, 미리 만들어진 win을 가지고 정렬
		
		
		
		
	}
	public boolean searchWinner(Lottery l) {
		// 1. win에 해당 객체가 있는지 확인
		// 2. 결과 boolean을 리턴
		
		
		
		
	}
	
	
	
	
	
	
}
