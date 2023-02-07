package com.ktdsuniversity.edu.stream.baseball;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.temporal.TemporalAmount;
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
		
		AllStarFullVO player  = list.stream()
								.filter( (vo) -> vo.getYear().equals("1933") )
								.findFirst()	// 최종 함수
//								.get();			// optional의 메소드
								.orElse(new AllStarFullVO());
								// 데이터 존재하면 첫번째꺼 돌려주고, 없으면 괄호 안의 것 리턴
								// 많이 쓰임.
		
		System.out.println(player.getPlayerID());
		
		
		
		/**
		 * 실습
		 * 연도에 상관없이 플레이어 ID가 f로 시작하는 데이터 모두 출력
		 */
		
		// f로 시작하는 PlayerID를 리스트로
		List<AllStarFullVO> playStartWithF = list.stream()
											     .filter( (vo) -> vo.getPlayerID().toUpperCase().startsWith(("f")))
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
		System.out.println("1번-----------------------------------------------------------------");

		// 1. gameNum 이 0이 아닌 것을 출력해보세요.
		
		List<AllStarFullVO> allStarVO = list.stream()
											.filter( (vo) -> vo.getGameNum() != 0)
											.collect(Collectors.toList());
		
		allStarVO.forEach(vo -> {
			System.out.println(vo.getPlayerID());
			System.out.println(vo.getGameNum());
		});
		
		
		System.out.println("2번-----------------------------------------------------------------");

		// 2. gameNum 이 0인 것만 추출해 출력하세요.
		List<AllStarFullVO> allStarZeroVO = list.stream()
												.filter( (vo) -> vo.getGameNum() == 0)
												.collect(Collectors.toList());
		
		allStarZeroVO.forEach( (vo) -> {
			System.out.println(vo.getPlayerID());
			System.out.println(vo.getGameNum());
		});
		
		
		System.out.println("3번-----------------------------------------------------------------");
		
		// 3. 1950년대에 플레이한 선수의 이름만 출력하세요.
		
		list.stream()
			.filter( (vo) -> vo.getYear().startsWith("195"))
			.map( (vo) -> vo.getPlayerID())
			.forEach(System.out::println);
		
			
		System.out.println("4번-----------------------------------------------------------------");

		// 4. 2000년대 BOS 팀의 선수 이름을 중복 제거한 후 출력하세요.
		
		list.stream()
			.filter( (vo) -> vo.getYear().startsWith("200"))
			.filter( (vo) -> vo.getTeamID().equals("BOS"))
