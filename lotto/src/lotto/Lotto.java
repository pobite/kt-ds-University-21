package lotto;

public class Lotto {
	
	public static void main(String[] args) {
		
		int[] lottoArray = new int[7];
		lottoArray[0] = 5;
		lottoArray[1] = 15;
		lottoArray[2] = 27;
		lottoArray[3] = 34;
		lottoArray[4] = 36;
		lottoArray[5] = 41;
		lottoArray[6] = 42;
		
				 
		
		// 전통적인 for
		for (int index = 0; index < lottoArray.length; index += 1) {
			// 반복 문장
			System.out.println("index: " + index + " = " + lottoArray[index]);			
		}
		
		// 성능이 빠른 for-each
		for (int number: lottoArray) {
			System.out.println("번호는 " + number);			
		}
		
		String string = "64. 쓰기 애매한 구닥다리 무기들을 시원하게 넘겨주고 신형으로 교체하자는 판단이었고, 미국이 우크라이나에 주는만큼 신형 미제 무기를 싸게 주겠다고 제안한것도 효과를 봄. \r\n"
				+ "\r\n"
				+ "[출처] 러시아 vs 우크라이나 전쟁 근황|작성자 메르\r\n"
				+ "\r\n";
		
		//int len = string.length();
		
		
		String[] wordArray = string.split(" ");		
		
		
		// 전통적인 for문
		for (int i=0; i<wordArray.length; i += 1) {
			int len = wordArray[i].length();		
			if (len >= 3) {
				System.out.println(wordArray[i]);
			}
		}
		

		// for-each
		for (String word: wordArray) {
			System.out.println(word);
		}
		
		
		
		
		// 홀수 출력
//		for (int index = 0; index < 100; index += 1) {
//			if (index % 2 != 0) {
//				System.out.println(index);		
//			}
//		}
		
		// 짝수 출력
//		for (int index = 0; index < 100; index += 1) {
//			if (index % 2 == 0) {
//				System.out.println(index);		
//			}
//		}

		
	
		
		
		
		
	}
	
	
	
}
