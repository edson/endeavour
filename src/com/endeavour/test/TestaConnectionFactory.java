package com.endeavour.test;

import java.sql.SQLException;

import com.endeavour.dao.ConnectionFactory;

public class TestaConnectionFactory {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		ConnectionFactory.getConnection();
	}

}
