package com.ktdsuniversity.edu.member;

public class MemberService {
	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void join() {
		System.out.println("회원가입");
	}
	
	private void login() {
		System.out.println("로그인");
	}
	
	// default
	// 자기 패키지 내부에서만 접근 가능.
	void quit() {
		System.out.println("탈퇴");
	}
}
