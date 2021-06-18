package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Command;
import com.ict.model.delCommand;
import com.ict.model.del_okCommand;
import com.ict.model.listCommand;
import com.ict.model.onelistCommand;
import com.ict.model.updateCommand;
import com.ict.model.update_okCommand;
import com.ict.model.writeCommand;
import com.ict.model.write_okCommand;


@WebServlet("/MyController")
public class MyController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		Command comm = null;
		
		if(cmd.equalsIgnoreCase("list"))
		{
			comm = new listCommand();
		}else if(cmd.equalsIgnoreCase("write"))
		{
			comm = new writeCommand();
		}else if(cmd.equalsIgnoreCase("write_ok"))
		{
			comm = new write_okCommand();
		}else if(cmd.equalsIgnoreCase("onelist"))
		{
			comm = new onelistCommand();
		}else if(cmd.equalsIgnoreCase("update"))
		{
			comm = new updateCommand();
		}else if(cmd.equalsIgnoreCase("del"))
		{
			comm = new delCommand();
		}else if(cmd.equalsIgnoreCase("del_ok"))
		{
			comm = new del_okCommand();
		}else if(cmd.equalsIgnoreCase("update_ok"))
		{
			comm = new update_okCommand();
		}
		String path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
		
		
	}

}
