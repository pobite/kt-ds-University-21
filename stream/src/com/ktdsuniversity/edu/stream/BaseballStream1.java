package com.ktdsuniversity.edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
	}
}
