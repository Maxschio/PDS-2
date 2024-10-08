package br.com.Assistec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.loja.Assistec.dal.ModuloConexao;

public class LoginDAO {

	public Connection conexao = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	public LoginDAO() {
		conexao = ModuloConexao.connector();
	}

	public String autenticar(String login, String Senha) {
		String sql= "SELECT * FROM usuario WHERE login =? AND Senha =? ";
		try {
			pst = conexao.prepareStatement(sql);
			pst.setString(1, login);
			pst.setString(2, Senha);
			
			rs = pst.executeQuery();
			
		if (rs.next()){
			String perfil = rs.getString("perfil");
			return perfil;
			} else{
			return null;
}
	}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
}
	}

	public void fecharConexao() {
		if (conexao != null) {
			try {
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}