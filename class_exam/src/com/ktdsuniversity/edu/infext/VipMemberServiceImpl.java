package com.ktdsuniversity.edu.infext;

public class VipMemberServiceImpl implements VipMemberService {

	@Override
	public void regist() {
		System.out.println("VIP 회원 가입이 완료되었습니다.");
		addPoint(1000);
	}

	@Override
	public void unregist() {
		System.out.println("VIP 회원 탈퇴가 완료되었습니다.");	
	}

	@Override
	public void updateMyInfo() {
		System.out.println("VIP 회원 정보가 수정되었습니다.");
	}

	@Override
	public void addPoint(int point) {
		System.out.println(point + " 점이 지급되었습니다.");
	}
}