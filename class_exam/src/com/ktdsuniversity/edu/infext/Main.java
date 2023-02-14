package com.ktdsuniversity.edu.infext;

import java.util.List;

public class Main {
	
	public static void memberManage(MemberService memberService) {
		memberService.regist();
		memberService.updateMyInfo();
		memberService.unregist();
		
//		if (memberService instanceof VipMemberService) {
//			
//			// 상속 받은 자식이 부모한테도 갈 수 있음
//			// 하지만 type casting 필요
////			VipMemberService vipMemberService = (VipMemberService) memberService;
////			vipMemberService.addPoint(50);
//			
//			((VipMemberService) memberService).addPoint(50);
//			
//		}
		
		memberService.unregist();
		
	}

	
	public static void main(String[] args) {
		
		// Sub class is a Super Class
		MemberService memberService = new MemberServiceImpl();
		MemberService vipMemberService = new VipMemberServiceImpl();

		memberManage(memberService);
		memberManage(vipMemberService);

		
		
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
