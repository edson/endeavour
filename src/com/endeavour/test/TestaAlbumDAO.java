package com.endeavour.test;

import java.sql.SQLException;
import java.util.List;

import com.endeavour.dao.AlbumDAO;
import com.endeavour.model.Album;

public class TestaAlbumDAO {

	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		AlbumDAO dao = new AlbumDAO();
		List<Album> albuns = dao.getLista();
		for (Album album : albuns) {
			System.out.println(album.getCodalbum() + ", " + album.getNome());
		}
		System.out.println("Fim.");
	}
}
