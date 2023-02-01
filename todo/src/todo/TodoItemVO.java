package todo;

/**
 * 할 일 데이터 객체
 * @author DH
 *
 */
public class TodoItemVO {

	/**
	 * 할 일 제목
	 */
	private String item;
	
	/**
	 * 완료 여부
	 */
	private boolean result;
	
	/**
	 * 생성자
	 * @param item 아이템 명
	 */
	public TodoItemVO(String item) {
		
		this.setItem(item);
		
	}
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	
	
}
