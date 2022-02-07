package com.practice.bbs.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.bbs.model.BbsDAO;
import com.practice.bbs.model.BbsVO;

public class GetContentServiceImpl implements BbsService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		// param을 받는다(bno)
		String bno = request.getParameter("bno");
	
		BbsDAO dao = BbsDAO.getInstance();
		BbsVO vo = dao.GetContent(bno);
		
		// request vo를 담는다.
		request.setAttribute("vo", vo);
		
	}

}
