package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import exception.DbException;

public class Dao {

	Db db = new Db();

	public void registrarUsuario(JavaBeans jb) {
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into users (NOME,USUARIO,SENHA,EMAIL) values (?,?,?,?)");
			ps.setString(1, jb.getNOME());
			ps.setString(2, jb.getUSUARIO());
			ps.setString(3, jb.getSENHA());
			ps.setString(4, jb.getEMAIL());
			ps.executeUpdate();
			db.closeConnection(ps);
			db.closeConnection(con);
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	public boolean validarLogin(String usuario, String senha) {
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con
					
					.prepareStatement("select * from users where USUARIO = '" + usuario + "' and SENHA = '" + senha + "'");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

}
