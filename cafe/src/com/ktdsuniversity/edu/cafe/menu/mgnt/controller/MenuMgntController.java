package com.ktdsuniversity.edu.cafe.menu.mgnt.controller;

import java.util.List;
import java.util.Scanner;

import com.ktdsuniversity.edu.cafe.menu.mgnt.service.MenuMgntService;
import com.ktdsuniversity.edu.cafe.menu.mgnt.service.MenuMgntServiceImpl;
import com.ktdsuniversity.edu.cafe.menu.mgnt.util.MenuMgntUtil;

public class MenuMgntController {


		public static void main(String[] args) {
			
		MenuMgntService service = new MenuMgntServiceImpl();
		
		/**
		 * 1. 등록
		 * 2. 수정
		 * 3. 삭제
		 * 4. 조회(1개)
		 * 5. 조회(종류별로)
		 * 6. 조회(전체)
		 * 7. 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		/**
		 * 인삿말 한 번만 실행
		 */
		System.out.println("Cafe Menu Management System");
		
		
		while(true) {
			System.out.println("메뉴를 입력하세요(숫자): ");
			
			MenuMgntUtil.printMenu();
			
			/**
			 * 고객에게 값 입력 받아 menu에 저장
			 */
			int menu = scan.nextInt();
			scan.nextLine();	// Enter를 무시
			
			/**
			 * 등록
			 */
			if (menu == 1) {
				
				MenuMgntUtil.printItemTypeMenu();
				System.out.println("등록할 메뉴 타입을 입력하세요(숫자):");
				
				/**
				 * key: 고객의 입력 값
				 * 해당 key로 음료 선별.
				 */
				int type = scan.nextInt();
				scan.nextLine();
				
				/**
				 * 뒤로가기: 1~4 이외의 숫자 입력 시
				 */
				if (type < 1 || type > 4) {
					continue;
				}
				
				System.out.println("등록할 아이템명을 입력하세요(문자):");
				String name = scan.nextLine();
				
				/**
				 * true일 시 제대로 등록 완료
				 */
				if ( service.create(name) ) {
					System.out.println(name + "이(가) 등록되었습니다.");
				}
			}
			/**
			 * 수정
			 */
			else if (menu == 2) {
				
				MenuMgntUtil.printItemTypeMenu();
				System.out.println("수정할 메뉴 타입을 입력하세요:");
				
				/**
				 * key: 고객의 입력 값
				 * 해당 key로 음료 선별.
				 */
				int index = scan.nextInt();
				scan.nextLine();
				
				
				int key = scan.nextInt();
				scan.nextLine();
				TodoVO todoVO = service.read(key);
				//TODO 출력문
				System.out.println(todoVO.getItemName());
				
			}
			else if (menu == 3) {
				List<TodoVO> todoList = service.readAll();
				//TODO 출력문
				//for (TodoVO todoli)
				
				
			}
			else if (menu == 4) {
				System.out.println("수정할 TODO Key를 입력하세요.");
				int key = scan.nextInt();
				scan.nextLine();
				
				TodoVO todo = service.read(key);
				if (todo == null) {
					System.out.println("아이템이 존재하지 않습니다.");
				}
				else {
					
					boolean isSuccess = false;
					
					if (todo.isSuccess()) {
						// 이미 완료된 건
						System.out.println("이미 완료된 건입니다. 미완료로 변경할까요? (Y/N");
						String yn = scan.nextLine();
						if (yn.equalsIgnoreCase("Y")) {
							isSuccess = service.update(key, false);
						}
					}
					else {
						// 완료되지 않은 건
						System.out.println("미완료된 건입니다. 완료로 변경할까요? (Y/N)");
						String yn = scan.nextLine();
						if (yn.equalsIgnoreCase("Y")) {
							isSuccess = service.update(key, true);
						}
					}
					
					if (isSuccess) {
						System.out.println("처리되었습니다.");
					}		
				}
				
			}
			else if (menu == 5) {
				
			}
			else if (menu == 6) {
				
			}
			else if (menu == 7) {
				
			}
			/**
			 * 종료: 1~6 이외의 숫자 입력 시
			 */
			else {
				break;
			}
		}
	}
}