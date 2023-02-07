package com.ktdsuniversity.edu.cafe.menu.mgnt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

public class MenuMgntDAOImpl implements MenuMgntDAO {
	
	private Map<String, List<MenuMgntVO>> dataSource;
	
	public MenuMgntDAOImpl() {
		
		dataSource = new HashMap<>();
		dataSource.put("커피", new ArrayList<>());
		dataSource.put("음료", new ArrayList<>());
		dataSource.put("티", new ArrayList<>());
		dataSource.put("디저트", new ArrayList<>());
	}

	@Override
	public int create(String itemType, MenuMgntVO menuMgntVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(String itemType, int itemIdx, MenuMgntVO menuMgntVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String itemType, int itemIdx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MenuMgntVO read(String itemType, int itemIdx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuMgntVO> readSome(String itemType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<MenuMgntVO>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
