package com.ict.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;
import com.ict.db.VO;

public class writeCommand implements Command
{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response)
	{
		
		
		return "view/write.jsp";
	} 
}
