package com.ktdsuniversity.edu.methodref;

import java.util.List;
import java.util.function.Predicate;

public class Main {
	
	public static void printEvenNumber(List<NumberVO> numberList, Predicate<NumberVO> predicate) {
		
		for (NumberVO number: numberList) {
			if (predicate.test(number)) {
				System.out.println(number.getNumber());
			}
		}
	}
	
	public static void main(String[] args) {
		
		printEvenNumber(List.of(new NumberVO(1),
							    new NumberVO(2),
						        new NumberVO(3),
							    new NumberVO(4),
							    new NumberVO(5),
							    new NumberVO(6),
							    new NumberVO(7),
							    new NumberVO(8),
							    new NumberVO(9),
						        new NumberVO(10)), NumberVO::isEven);	//함수형 인터페이스로 전달될 때만 이렇게 사용 가능
											// 파라미터는 NumberVO의 isEven을 전달									   									  									   																			
	
		printEvenNumber(List.of(new NumberVO(1),
			    new NumberVO(2),
		        new NumberVO(3),
			    new NumberVO(4),
			    new NumberVO(5),
			    new NumberVO(6),
			    new NumberVO(7),
			    new NumberVO(8),
			    new NumberVO(9),
		        new NumberVO(10)), (numberVO) -> numberVO.isEven());	//이것도 가능			
	}
	
}
