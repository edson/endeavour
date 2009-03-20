package com.endeavour.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListarMusicas implements BusinessLogic {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		dispatch("/listaMusicas.jsp", request, response);

	}

	private void dispatch(String jsp, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(jsp);
		rd.forward(request, response);
	}

}