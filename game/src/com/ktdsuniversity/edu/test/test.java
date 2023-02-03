package com.ktdsuniversity.edu.test;

public class test {
	
	public static void main(String[] args) {
		
		
		
		
		String str = "         값 값 값           " ;		
		
		/*
		 * 문자열에서 좌우 공백 제거하기 .trim
		 */
		str = str.trim();
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		/*
		 * 문자열에서 텍스트 변경하기 .replace / .replaceAll
		 */
		str = str.replace(" ", "_");
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		str = str.replaceAll("_", "-");
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		str = "<html>HTML 문서를 작성합니다.</html>";
		//str.replaceAll("[가-힣]", str);	// [가-힣] 모든 한글을 뜻함
		str = str.replaceAll("[가-힣]", "");	// 한글만 골라서 공백으로 바꿔라
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		str = "<html>HTML 문서를 작성합니다.</html>";
		str = str.replaceAll("[^가-힣]", "");	// 한글만 빼고 공백으로 바꿔라
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		
		str = "<html>HTML 문서를 작성합니다.</html>";
		str = str.replaceAll("[^a-zA-Z]", "");	// 한글만 빼고 공백으로 바꿔라
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		
		str = "핸드폰 번호는 010-1234-5678 입니다.";
		str = str.replaceAll("[^0-9]", "");	// 숫자만 빼고 공백으로 바꿔라
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		
		/*
		 * 문자열에서 특정 단어로 시작하는 확인하기 .indexOf
		 */
		str = "자전거";
		System.out.println("자 의 자리: " + str.indexOf("자"));
		System.out.println("전 의 자리: " + str.indexOf("전"));
		System.out.println("거 의 자리: " + str.indexOf("거"));
		System.out.println("기 의 자리: " + str.indexOf("기"));
		
		if (str.indexOf("자") == 0) {
			System.out.println("자전거는 \"자\"로 시작합니다.");
		}
		// 이렇게 사용하는 게 번거로워서 startsWith() 사용.
		
		/*
		 * 문자열에서 특정 단어로 시작하는지 확인하기 .startWith
		 */
		System.out.println("자전거가 \"자\"로 시작하나요? " + str.startsWith("자"));
		System.out.println("자전거가 \"전\"로 시작하나요? " + str.startsWith("전"));
		System.out.println("자전거가 \"거\"로 시작하나요? " + str.startsWith("거"));
		
		
		/*
		 * 문자열에서 특정 단어로 끝나는지 확인하기 .lastIndexOf
		 */
		str = "기러기";
		System.out.println("기러기 \"기\"의 자리는? (indexOf) " + str.indexOf("기"));
		System.out.println("기러기 \"기\"의 자리는? (lastIndexOf) " + str.lastIndexOf("기"));
		
		System.out.println(str.length());
		System.out.println("기러기는 \"기\"로 끝나나요? " + (str.lastIndexOf("기") == str.length() - 1));
		
		
		/*
		 * 문자열에 특정 단어로 끝나는지 확인하기 .endsWith
		 */
		System.out.println("거중기는 \"거\"로 끝나나요? " + str.endsWith("거"));
		System.out.println("거중기는 \"중\"로 끝나나요? " + str.endsWith("중"));
		System.out.println("거중기는 \"기\"로 끝나나요? " + str.endsWith("기"));
		
		/*
		 * 문자열에 특정 단어 및 글자가 포함되어 있는지 확인하기 .indexOf
		 * -1보다 크거나 -1이 아니면 포함되어 있는 것
		 */
		str = "자전거";
		System.out.println("자전거에는 \"자\"가 포함되어 있나요? " + (str.indexOf("자") > -1));
		System.out.println("자전거에는 \"전\"가 포함되어 있나요? " + (str.indexOf("전") > -1));
		System.out.println("자전거에는 \"거\"가 포함되어 있나요? " + (str.indexOf("거") > -1));
		System.out.println("자전거에는 \"기\"가 포함되어 있나요? " + (str.indexOf("기") > -1));

		
		/*
		 * 문자열에 특정 단어 및 글자가 포함되어 있는지 확인하기 .contains
		 */
		System.out.println("자전거에는 \"자\"가 포함되어 있나요 ? " + str.contains("자"));
		System.out.println("자전거에는 \"전\"가 포함되어 있나요 ? " + str.contains("전"));
		System.out.println("자전거에는 \"거\"가 포함되어 있나요 ? " + str.contains("거"));
		System.out.println("자전거에는 \"기\"가 포함되어 있나요 ? " + str.contains("기"));

	
		/*
		 * 문자열 자르기 .substring(p)
		 */
		str = "2023-02-03";
		String day = str.substring(8);
		System.out.println(day);
		
		
		
		
		/*
		 * test
		 * 문자열 자르기 .substring(p, p)
		 * 월부터 숫자만 출력하게 연습
		 */
		str = "2023-02-03";
		day = str.substring(5);
		day = day.replace("-", "");
		System.out.println(day);
		
		
		
		
		
	}	
}
