package com.ktdsuniversity.edu.infext;

public class Main {
	
	// 인터페이스가 두 개니깐, 메소드도 두 개로 만들어 보자..
	// addPoint() 두 개를 나눴다고 생각.
	public static void memberManage(MemberService memberService) {
		memberService.regist();
		memberService.updateMyInfo();
		memberService.unregist();
	}
	public static void vipMemberManage(VipMemberService memberService) {
		memberService.regist();
		memberService.updateMyInfo();
		memberService.addPoint(50);
		memberService.unregist();
	}

	
	public static void main(String[] args) {
		
		// Sub class is a Super Class
		MemberService memberService = new MemberServiceImpl();
		MemberService vipMemberService = new VipMemberServiceImpl();

		memberManage(memberService);
		vipMemberManage(vipMemberService);
		
	
		
		
		
		
//		/**
//		 * 상속 구조
//		 * 		MemberService
//		 * 			(클래스)MemberServiceImpl
//		 * 				VipMemberService
//		 * 					(클래스) VipMemberServiceImpl
//		 */
//		
//		// Sub class is a Super class
//		MemberService memberService = new MemberServiceImpl();
//		memberService.regist();
//		memberService.updateMyInfo();
//		memberService.unregist();
//		
//		MemberService vipMemberService = new VipMemberServiceImpl();
//		vipMemberService.regist();
//		vipMemberService.updateMyInfo();
//		vipMemberService.unregist();
////		vipMemberService.addPoint(1000);	// MemberService에는 없어서 못 씀

	}
	
	
}
