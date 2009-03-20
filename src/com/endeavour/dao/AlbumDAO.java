package com.endeavour.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.endeavour.model.Album;
import com.endeavour.model.Musica;

public class AlbumDAO {
	private Connection con;

	public AlbumDAO() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}

	public List<Album> getLista() throws SQLException {

		PreparedStatement stmt = this.con
				.prepareStatement("select * from Albuns");
		ResultSet rs = stmt.executeQuery();

		List<Album> Albuns = new ArrayList<Album>();

		while (rs.next()) {
			// criando o objeto Album
			Album Album = new Album();
			Album.setCodalbum(rs.getLong("codalbum"));
			Album.setNome(rs.getString("nome"));
			// adicionando o objeto à lista
			Albuns.add(Album);
		}

		rs.close();
		stmt.close();

		return Albuns;
	}

}
