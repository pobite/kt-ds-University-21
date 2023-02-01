package com.ktdsuniversity.edu.controller;

import com.ktdsuniversity.edu.service.MemberService;
import com.ktdsuniversity.edu.service.MemberServiceImpl;
import com.ktdsuniversity.edu.service.SecondMemberServiceImpl;
import com.ktdsuniversity.edu.vo.MemberVO;

public class MemberController {
	
	public static void main(String[] args) {
		
		/**
		 * MemberServiceImpl 클래스의 객체 생성
		 */
		MemberService service = new MemberServiceImpl();
		
		MemberVO member = new MemberVO();
		member.setId("id1");
		member.setPassword("pwd1");
		member.setReadNumber(1);
		member.setPageNumber(0);
		service.create(member);
		
		member.setId("id2");
		member.setPassword("pwd2");
		member.setReadNumber(2);
		member.setPageNumber(0);
		service.create(member);
		
		member.setId("id3");
		member.setPassword("pwd3");
		member.setReadNumber(3);
		member.setPageNumber(0);
		service.create(member);
		
		service.readAll();
		
		
		/**
		 * SecondMemberServiceImpl 클래스의 객체 생성
		 */
		MemberService service2 = new SecondMemberServiceImpl();
				
		member.setId("id1");
		member.setPassword("pwd1");
		member.setReadNumber(1);
		member.setPageNumber(0);
		service2.create(member);
		
		member.setId("id2");
		member.setPassword("pwd2");
		member.setReadNumber(2);
		member.setPageNumber(0);
		service2.create(member);
		
		member.setId("id3");
		member.setPassword("pwd3");
		member.setReadNumber(3);
		member.setPageNumber(0);
		service2.create(member);
		
		service2.readAll();
		
	}
}