//			.map( (vo6) -> vo6.getPlayerID())
			// 비교 연산 하는 게 아니면 메소드 레퍼런스 쓸 수 있음
			.map( AllStarFullVO::getPlayerID)
			.distinct()
			.forEach(System.out::println);
		
		
		System.out.println("5번-----------------------------------------------------------------");

		
		// 5.1937년 DET 팀의 선수 중 첫 번째 선수 이름을 출력하세요.
		
		AllStarFullVO firstPlayer = list.stream()
										.filter( (vo) -> vo.getYear().equals("1937"))
										.filter( (vo) -> vo.getTeamID().equals("DET"))
										.findFirst()
										.orElse(new AllStarFullVO());
			
		System.out.println(firstPlayer.getPlayerID());
		
		System.out.println("6번-----------------------------------------------------------------");

		
		// 6. GP 1, startingPos 가 3 인 선수의 이름을 출력하세요.
		
		list.stream()
			.filter( (vo) -> vo.getGP() == 1)
			.filter( (vo) -> vo.getStartingPos() == 3)
			.map( vo -> vo.getPlayerID())
			.forEach(System.out::println);
		
		
		System.out.println("7번-----------------------------------------------------------------");

		
		// 7. BOS팀에 있는 선수는 총 몇명인가요?
		long numberOfBOS = list.stream()
								.filter( vo -> vo.getTeamID().equals("BOS"))
								.count();
		
		System.out.println(numberOfBOS);
		
		
		
		
		System.out.println("8번 -----------------------------------------------------------------");
		
		// 8. 이름이 foxx로 시작하는 선수의 플레이 연도를 중복 제거한 후 출력하세요.
		
		list.stream()
			.filter( vo -> vo.getPlayerID().toLowerCase().startsWith("foxx"))
			.map( vo -> vo.getYear())
			.distinct()
			.forEach(System.out::println);

		
		System.out.println("9번 -----------------------------------------------------------------");

		
		// 9. lombaer01 선수는 몇년도에 어느 팀에서 필레이 했나요?
		
		list.stream()
			.filter( vo -> vo.getPlayerID().equals("lombaer01"))
			.forEach( vo -> {
				System.out.println(vo.getYear() + ">" + vo.getTeamID());
			});
		
		
		System.out.println("9번 -----------------------------------------------------------------");

		list.stream()
			.filter( vo -> vo.getPlayerID().equals("lombaer01"))
			.map( vo -> vo.getYear() + ">" + vo.getTeamID())
			.forEach(System.out::println);
		
		System.out.println("10번 -----------------------------------------------------------------");

		
		// 10. muncyma01 선수의 year, startingPos와 teamID를 축력하세요.
		list.stream()
			.filter( vo -> vo.getPlayerID().equals("muncyma01"))
			.forEach( vo -> {
				System.out.println(vo.getYear() + ">" + vo.getStartingPos() + ">" + vo.getTeamID());
			});
		
		
		System.out.println("11번 -----------------------------------------------------------------");

		
		// 11. 2015년에 hernafe02 선수는 몇 번 출전 했나요?
		long cnt2 = list.stream()
					    .filter( vo -> vo.getYear().equals("2015"))
						.filter( vo -> vo.getPlayerID().equals("hernafe02"))
						.count();
		
		System.out.println(cnt2);
	
		
		System.out.println("12번 -----------------------------------------------------------------");

		// 12. ATL 팀이 몇 년도에 경기에 출전 했나요?
		list.stream()
			.filter( vo -> vo.getTeamID().equals("ATL"))
			.map( vo -> vo.getYear())
			.distinct()
			.forEach(System.out::println);
		
		
		
		System.out.println("13번 -----------------------------------------------------------------");

		
		// 13. W 로 시작하는 팀은 몇 년도에 경기에 출전 했나요?
		list.stream()
			.filter( vo -> vo.getTeamID().startsWith("W"))
			.map( vo -> vo.getYear())
			.distinct()
			.forEach(System.out::println);
			
		
		
		System.out.println("14번 -----------------------------------------------------------------");

		
		// 14. GP와 startingPos가 모두 0인 선수 중 PHA 팀에 소속했던 선수는 누구인가요?
		
		list.stream()
			.filter( vo -> vo.getGP() == 0)
			.filter( vo -> vo.getStartingPos() == 0)
			.filter( vo -> vo.getTeamID().equals("PHA"))
			.map( vo -> vo.getPlayerID())
			.forEach(System.out::println);

		
		System.out.println("15번 -----------------------------------------------------------------");

		
		
		
		// 15. playerID의 자리수가 8자리인 선수의 활동연도를 중복 제거하여 출력하세요
		list.stream()
			.filter( vo -> vo.getPlayerID().length() == 8)
			.map( vo -> vo.getYear())
			.distinct()
			.forEach(System.out::println);
		
		
		
		System.out.println("16번 -----------------------------------------------------------------");

		
		// 16.playerID의 값이 02 또는 03으로 끝나는 선수의
		// 	  팀코드를 중복제거 하고 정렬하여 출력하세요.
		
		list.stream()
			.filter( vo -> vo.getPlayerID().endsWith("02") || vo.getPlayerID().endsWith("03"))
			.map( vo -> vo.getTeamID())
			.distinct()
			.forEach(System.out::println);
		
		
		System.out.println("17번 -----------------------------------------------------------------");

		// 17. lgID의 값이 AL,
		//	   GameID는 60으로 끝나며
		//	   소속팀은 DET, playerID는 f로 시작하는
		//	   첫 번 째 선수의 playerID를 출력하고
		//	   만약 존재하지 않는다면 "없음"으로 출력하세요.
		
		String playerID = list.stream()
							  .filter( vo -> vo.getLgID().equals("AL"))
							  .filter( vo -> vo.getGameID().endsWith("60"))
							  .filter( vo -> vo.getTeamID().equals("DET"))
							  .filter( vo -> vo.getPlayerID().startsWith("f"))
							  .map( vo -> vo.getPlayerID())
							  .findFirst()
							  .orElse("없음");
		
		System.out.println(playerID);
	}	
}
