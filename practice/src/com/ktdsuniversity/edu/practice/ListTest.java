package com.ktdsuniversity.edu.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {
	
	public static void main(String[] args) {
		
		List<Integer> scores = new ArrayList<Integer>( );
		scores.add( 100 );
		scores.add( 90 );
		
//		System.out.println(scores.size());
		
//		System.out.println(scores.remove(0));  // 0번 삭제, 1->0됨
//		System.out.println(scores.remove(0));  // 1->0이 돼서, 에러

//		scores.clear();
		
//		System.out.println(scores.size());
//		
//		int result = scores.get(0);
//		result = scores.get(1);
		
		
		
		// 로또 만들기
		// 1 ~ 45 사이의 랜덤 값 가져오기
		// 0 ~ 44의 값 나와서 + 1 -> 1 ~ 45
		
		List<Integer> lotto = new ArrayList<>();
		
//		Random random = new Random();
//		int randomNumber = random.nextInt(45) + 1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1;
//		System.out.println(randomNumber);
		
		Random random = new Random();
		lotto.add(random.nextInt(45) + 1);
		lotto.add(random.nextInt(45) + 1);
		lotto.add(random.nextInt(45) + 1);
		lotto.add(random.nextInt(45) + 1);
		lotto.add(random.nextInt(45) + 1);
		lotto.add(random.nextInt(45) + 1);
		lotto.add(random.nextInt(45) + 1);
		
		System.out.println(lotto);
		System.out.println(lotto.get(0));
		System.out.println(lotto.get(1));
		System.out.println(lotto.get(2));
		System.out.println(lotto.get(3));
		System.out.println(lotto.get(4));
		System.out.println(lotto.get(5));
		System.out.println(lotto.get(6));
		
		
		
		
		
	}
}
