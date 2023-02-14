//package com.ktdsuniversity.edu.coupling;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
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
//		
//		
//	}
//}
