package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import exception.DbException;

public class Db {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://127.0.0.1:3306/login?useTimeZone=true&serverTimeZone=UTC";
	private static String user = "root";
	private static String password = null;

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return con;
		}

	}
	
	public void closeConnection(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public void closeStatement(Statement st) {
		if(st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

}
