package com.ktdsuniversity.edu.controller;

import com.ktdsuniversity.edu.service.MemberService;
import com.ktdsuniversity.edu.service.MemberServiceImpl;
import com.ktdsuniversity.edu.vo.MemberVO;

public class MemberController {
	
	public static void main(String[] args) {
		
		try {
			int number = Integer.parseInt("ABC");
			System.out.println(number);
		}
		catch (NumberFormatException e) {
			System.out.println("에러가 발생했습니다." + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("111");
		
		
//		MemberService service0 = new MemberServiceImpl();
//		
//		MemberVO member = new MemberVO();
//		member.setId("이동학");
//		member.setPassword("123456");
//		member.setReadNumber(1);
//		member.setPageNumber(0);
//		service0.create(member);
//		
//		/**
//		 * 리스트에 조회했을 경우
//		 */
//		member = service0.read(0);
//		
//		if (member != null) {
//			System.out.println("아이디 " + member.getId());
//			System.out.println("비밀번호 " + member.getPassword());	
//		}
//
//		/**
//		 * 맵에 조회했을 경우
//		 */
//		member = service0.read("이동학");
//		System.out.println("<String으로 찾은 경우>");
//		System.out.println("아이디 " + member.getId());
//		System.out.println("비밀번호 " + member.getPassword());		

		
		
//		/**
//		 * MemberServiceImpl 클래스의 객체 생성
//		 */
//		MemberService service = new MemberServiceImpl();
//		
//		MemberVO member = new MemberVO();
//		member.setId("id1");
//		member.setPassword("pwd1");
//		member.setReadNumber(1);
//		member.setPageNumber(0);
//		service.create(member);
//		
//		member = new MemberVO();
//		member.setId("id2");
//		member.setPassword("pwd2");
//		member.setReadNumber(2);
//		member.setPageNumber(0);
//		service.create(member);
//		
//		member = new MemberVO();
//		member.setId("id3");
//		member.setPassword("pwd3");
//		member.setReadNumber(3);
//		member.setPageNumber(0);
//		service.create(member);
//		
//		List<MemberVO> memberList = service.readAll();
//		for (MemberVO eachMember: memberList) {
//			System.out.println(eachMember. getId());
//			System.out.println(eachMember. getPassword());
//			System.out.println(eachMember. getReadNumber());
//			System.out.println(eachMember. getPageNumber());
//		}
		
//		/**
//		 * SecondMemberServiceImpl 클래스의 객체 생성
//		 */
//		MemberService service2 = new SecondMemberServiceImpl();
//		
//		member = new MemberVO();
//		member.setId("id1");
//		member.setPassword("pwd1");
//		member.setReadNumber(1);
//		member.setPageNumber(0);
//		service2.create(member);
//		
//		member = new MemberVO();
//		member.setId("id2");
//		member.setPassword("pwd2");
//		member.setReadNumber(2);
//		member.setPageNumber(0);
//		service2.create(member);
//		
//		member = new MemberVO();
//		member.setId("id3");
//		member.setPassword("pwd3");
//		member.setReadNumber(3);
//		member.setPageNumber(0);
//		service2.create(member);
//		
//		memberList = service2.readAll();
//		for (MemberVO eachMember: memberList) {
//			System.out.println(eachMember. getId());
//			System.out.println(eachMember. getPassword());
//			System.out.println(eachMember. getReadNumber());
//			System.out.println(eachMember. getPageNumber());
//		}
	}
}
