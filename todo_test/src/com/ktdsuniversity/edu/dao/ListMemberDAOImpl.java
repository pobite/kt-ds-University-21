package com.ktdsuniversity.edu.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.vo.MemberVO;

public class ListMemberDAOImpl implements MemberDAO {
	
	private List<MemberVO> dataSource;
	
	public ListMemberDAOImpl() {
		dataSource = new ArrayList<>();
	}
	
	@Override
	public int create(MemberVO memberVO) {
		dataSource.add(memberVO);
		return 0;
	}

	@Override
	public List<MemberVO> readAll() {
		return dataSource;
	}

	@Override
	public MemberVO read(int key) {
		return dataSource.get(key);
	}
	
	// overloading
	public MemberVO read(String key) {
		
		for (MemberVO member: dataSource) {
			
			if (member.getId().equals(key)) {
				return member;
			}
		}
//		if (dataSource.contains(key)) {
//			int index = dataSource.indexOf(key);
//			return dataSource.get(index);
//		}
		return null;
	}

}
