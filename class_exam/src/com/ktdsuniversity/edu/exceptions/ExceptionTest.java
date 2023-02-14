package com.ktdsuniversity.edu.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		System.out.println("숫자로 변환 시작");
		
		String str = "567 ";
		
		try {
			int number = Integer.parseInt(str);
		}
		catch (NumberFormatException nfe) {
			System.out.println("숫자로 변환 중에 에러가 발생했습니다." + nfe.getMessage());
		}
		System.out.println("숫자로 변환 종료");
		
	
		
		/**
		 * 예외 클래스 상속 구조
		 * 
		 * Throwable
		 * 		Exception	<- try ~ catch가 필수
		 * 			IOException
		 * 					FileNotFoundException - 파일을 읽으려는데 없을 때
		 * 			RuntimeException	<- try ~ catch가 옵션
		 * 					NumberFormatException - 문자를 숫자로 변환하려는데 바꿀 수가 없는 것.
		 * 					ArrayIndexOutOfBoundsException - 배열 범위 초과
		 * 					IndexOutOfBoundsException - 리스트 범위 초과
		 * 					NullPointerException - 인스턴스가 null인데 null'.' 했을 때
		 * 					...
		 * 
		 * IOException, FileNotFoundException - 반드시 예외를 던짐.
		 * 
		 * RuntimeException예외처리를 선택에 맡김.
		 */
		
		
		
	}
}
