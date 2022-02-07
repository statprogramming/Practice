package com.practice.bbs.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.bbs.model.BbsDAO;

public class DeleteServiceImpl implements BbsService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		// param을 받는다(bno)
		String bno = request.getParameter("bno");

		// DAO 생성
		BbsDAO dao = BbsDAO.getInstance();
		dao.delete(bno);
	}

}
