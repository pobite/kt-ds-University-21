package com.ktdsuniversity.edu.game;

/**
 * 잘못된 단어를 입력한 경우 혹은 "포기"를 입력한 경우 던질 예외
 * @author DH
 */

public class WrongWordException extends RuntimeException {

	private static final long serialVersionUID = -2504216729332007421L;

	public WrongWordException() {
		super();
	}
	
	
	
}
