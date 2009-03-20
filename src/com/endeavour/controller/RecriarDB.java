package com.endeavour.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.endeavour.dao.CriaDB;
import com.endeavour.dao.MusicaDAO;
import com.endeavour.model.Musica;

public class RecriarDB implements BusinessLogic {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		new CriaDB();
		request.setAttribute("recriouDB", "<p>Banco foi recriado com sucesso.</p>");
		
		dispatch("/home.jsp", request, response);

	}

	private void dispatch(String jsp, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(jsp);
		rd.forward(request, response);
	}

}