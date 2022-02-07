package com.practice.bbs.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.bbs.model.BbsDAO;

public class RegistServiceImpl implements BbsService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		// controller 역할 분담 작업
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		// DAO 생성
		BbsDAO dao = BbsDAO.getInstance();
		dao.regist(writer, title, content);
		
	}

}
