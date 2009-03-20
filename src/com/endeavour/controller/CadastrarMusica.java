package com.endeavour.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.endeavour.dao.MusicaDAO;
import com.endeavour.model.Musica;

public class CadastrarMusica implements BusinessLogic {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		MusicaDAO musicaDAO = new MusicaDAO();
		Musica musica = new Musica();
		musica.setCodartista(2);
		musica.setCodalbum(1);
		musica.setCodidioma(1);
		musica.setTitulo(request.getParameter("titulo"));
		musica.setTxtletra(request.getParameter("txtletra"));
		
		musicaDAO.adiciona(musica);
		
		dispatch("/listaMusicas.jsp", request, response);

	}

	private void dispatch(String jsp, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(jsp);
		rd.forward(request, response);
	}

}