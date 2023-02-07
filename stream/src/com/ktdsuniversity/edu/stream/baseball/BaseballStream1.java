package com.ktdsuniversity.edu.stream.baseball;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BaseballStream1 {
	
	public static List<AllStarFullVO> readAllStarFull() {
		
		try {
			List<AllStarFullVO> list = Files.readAllLines(Paths.get("C:\\Devs\\data\\baseball\\core\\AllStarFull.csv"))
											.stream()
											.skip(1)									
											.map( (line) -> {
												String[] strArr = line.split(",");
												AllStarFullVO vo = new AllStarFullVO();
												vo.setPlayerID(strArr[0]);
												vo.setYear(strArr[1]);
												vo.setGameNum(Integer.parseInt(strArr[2]));
												vo.setGameID(strArr[3]);
												vo.setTeamID(strArr[4]);
												vo.setLgID(strArr[5]);
												vo.setGP(Integer.parseInt(strArr[6]));
												if(strArr.length == 8) {
													vo.setStartingPos(Integer.parseInt(strArr[7]));
												}
												else {
													vo.setStartingPos(0);
												}
												return vo;
											} )
											.collect(Collectors.toList());
			return list;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return new ArrayList<>();	// 에러나면 비어 있는 어레이 반환, main에서 null 체크하기 싫어서
		}
	}
	
	public static void main(String[] args) {
		List<AllStarFullVO> list = readAllStarFull();
		
		list.stream()
			.filter( (vo) -> vo.getYear().equals("1933") )
			.forEach( (vo) -> {
				System.out.println(vo.getPlayerID());
				System.out.println(vo.getYear());
			} );
		
		List<AllStarFullVO> playIn1933 = list.stream()
											.filter( (vo) -> vo.getYear().equals("1933"))
											.collect(Collectors.toList());
		
		AllStarFullVO vo  = list.stream()
								.filter( (vo1) -> vo1.getYear().equals("1933") )
								.findFirst()	// 최종 함수
//								.get();			// optional의 메소드
								.orElse(new AllStarFullVO());
								// 데이터 존재하면 첫번째꺼 돌려주고, 없으면 괄호 안의 것 리턴
								// 많이 쓰임.
		
		System.out.println(vo.getPlayerID());
		
		
		
		/**
		 * 실습
		 * 연도에 상관없이 플레이어 ID가 f로 시작하는 데이터 모두 출력
		 */
		
		// f로 시작하는 PlayerID를 리스트로
		List<AllStarFullVO> playStartWithF = list.stream()
											     .filter( (vo2) -> vo2.getPlayerID().toUpperCase().startsWith(("f")))
											     .collect(Collectors.toList());
		
	
		System.out.println("-----------------------------------------------------------------");
		
		// f로 시작하는 PlayerID 출력
		list.stream()
		    .filter( (allStarVO) -> allStarVO.getPlayerID().toUpperCase().startsWith(("F")))
		    .forEach( (allStarVO) -> {
		    	System.out.println(allStarVO.getPlayerID());
	     }) ;
		
		System.out.println("-----------------------------------------------------------------");

		/**
		 * 2004년도 경기에서 팀명이 텍사스
		 * 데이터를 최대한 많이 줄일 수 있는 쪽으로 필터링 시작
		 * 여기서는 2004년부터 필터링
		 * 논리 연산 가능하나, 논리 연산 하면 처음부터 끝까지 다 검색해야 됨.
		 */
		list.stream()
			.filter( (allStarVO) -> allStarVO.getYear().equals("2004"))
			.filter( (allStarVO) -> allStarVO.getTeamID().equals("TEX"))
			.forEach( (allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
				System.out.println(allStarVO.getYear());
				System.out.println(allStarVO.getTeamID());
			} );

		
		System.out.println("-----------------------------------------------------------------");

		/**
		 * startingPos == 0만 출력
		 */
		list.stream()
			.filter( (allStarVO) -> allStarVO.getStartingPos() == 0)
			.forEach( (allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
				System.out.println(allStarVO.getYear());
				System.out.println(allStarVO.getTeamID());
				System.out.println(allStarVO.getStartingPos());
			});

		
		System.out.println("-----------------------------------------------------------------");
		
		/**
		 * GP == 0 && TeamId == NYA && playerId에 fo 포함
		 * 
		 */
		list.parallelStream()
			.filter( (allStarVO) -> allStarVO.getGP() == 0)
			.filter( (allStarVO) -> allStarVO.getTeamID().equalsIgnoreCase("NYA"))
//			.filter( (allStarVO) -> allStarVO.getPlayerID().toLowerCase().contains("fo"))
			.filter( (allStarVO) -> allStarVO.getPlayerID().toLowerCase().indexOf("fo") != -1)
			.forEach( (allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
				System.out.println(allStarVO.getYear());
				System.out.println(allStarVO.getTeamID());
				System.out.println(allStarVO.getGP());
			});
		
		
		System.out.println("-----------------------------------------------------------------");

		List<String> playerNameList = list.stream()
										  .map( (allStarVO) -> allStarVO.getPlayerID() )
										  .distinct()	// 중복제거
										  .sorted()		// 정렬
										  .collect(Collectors.toList());
		
		playerNameList.forEach(System.out::println);
		
		
		System.out.println("-----------------------------------------------------------------");

		/**
		 * 실습
		 * StartingPos == 4인 데이터들의 playerID만 추출
		 * 중복을 제거하고 정렬
		 */
		
		List<String> playerNameList2 = list.stream()
										   .filter( (allStarVO) -> allStarVO.getStartingPos() == 4)
										   .map( (allStarVO) -> allStarVO.getPlayerID())
										   .distinct()
										   .sorted()
										   .collect(Collectors.toList());
		
		playerNameList2.forEach(System.out::println);
		
		
		System.out.println("-----------------------------------------------------------------");

		/**
		 * 문제
		 * 307 또는 NLS
		 */
	
		long cnt=list.stream()
			.filter( (allStarVO) -> allStarVO.getGameID().contains("307") ||
			 allStarVO.getGameID().toUpperCase().contains("NLS"))
			.map((allStarVO) -> allStarVO.getPlayerID())
			.distinct()
			.sorted()
			.peek(System.out::println)
			.count();
		
		System.out.println(cnt);
		
		
	
		/**
		 * 문제 연습
		 */
	
		// 1. gameNum 이 0이 아닌 것을 출력해보세요.
		
		List<AllStarFullVO> allStarVO = list.stream()
											.filter( (vo3) -> vo3.getGameNum() != 0)
											.collect(Collectors.toList());
		
		allStarVO.forEach(vo3 -> {
			System.out.println(vo3.getPlayerID());
			System.out.println(vo3.getGameNum());
		});
		
		
		System.out.println("-----------------------------------------------------------------");

		// 2. gameNum 이 0인 것만 추출해 출력하세요.
		List<AllStarFullVO> allStarZeroVO = list.stream()
												.filter( (vo4) -> vo4.getGameNum() == 0)
												.collect(Collectors.toList());
		
		allStarZeroVO.forEach( (vo4) -> {
			System.out.println(vo4.getPlayerID());
			System.out.println(vo4.getGameNum());
		});
		
		
		System.out.println("-----------------------------------------------------------------");
		
		// 3. 1950년대에 플레이한 선수의 이름만 출력하세요.
		
		list.stream()
			.filter( (vo5) -> vo5.getYear().startsWith("195"))
			.map( (vo5) -> vo5.getPlayerID())
			.forEach(System.out::println);
		
			
		System.out.println("-----------------------------------------------------------------");

		// 4. 2000년대 BOS 팀의 선수 이름을 중복 제거한 후 출력하세요.
		
		list.stream()
			.filter( (vo6) -> vo6.getYear().startsWith("200"))
			.filter( (vo6) -> vo6.getTeamID().equals("BOS"))
//			.map( (vo6) -> vo6.getPlayerID())
			// 비교 연산 하는 게 아니면 메소드 레퍼런스 쓸 수 있음
			.map( AllStarFullVO::getPlayerID)
			.distinct()
			.forEach(System.out::println);
		
		
		System.out.println("-----------------------------------------------------------------");

		
		// 5.1937년 DET 팀의 선수 중 첫 번째 선수 이름을 출력하세요.
		
		AllStarFullVO firstPlayer = list.stream()
										.filter( (vo7) -> vo7.getYear().equals("1937"))
										.filter( (vo7) -> vo7.getTeamID().equals("DET"))
										.findFirst()
										.orElse(new AllStarFullVO());
			
		System.out.println(firstPlayer.getPlayerID());
		
		
	}	
}
