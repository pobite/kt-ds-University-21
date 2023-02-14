package com.ktdsuniversity.edu.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ThrowNewTest {
	
	static Map<String, String> memberMap = new HashMap<>();
	
	// 중복 검사
	// Map은 이미 등록 되어 있는 키라면 예외를 던지고 싶으면
	// 중복 키면 update하기 때문에.
	public static boolean isCreate(String memberID) {
		
		if (memberMap.containsKey(memberID)) {
			throw new DuplicateMemberIDException(memberID);
		}
		
		
		memberMap.put(memberID, "생성" + memberID);
		return memberMap.containsKey(memberID);	// true면 예외 던지기
	}
	
	public static void main(String[] args) {
		boolean isCreate = isCreate("ktds0601");
		System.out.println(isCreate);
		
		// 똑같은 아이디로 다시 등록 -> 예외 발생
		isCreate = isCreate("ktds0601");
		System.out.println(isCreate);
		
		System.out.println("회원 가입이 완료되었습니다.");
	}
}
