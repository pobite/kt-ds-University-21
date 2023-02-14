package com.ktdsuniversity.edu.exceptions;

import java.util.HashMap;
import java.util.Map;

public class NullPointerExceptionTest {
	
	public static String getName(int nameLength) {
		// 숫자만큼의 길이를 돌려주려 함.
		
		if (nameLength == 2) {
			return "둘리";
		}
		else if (nameLength == 3){
			return "이순재";
		}
		else if (nameLength == 4) {
			return "선우용녀";
		}
		
		return null;
	}
	
	// null 체크하기 위한 유틸 클래스에 이런식으로 만듦
	public static String nullToDefault(String string, String defaultValue) {
		return string == null ? defaultValue : string;
	}
	
	public static String nullToEmpty(String string) {
		return string == null ? "" : string;
	}
	
	public static void main(String[] args) {
		
		// NullPointerException 발생
		// java.lang.NullPointerException
		String name = nullToEmpty(getName(6));
//		if (name == null) {
//			name = "";
//		}
		
		boolean isAStart = name.startsWith("A");
		System.out.println(isAStart);
		
		
		Map<String, String> nameMap = new HashMap<>();
		nameMap.put("김", "김둘리");
		nameMap.put("이", "이둘리");
		nameMap.put("박", "박둘리");
		nameMap.put("최", "");
		
		if (nameMap.containsKey("최") && nameMap.get("최").length() > 0) {
			String fullName = nameMap.get("최");	
			String lastName = fullName.substring(0, 1);
			System.out.println(lastName);
		}
		
		String fullName = nullToEmpty(nameMap.get("최"));
		if (fullName.length() > 0) {
			String lastName = fullName.substring(0, 1);
			System.out.println(lastName);
		}
		else {
			System.out.println("데이터가 없습니다.");
		}
	}
}
