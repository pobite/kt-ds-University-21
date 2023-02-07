package com.ktdsuniversity.edu.stream.bigdata;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BigdataStream1 {
	
	public static List<TextVO> readTextFile() {
		String filePath = "C:\\Devs\\data\\bigdata\\10K.ID.CONTENTS";
		
		List<TextVO> list;
		try {
			list = Files.readAllLines(Paths.get(filePath))
					.parallelStream()
					.map( (line) -> {
						String[] strArr = line.split("\t");
						TextVO vo = new TextVO();
						if (strArr.length >= 2) {
							vo.setValue(strArr[1].trim());
						}
						return vo;
					})
					.collect(Collectors.toList());
			return list;
		} catch (IOException ioe) {
			return new ArrayList<>();
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		/**
		 * 8-1. 10K.ID.CONTENTS 파일에서 "12370584" 의 내용을 출력
		 */
		
		
		
		
		
		
		
		
		/**
		 * 8-2. (병렬) 10K.ID.CONTENTS 파일에서 "12370584"의 내용을 출력
		 */
		
		
		
		
		/**
		 * 9. (병렬) 10K.ID.CONTENTS 파일에서 "7670637" 에 몇 개의 단어가 있는지 출력
		 */
		
		
		/**
		 * 10. (병렬) 10K.ID.CONTENTS 파일에서 내용이 없는 "번호"는 몇 개인지 출력 
		 */
		
		
		
		/**
		 * 11. (병렬) 10K.ID.CONTENTS 파일에서 두 개의 단어로만 이루어진 "번호"는 몇 개인지 출력
		 */
		
		
		/**
		 * 12. (병렬) 10K.ID.CONTENTS 파일의 내용에서 내용에 "that" 이 포함된 글은 몇 개인지 출력
		 */
		
		
		
		/**
		 * 13. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 6자리인 것은 몇 개인지 출력
		 */
		
		/**
		 * 14. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 7자리인 것은 몇 개인지 출력
		 */
		
		
		/**
		 * 15. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 9로 시작하는 모든 글들의 첫 번째 단어 출력
		 */								   
											   
					
		
		
	}
}
