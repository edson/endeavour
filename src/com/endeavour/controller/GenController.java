package com.endeavour.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.endeavour.controller.BusinessLogic;

public class GenController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String choice = request.getParameter("choice");
		String className = "com.endeavour.controller." + choice;
		
		try {
			Class classe = Class.forName(className);
			
			BusinessLogic businessLogic = (BusinessLogic) classe.newInstance();
			businessLogic.execute(request, response);
			
		} catch(Exception e) {
			throw new ServletException("A interface BusinessLogic causou uma exceção: ", e);
		}
		
	}

}
