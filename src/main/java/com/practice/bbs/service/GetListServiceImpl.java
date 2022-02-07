package com.practice.bbs.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.bbs.model.BbsDAO;
import com.practice.bbs.model.BbsVO;

public class GetListServiceImpl implements BbsService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
	
		// 받을 값 x
		BbsDAO dao = BbsDAO.getInstance();
		ArrayList<BbsVO> list = dao.getList(); // 리스트 반환
		
		// 화면에서 값을 사용하기 위해 request에 저장
		request.setAttribute("list", list);
		
	}
}