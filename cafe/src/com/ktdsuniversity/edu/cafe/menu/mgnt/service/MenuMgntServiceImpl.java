package com.ktdsuniversity.edu.cafe.menu.mgnt.service;

import java.util.List;
import java.util.Map;

import com.ktdsuniversity.edu.cafe.menu.mgnt.dao.MenuMgntDAO;
import com.ktdsuniversity.edu.cafe.menu.mgnt.dao.MenuMgntDAOImpl;
import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

public class MenuMgntServiceImpl implements MenuMgntService {

	
	private MenuMgntDAO menuMgntDAO;
	
	public MenuMgntServiceImpl() {
		menuMgntDAO = new MenuMgntDAOImpl();
	}
	
	@Override
	public boolean create(String itemType, MenuMgntVO menuMgntVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(String itemType, int itemIdx, MenuMgntVO menuMgntVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String itemType, int itemIdx) {
		// TODO Auto-generated method stub
		return false;
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
