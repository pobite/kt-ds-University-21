package com.ktdsuniversity.edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseballStream2 {
	
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
	
		List<AllStarFullVO> list =readAllStarFull();
		
		// 1. 1933년 NYA팀의 세 번째 선수의 playerID를 출력.
		// filter, map, limit, skip 사용 예정
		
		// 두 가지 방법
		list.stream()
			.filter( (vo) -> vo.getYear().equals("1933")) 
			.filter( (vo) -> vo.getTeamID().equals("NYA"))
			.map( (vo) -> vo.getPlayerID())
			.skip(2)
			.limit(1)
			.forEach(System.out::println);;
										
		
		Optional<String> playerID = list.stream()
										 .filter( (vo) -> vo.getYear().equals("1933")) 
										 .filter( (vo) -> vo.getTeamID().equals("NYA"))
										 .map( (vo) -> vo.getPlayerID())
										 .skip(2)
										 .limit(1)
										 .findFirst();	
										 // findFirst가 Optional String을 반환
		
		System.out.println(playerID.orElse("없음"));
		// 데이터 있으면 보여주고 없으면, 없음 출력
		
		
		
		/**
		 * 2. 1700년 NYA팀의 세 번째 선수의 playerID를 출력.
		 */
		
		// 스트림이 어떻게 변화하는지 보여주기 위해 다 쪼갬.
		// 원래 이렇게 하지 않음.
		// peek을 하기 전에는 뭐가 있는지 못 봄.
		Stream<AllStarFullVO> listStream = list.stream();
		
		// 연도가 1700인 것만 해서 집어 넣음
		Stream<AllStarFullVO> playersIn1700 = 
				listStream.filter( vo -> vo.getYear().equals("1700"));

		// NYA팀만 집어 넣음
		Stream<AllStarFullVO> playersInNYA =
				playersIn1700.filter(vo -> vo.getTeamID().equals("NYA"));
		
		
		// map은 데이터 형태가 바뀜
		// playerID로 바꿔서 Stream<String>에 집어 넣음.
		// AllStarVO에서 getPlayerID로 데이터를 바꿨으니
		// Stream<String>으로 형태가 되는 것.
		Stream<String> playersId = playersInNYA.map( vo -> vo.getPlayerID());
		
		// 2개 생략한 데이터만 넣어줌
		Stream<String> skipedPlayersId = playersId.skip(2);
		
		// limit도 스트림
		// 1개만 가져오기.
		Stream<String> limitedPlayersId = skipedPlayersId.limit(1);		
		
		// findFirst는 Optional을 줌
		Optional<String> playerId = limitedPlayersId.findFirst();
		
		// 있으면 playerId 출력, 없으면 "없음" 출력
		System.out.println(playerId.orElse("없음"));
		
		
		/**
		 * 3.1934년 CHA 팀에서 startingPos 가 8인 선수의 playerID를 출력.
		 */
		
		Optional<String> playerId2 = list.stream()
										 .filter( vo -> vo.getYear().equals("1934"))
										 .filter( vo -> vo.getTeamID().equals("CHA"))
										 .filter( vo -> vo.getStartingPos() == 8)
										 .map( vo-> vo.getPlayerID())
										 .findFirst();
		
		System.out.println(playerId2.orElse("없음"));
		
		
		/**
		 * 4. 1934년 CHA 팀에서 startingPos가 8인 두 번째 선수의 playerId를 출력.
		 */
		
		Optional<String> playerId3 = list.stream()
										 .filter( vo -> vo.getYear().equals("1934"))
										 .filter( vo -> vo.getTeamID().equals("CHA"))
										 .filter( vo -> vo.getStartingPos() == 8)
										 .skip(1)
										 .map( vo -> vo.getPlayerID())
										 .findFirst();
		
		System.out.println(playerId3.orElse("없음"));
		
		
		/**
		 * 5. gomezle01 선수가 속한 팀의 매니저 playerID를 출력 (flatMap)
		 * 
		 * <정리>
		 * 맵내부에서 stream을 리턴해야 한다면
		 * 무조건 flat맵 사용
		 */
		
//		Optional<String> managerPlayerId = list.stream()
//											   .filter( vo -> vo.getPlayerID().equals("gomezle01"))
//											   .map( vo -> vo.getTeamID())
//											   .flatMap( teamID -> {
//												   // DB에서 말하는 join
//												   // AllStar.csv 와 Manager.csv를 join한 개념
//												   String path = "C:\\Devs\\data\\baseball\\core\\Managers.csv";
//												   try {
//													   return Files.readAllLines(Paths.get(path))
//													   .stream()
//													   .filter( line -> {
//														   
//														   String[] arr = line.split(",");
//														   arr[2].equals(teamID);
//														   arr[0];
//													   } )
//												   }
//												   // 최종함수가 없으니깐 stream
//												   catch (IOException ioe) {
//													   return Stream.empty();
//												   } 
//											   });
		
											   
		/**
		 * 5-1. 1933년에 출전항 TeamID별 playerId를 모두 출력. (group)
		 */
		
		 // 1. 리스트를 스트림으로
		 // 2. 필터링
		 // 3. 컬렉터 - groupingBy / 괄호 안에 기준으로 헤쳐 보여라
		 // 4. teamID가 String이라 map의 키가 됨.
		 // 5. 팀별로 데이터가 많이 나옴. List 형태로 넣음
		
		
		Map<String , List<AllStarFullVO>> teamMap1 = list.stream()
				.filter( vo -> vo.getYear().equals("1933") )
				.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
				//.collect(Collectors.groupingBy(vo -> vo.getTeamID()));		
		
		
		// Map을 forEach 돌리면 BiConsumer -> 그래서 파라미터 2개.
		teamMap1.forEach((teamId, players) -> {
			
			// 1. 스트림으로 출력
			players.stream()
				   .map(vo -> vo.getPlayerID())
				   .forEach((playerId4) -> {
					   System.out.println("5-1. "
					   			+ teamId + " > " + playerId4);
				   });
			
			// 2. 전통적인 forEach
//			for (AllStarFullVO player: players) {
//				System.out.println("5-1. "
//									+ teamId
//									+ ">" + player.getPlayerID());
//			}
		});
		
		
		
											   
		/**
		 * 5-2. 1933년에 출전항 TeamID별 playerId의 수를 모두 출력. (group)
		 */									   
		Map<String, List<AllStarFullVO>> teamMap2 = list.stream()
				.filter( vo -> vo.getYear().equals("1933"))
				.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		
		
		// 리듀싱 하면 편한데, 리듀싱 안 써서 이런 식으로 진행.
		teamMap2.forEach( (key, value) -> {
			System.out.println("5-2, " + key + " > " + value.size());
		});
		
											   
		
		/**
		 * 6. TeamID별 출전 연도를 모두 출력 (group)
		 */
			/* 
			 * 중복 제거하지 않고 쭉 출력
			 * 
			 * 6. NYA > 1933
			 * 6. NYA > 1934
			 * 6. NYA > 1935
			 * 6. NYA > 1936
			 * 6. NYA > 1937
			 */
		
		
		Map<String, List<AllStarFullVO>> teamMap3 = list.stream()
					.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		
		teamMap3.forEach( (teamId, players) -> {
			for (AllStarFullVO player: players) {
				System.out.println("6-1. "
									+ teamId
									+ " > " + player.getYear());
			}
		});
		
					
		/**
		 * 7. TeamID별 출전 연도를 중복제거하여 모두 출력 (group)
		 * 중복 제거하지 않고 출력
		 */
		
		Map<String, List<AllStarFullVO>> teamMap4 = list.stream()
				.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		
		teamMap4.forEach( (key, value) -> {
	
			value.stream()
			 .map( (vo) -> vo.getYear())
			 .distinct()
			 .forEach((playerId5) -> {
				 System.out.println("7. " 
						 + key
						 + playerId5);
			});
		});
		
		
		/**
		 * map 선언, 변환 꿀팁!
		 */
		String a = "1234";	// 원리: 에러에 마우스 가져다 되고 클릭
		
		// 에러에 커서 놓고 ctrl+ 1
//		String groupMap = list.stream()
//				.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		
		// 자동 변환
		Map<String, List<AllStarFullVO>> groupMap1 = list.stream()
				.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		
	}	
}
