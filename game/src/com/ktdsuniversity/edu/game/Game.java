package com.ktdsuniversity.edu.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 끝말잇기 게임
 * 3글자 이상의 단어만 입력 가능.
 * 게임이 종료 시, 그동안 나왔던 단어 출력.
 * @author DH
 */
public class Game {
	
	
	public static void main(String[] args) {
		
	
		List<String> wordList = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("끝말잇기 게임 시작");
		System.out.println("시작단어를 입력하세요");
		
		while (true) {
			
			/**
			 * 문자 입력 받아 정리.
			 */
			String word = scan.nextLine();
			word = word.trim();
			int wordLength = word.length();
			
			/**
			 * 탈출구
			 * 입력된 단어들 출력.
			 */
			if (word.equals("포기")) {
				
				System.out.println(word + "를 입력했습니다.\n");				
				
				System.out.println("입력한 단어들은");
				for(String item: wordList) {
					System.out.println(item);
				}
				System.out.println("입니다.");	
			}			
			/**
			 * 3글자 이상 단어인지 확인
			 */
			else if (wordLength >= 3) {
				
				/**
				 * 끝 글자와 앞 글자 같은지 확인
				 */
				if () {
					
					
					
				}
				
				wordList.add(word);
				
			}
			
			/**
			 * 3글자가 미만일 경우
			 */
			else {
				
				System.out.println("\"" + word + "\"는 " + wordLength + "글자 입니다. 3글자 이상 단어를 입력하세요.");
				System.out.println("\" 로 시작하는 단어를 입력하세요.");
			}
		}
	}
}
