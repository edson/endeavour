package com.endeavour.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.endeavour.model.Musica;

public class MusicaDAO {
	private Connection con;

	public MusicaDAO() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}

	public void adiciona(Musica musica) throws SQLException {
		// prepared statement para inserção
		
		String sql = "insert into Musicas (codalbum,codidioma,titulo,txtletra,ultimaAtualizacao,codusuario) values (?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);

		// seta os valores
		stmt.setLong(1, musica.getCodalbum());
		stmt.setLong(2, musica.getCodidioma());
		stmt.setString(3, musica.getTitulo());
		stmt.setString(4, musica.getTxtletra());
		stmt.setObject(5, new Timestamp(Calendar.getInstance().getTimeInMillis()));
		// Default do primeiro usuário cadastrado
		stmt.setLong(6, 0);
		
		// executa
		stmt.execute();
		stmt.close();
	}

	public List<Musica> getLista() throws SQLException {

		PreparedStatement stmt = this.con
				.prepareStatement("select * from Musicas");
		ResultSet rs = stmt.executeQuery();

		List<Musica> Musicas = new ArrayList<Musica>();

		while (rs.next()) {
			// criando o objeto Musica
			Musica musica = new Musica();
			musica.setTitulo(rs.getString("titulo"));
			musica.setTxtletra(rs.getString("txtletra"));
			// adicionando o objeto à lista
			Musicas.add(musica);
		}

		rs.close();
		stmt.close();

		return Musicas;
	}

}
