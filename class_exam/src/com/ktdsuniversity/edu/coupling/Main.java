package com.ktdsuniversity.edu.coupling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
//		// 처음에 만든 회원 관리 서비스
//		MemberService memberService = new MemberService();
//		
//		memberService.regist();
//		memberService.unregist();
//		memberService.updateMyInfo();
//		
//		// 쓰다 보니 이걸 쓰는 게 아닌 걸 깨달음
//		// 그래서 EmployeeService를 사용하려 함.
//		
//		EmployeeService memberService = new EmployeeService();
//		
//		memberService.regist();
//		memberService.unregist();
//		memberService.updateMyInfo();
//		
//		// 하지만 다 에러남
//		// 이름들이 다 다름
//		// 심지어 메소드 다 바꿔야 하고,
//		// 파라미터까지 다르면 파라미터도 다 바꿔야 함.
//		
//		memberService.create();
//		memberService.update();
//		memberService.delete();
//		
//		// 그래서 이렇게 바꿈
//		// 근데 파라미터까지 다른 경우는 엄청난 고생.
//		// 80명이 일하면 80명에게 다 공지하고 다 바꿔야 함.
//		// 프로젝트 종료시간에 끝나는 데 지장을 줌.
//		// -> 인터페이스 사용
		
		
		
		// 이제 EmployeeService이던, MemberService이던 관계 없음.
		EmployeeService memberService = new EmployeeService();
		
		memberService.regist();
		memberService.unregist();
		memberService.updateMyInfo();
		
		MemberService memberService2 = new MemberService();
		
		memberService.regist();
		memberService.unregist();
		memberService.updateMyInfo();
		
		// 규칙
		// Sub class is a Super class
		MemberManagement memberService3 = new EmployeeService();
		
		memberService.regist();
		memberService.unregist();
		memberService.updateMyInfo();
		
		
		/**
		 * 상속 구조
		 * Iterable
		 * 		Collection
		 * 			List
		 * 				ArrayList
		 */
		

		// iterable 기능 쓸 수 있음
		Iterable<String> iterable = new ArrayList<>();
//		iterable.get(0);	// 쓸 수 없음.
		iterable.forEach(null);		// 이렇게는 가능

		
		// Iterable과 collection의 기능 쓸 수 있음
		Collection<Integer> collection = new ArrayList<>();
//		coleection.get(0);	// 쓸 수 없음.
		collection.forEach(null);	// 이렇게는 가능
		
		
		// iterable과 collection과 list의 기능을 쓸 수 있음.
		List<String> list = new ArrayList<>();
		list.get(0);	// list에만 정의된 메소드
		list.forEach(null);
		
		
//		iterable한테 forEach 정의되어 있음.
//		collection은 iterable을 상속 받고 있어 forEach 사용 가능.
//		list에도 forEach 없어 보이지만 Collection 상속 받고 있어 사용가능.
		
	}
}
