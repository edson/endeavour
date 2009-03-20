package com.endeavour.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaDB {
	Connection con;

	public CriaDB() throws SQLException, IOException {
		StringBuilder sb = new StringBuilder();
		String s;
		con = ConnectionFactory.getConnection();
		InputStream is = CriaDB.class.getResourceAsStream("/endeavour.sql");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		while ((s = br.readLine()) != null) {
			sb.append(s);
		}
		br.close();
		isr.close();
		is.close();
		Statement stmt = con.createStatement();
		// executa
		stmt.execute(sb.toString());
		stmt.close();
	}
}
