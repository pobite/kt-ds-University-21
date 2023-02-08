package com.ktdsuniversity.edu.stream.bigdata;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BigdataStream1 {

	public static List<TextVO> readTextFile() {
		String filePath = "C:\\Devs\\data\\bigdata\\10K.ID.CONTENTS";

		List<TextVO> list;
		try {
			list = Files.readAllLines(Paths.get(filePath)).parallelStream().map((line) -> {
				String[] strArr = line.split("\t");
				TextVO vo = new TextVO();
				vo.setKey(strArr[0].trim());
				if (strArr.length >= 2) {
					vo.setValue(strArr[1].trim());
				}
				return vo;
			}).collect(Collectors.toList());
			return list;
		} catch (IOException ioe) {
			return new ArrayList<>();
		}
	}

	public static void main(String[] args) {
		
		
		List<TextVO> list = readTextFile();
		System.out.println(list.size());
		
		// 속도 비교를 위해
		
		
		/**
		 * 8-1. 10K.ID.CONTENTS 파일에서 "12370584" 의 내용을 출력
		 */
		long startTime = System.currentTimeMillis();

		
		Optional<String> value = readTextFile().stream()
				   .filter( vo -> vo.getKey().equals("12370584"))
				   .map(vo -> vo.getValue())
				   .findFirst();
		
		System.out.println(value.orElse("없음"));


//		String value = list.stream()
//						   .filter( vo -> vo.getKey().equals("12370584"))
//						   .map(vo -> vo.getValue())
//						   .findFirst()
//						   .orElse("");
//		
//		System.out.println(value);
		
		System.out.println("8-1 실행시간: " + (System.currentTimeMillis() - startTime));
		
		
		/**
		 * 8-2. (병렬) 10K.ID.CONTENTS 파일에서 "12370584"의 내용을 출력
		 */
		
		startTime = System.currentTimeMillis();
		
		value = readTextFile().parallelStream()
				   .filter( vo -> vo.getKey().equals("12370584"))
				   .map(vo -> vo.getValue())
				   .findFirst();
		
		System.out.println(value.orElse("없음"));
		
		System.out.println("8-2 실행시간: " + (System.currentTimeMillis() - startTime));

		/**
		 * 9. (병렬) 10K.ID.CONTENTS 파일에서 "7670637" 에 몇 개의 단어가 있는지 출력
		 * value에 단어가 몇 개 나오는지, 띄어쓰기 단위로 자르기
		 */
		
		
		startTime = System.currentTimeMillis();
		System.out.print("9. ");
		
		readTextFile().parallelStream()
					  .filter( vo -> vo.getKey().equals("7670637"))
					  .map(vo -> vo.getValue().split(" ").length)
					  .forEach(System.out::println);
					  
		
		System.out.println("9 실행시간: " + (System.currentTimeMillis() - startTime));

		
		/**
		 * 10. (병렬) 10K.ID.CONTENTS 파일에서 내용이 없는 "번호"는 몇 개인지 출력
		 * value가 없는 내용은 몇 개?
		 * 여기서 기준 - 스페이스만 있는 것도 없는 것.
		 */
		
							
		startTime = System.currentTimeMillis();
		System.out.print("10. ");
		
		long cnt = readTextFile().parallelStream()
								 .filter( vo -> vo.getValue() == null || vo.getValue() == "")
								 .count();
		
		System.out.println(cnt);
		System.out.println("10 실행시간: " + (System.currentTimeMillis() - startTime));

		
		
		
		
	  
	    String abc = null;
		/**
		 * abc = null -> true
		 * abc = "" -> true
		 * abc =" " -> false
		 * abc= "aaa" ->false
		 */
	    boolean isEmpty1 = abc == null || abc.length() == 0;
	   
	    /**
	     * abc = null -> true
	     * abc = "" -> true
	     * abc = " " -> true
	     * abc = "aaa" -> false
	     */
	    
//	    boolean isEmpty2 = abc.length() == 0 || abc == null;
	    // 질문하기!!
	    
	    // 둘다 맞고 틀리고는 없으며, 팀에서 팀장이 기준을 정해줌.

	     
	    /**
	     * 조건 연산자 유의점
	     */
	    // NullPointerException 발생
	    // 이런 경우에는 null 비교가 앞에 있어야 함.
//		boolean isEmpty3 = abc.trim().length() == 0 || abc == null;
//			   
//		// 이렇게 하기.
//		boolean isEmpty4 = abc == null || abc.trim().length() == 0; 
//
//		// 에러 발생
//		boolean isEmpty5 = abc == null && abc.trim().length() == 0;
//
//			   
//		// And 연산에서 비어있다는 판단 이렇게.
//		boolean isEmpty6 = !(abc != null && abc.trim().length() > 0);
	   
							  
							  

		
		/**
		 * 11. (병렬) 10K.ID.CONTENTS 파일에서 두 개의 단어로만 이루어진 "번호"는 몇 개인지 출력
		 * 스페이스로 잘라서 2개인지 체크
		 */
		  
	    startTime = System.currentTimeMillis();
		System.out.print("11. ");
	     
		cnt = readTextFile().parallelStream()
				 			 .filter( vo -> vo.getValue() != null)
			 			     .filter( vo -> vo.getValue().split(" ").length == 2)
			 			     .count();
			 
 		System.out.println(cnt);
		System.out.println("11 실행시간: " + (System.currentTimeMillis() - startTime));
	     
		
		/**
		 * 12. (병렬) 10K.ID.CONTENTS 파일의 내용에서 내용에 "that" 이 포함된 글은 몇 개인지 출력
		 * indexOf, contains 둘 중 하나 사용.
		 */
		
		startTime = System.currentTimeMillis();
		System.out.print("12. ");
		     
		cnt = readTextFile().parallelStream()
							.filter( vo -> vo.getValue() != null)
			 			    .filter( vo -> vo.getValue().contains("that"))
				 			.count();
				 
		System.out.println(cnt);
		System.out.println("12 실행시간: " + (System.currentTimeMillis() - startTime));
		 
		 
		 
		/**
		 * 13. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 6자리인 것은 몇 개인지 출력
		 * 문자열의 길이를 세기
		 */
		
		startTime = System.currentTimeMillis();
		System.out.print("13. ");
		
		cnt = readTextFile().parallelStream()
						    .filter( vo -> vo.getKey().length() == 6)
						    .count();
		
		System.out.println(cnt);
		System.out.println("13 실행시간: " + (System.currentTimeMillis() - startTime));
		
		
		/**
		 * 14. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 7자리인 것은 몇 개인지 출력
		 * 문자열의 길이를 세기
		 */
		
		startTime = System.currentTimeMillis();
		System.out.print("14. ");
		
		cnt = readTextFile().parallelStream()
						    .filter( vo -> vo.getKey().length() == 7)
						    .count();
		
		System.out.println(cnt);
		System.out.println("14 실행시간: " + (System.currentTimeMillis() - startTime));
		
		
		  
		/**
		 * 15. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 9로 시작하는 모든 글들의 첫 번째 단어만 출력
		 * 내용 없어도 출력
		 */								   
		
		startTime = System.currentTimeMillis();
		System.out.print("15. ");
		
		
		// 내가 푼 것
		readTextFile().parallelStream()
					  .filter( vo -> vo.getKey().startsWith("9"))
					  .map( vo -> vo.getValue() == null ? "" : vo.getValue().split(" ")[0])
					  .forEach(System.out::println);
		
		
		
		// 교수님 풀이 1
		readTextFile().parallelStream()
					  .filter( vo -> vo.getKey().startsWith("9"))
					  .map( vo -> vo.getValue() == null ? "" : vo.getValue())
					  .map( desc -> desc.trim().contains(" ") ? desc.split(" ")[0] : "")
					  .forEach(System.out::println);
		
		// 교수님 풀이 2
		readTextFile().parallelStream()
		  .filter( vo -> vo.getKey().startsWith("9"))
		  .map( vo -> {
			  
			  if (vo.getValue() == null) {
				  return "";
			  }
			  return vo.getValue().trim();
		  })
		  .map(desc -> {
			  if (desc.trim().contains(" ")) {
				  return desc.trim().split(" ")[0];
			  }
			  return "";
		  })
		  .forEach(word -> {
			  System.out.println("15-2. [" + word + "]");
		  });
		
		// 교수님 풀이 3
		readTextFile().parallelStream()
					  .filter( vo -> vo.getKey().startsWith("9"))
					  .map( vo -> {
						  
						  if (vo.getValue() != null && vo.getValue().trim().length() > 0) {
							  return vo.getValue().trim().split(" ") [0];
						  }
						  return "";
					  })
					  .forEach(word -> {
						  System.out.println("15-3. [" + word + "]");
					  });
						 
		System.out.println("15 실행시간: " + (System.currentTimeMillis() - startTime));
		
		
		/**
		 * 16. (병렬) 10K.ID.CONTENTS 파일에서 내용이 있으며 글 번호가 7로 시작하는 모든 글들의 첫 번째 단어만 출력
		 */
		
		startTime = System.currentTimeMillis();
		System.out.print("16. ");
		
		readTextFile().parallelStream()
					  .filter( vo -> vo.getValue() != null)
					  .filter( vo -> vo.getKey().startsWith("7"))
					  .map( vo -> vo.getValue().split(" ")[0])
					  .forEach(System.out::println);
	
		System.out.println("16 실행시간: " + (System.currentTimeMillis() - startTime));
	}
}
