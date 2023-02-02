package com.ktdsuniversity.edu.dao;

import java.util.List;

import com.ktdsuniversity.edu.vo.MemberVO;

public interface MemberDAO {
	
	public int create(MemberVO memberVO);
	
	public List<MemberVO> readAll();
	
	public default MemberVO read(int key) {
		return null;
	}
	
	public default MemberVO read(String key) {
		return null;
	}
	
	
}
