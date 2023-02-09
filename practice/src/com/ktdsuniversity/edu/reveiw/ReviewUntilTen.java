package com.ktdsuniversity.edu.reveiw;

public class ReviewUntilTen {
	
	public static void main(String[] args) {
		
		/**
		 * 1. 정수형 변수 number를 생성하고 7을 할당한 후 출력하기
		 */
		
		int number = 7;
		System.out.println("1. " + 7);
		
		
		/**
		 * 2. 정수형 변수 empty를 생성하고 아무것도 할당하지 않고 출력하기
		 */
		
		int empty;
		System.out.println("2. 주석 처리");
//		System.out.println("2. " + empty);
		
		/**
		 * <설명>
		 * 선언하고 초기화를 안 해서 메모리를 안 잡아둠.
		 * empty라는 변수가 참조하는 메모리 주소를 알 수 없어서.
		 * 메모리 주소를 참조할 수 없어서.
		 * 껍데기만 있고 할당된 데이터가 없으니깐 -> Primitive type만
		 */
		
		
		/**
		 * 3. 정수형 변수 result를 생성하고 7과 7을 더한 후 출력하기
		 */
		
		int result = 7 + 7;
		System.out.println("3. " + result);
		
		/**
		 * 4. 정수형 변수 overflow를 생성하고 Integer.MAX_VALUE를 할당하고 출력하기
		 */
		
		int overflow;
		overflow = Integer.MAX_VALUE;
		System.out.println("4. " + overflow);
		
		
		
		/**
		 * 5. 정수형 변수 overflow에 1을 더해 할당하고 출력하기
		 */
		
		overflow += 1;
		System.out.println("5. " + overflow);
		
		
		/**
		 * <설명>
		 * bit와 byte를 이해해야 함.
		 * 
		 * 1byte = 8 bit
		 * 4byte = 32 bit
		 * 
		 * 총 개수는 2^32이지만, 
		 * 음수/양수 구분을 위해 가장 앞 최상위 비트 때매 2^31
		 * 
		 * 기본형: 0000/0000/0000/0000/0000/0000/0000/0000
		 * 
		 * 양수/음수 구분: #000/0000/0000/0000/0000/0000/0000/0000
		 * 
		 * 양수의 최대값: 0111/1111/1111/1111/1111/1111/1111/1111 -> 21억...
		 * 음수의 최대값: 1000/0000/0000/0000/0000/0000/0000/0000 -> -21억...
		 * 
		 * 양수의 최대값에서 + 1을 하면
		 * 0111/1111/1111/1111/1111/1111/1111/1111 + 1
		 * 1000/0000/0000/0000/0000/0000/0000/0000
		 * 이기 때문에 -21억 출력
		 * 
		 */
		
		
		/**
		 * 6. overflow 의 값이 이상하게 출력된 이유를 옆 사람에게 설명하기
		 */
		
		// 완료
		
		
		/**
		 * 7. 6의 결과를 정상적인 값으로 출력되도록 변경해보기
		 */
		
		
	
	}
	
	
}
