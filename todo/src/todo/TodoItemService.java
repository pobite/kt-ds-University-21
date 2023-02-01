package todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 일정관리 서비스
 * @author DH
 */
public class TodoItemService {
	
	/**
	 * 할 일 목록
	 */
	private List<TodoItemVO> todoItemList;
	
	/**
	 * 기본 생성자
	 */
	public TodoItemService() {
		todoItemList = new ArrayList<>();
	}
	
	public List<TodoItemVO> getTodoItemList() {
		return todoItemList;
	}

	public void setTodoItemList(List<TodoItemVO> todoItemList) {
		this.todoItemList = todoItemList;
	}

	
	/**
	 * 할 일 등록
	 * @param item 등록할 할 일 제목
	 */
	public void create(String item) {
		todoItemList.add(new TodoItemVO(item));
	}
	
	/**
	 * 할 일 조회 (모든 아이템을 조회한다.)
	 */
	public void read() {
		for (TodoItemVO todoItem: todoItemList) {
//			String result = " ";
//			if (todoItemVO.isResult()) {
//				result = "X";
//			}
			String successSymbol = todoItem.isResult() ? "X" : " ";
			System.out.println("[" + successSymbol + "]" + todoItem.getItem());
		}
		System.out.println("총 " + todoItemList.size() + "개의 아이템이 조회되었습니다.");
	}
	
	/**
	 * 할 일 수정
	 * @param index 수정하려는 할 일의 인덱스
	 * @param result 결과
	 */
	public void update(int index, boolean result) {
		TodoItemVO todoItemVO = todoItemList.get(index);
		todoItemVO.setResult(result);
	}
	
	/**
	 * 할 일 삭제
	 * @param index 삭제하려는 할 일의 인덱스
	 */
	public void delete(int index) {
		todoItemList.remove(index);
	}
	
	/**
	 * 인덱스 존재 여부 확인
	 * @param index 찾고자하는 인덱스
	 * @return 존재하면 true, 존재하지 않으면 false
	 */
	public boolean isExit(int index) {
		if (todoItemList.size() <= index) {
			return false;
		}
		return true;
	}
	
	/**
	 * 게임 시작 
	 * @param todoItemService
	 */
	public void gameStart() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("TODO LIST");
		
		while (true) {	
			System.out.println("==================");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 종료");
			System.out.println("==================");
			System.out.println("메뉴를 입력하세요:");
			
			int menu = scan.nextInt();
			scan.nextLine();	// 엔터를 무시하는 코드.
			
			if (menu == 1) {
				// 등록
				System.out.println("TODO 명을 입력하세요: ");
				String itemName = scan.nextLine();
				this.create(itemName);	
			}
			else if (menu == 2) {
				// 수정
				System.out.println("수정할 아이템 번호를 입력하세요: ");
				int itemIndex = scan.nextInt();
				scan.nextLine();	// 엔터를 무시하는 코드
				
				int listLength = this.getTodoItemList().size();
				if (listLength <= itemIndex) {
					System.out.println("아이템이 존재하지 않습니다.");
				}
				else {
					System.out.println("아이템이 완료되었다면 \"Y\"를 입력하세요.");
					String yn = scan.nextLine();
					boolean isY = yn.equalsIgnoreCase("Y");
					this.update(itemIndex,isY);
					
					TodoItemVO todoItem = this.getTodoItemList().get(itemIndex);
					if (isY) {
						System.out.println("[" + todoItem.getItem() + "] 이 완료되었습니다.");
					}
					else {
						System.out.println("[" + todoItem.getItem() + "] 이 미완료되었습니다.");
					}
					
				}
			}
			else if (menu == 3) {
				// 삭제
				System.out.println("삭제할 아이템 번호를 입력하세요: ");
				int index = scan.nextInt();
				scan.nextLine();	// 엔터를 무시하는 코드
				
				int listLength = this.getTodoItemList().size();
				if (listLength <= index) {
					System.out.println("아이템이 존재하지 않습니다.");
				}
				else {
					this.delete(index);
					System.out.println("아이템이 삭제되었습니다.");
				}
			}
			else if (menu == 4) {
				// 조회
				this.read();
			}
			else {
				// 종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
	}

	// main
	public static void main(String[] args) {
		
		TodoItemService todoItemService = new TodoItemService();
		todoItemService.gameStart();
		
	}
}
