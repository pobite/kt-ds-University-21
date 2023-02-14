package com.ktdsuniversity.edu.exceptions;

/**
 * 사용자 예외는 반드시 RuntimeException을 상속 받는다.
 * @author DH
 *
 */
public class DuplicateMemberIDException extends RuntimeException {

	// 클러스트링에 필요한 값
	// 서버끼리 이 객체가 공유될 것인데, 객체가 가지는 고유한 ID
	// 공유하기 위한 고유 ID
	private static final long serialVersionUID = 300748820639462251L;
	
	// 사용자 예외는 필요에 따라 생성자를 Overriding 한다.
	public DuplicateMemberIDException(String memberID) {
		super(memberID);	// 부모의 생성자
	}
	
	// 오버 로딩
	public DuplicateMemberIDException(String memberID, Throwable cause) {
		super(memberID, cause);	// 부모의 생성자
	}
}