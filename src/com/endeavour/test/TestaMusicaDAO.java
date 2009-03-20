package com.endeavour.test;

import java.sql.SQLException;

import com.endeavour.dao.MusicaDAO;
import com.endeavour.model.Musica;

public class TestaMusicaDAO {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		MusicaDAO musicaDAO = new MusicaDAO();
		Musica musica = new Musica();
		musica.setCodartista(1);
		musica.setCodalbum(0);
		musica.setCodidioma(0);
		musica.setTitulo("titulo");
		musica.setTxtletra("txtletra");

		musicaDAO.adiciona(musica);
	}

}
