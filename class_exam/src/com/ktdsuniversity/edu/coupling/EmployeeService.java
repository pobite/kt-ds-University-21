package com.ktdsuniversity.edu.coupling;

public class EmployeeService {
	// 다른 개발자가 개발한 사원
	public void create() {
		System.out.println("사원 등록합니다.");
	}
	
	public void delete() {
		System.out.println("사원을 삭제합니다.");
	}
	
	
	public void update() {
		System.out.println("사원 정보를 수정합니다.");
	}
	
}
