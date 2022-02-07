package com.practice.bbs.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BbsService {

	// 인터페이스의 특징을 활용하도록 구현
	public void execute(HttpServletRequest request, HttpServletResponse response);
	
}