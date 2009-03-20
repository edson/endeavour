package com.endeavour.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			return DriverManager.getConnection("jdbc:hsqldb:endeavour", "sa", "");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}
}
