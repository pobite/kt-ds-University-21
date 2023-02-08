package com.ktdsuniversity.edu.vo;

public abstract class AbstractVO {
	
	/**
	 * 글번호
	 */
	private int readNumber;
	/**
	 * 페이지 번호
	 */
	private int pageNumber;
	
	
	public int getReadNumber() {
		return readNumber;
	}
	
	public void setReadNumber(int readNumber) {
		this.readNumber = readNumber;
	}
	
	public int getPageNumber() {
		return pageNumber;
	}
	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	
	
}
