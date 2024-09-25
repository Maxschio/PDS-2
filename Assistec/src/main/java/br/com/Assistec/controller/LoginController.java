package br.com.Assistec.controller;

import javax.swing.JOptionPane;

import br.com.Assistec.model.UsuarioModel;
import br.com.Assistec.view.LoginView;

public class LoginController {
	
	private LoginView view;
	private UsuarioModel model;
	
	public LoginController(LoginView view) {
		this.view = view;
		this.model = new UsuarioModel();
		
		if(model.conexao != null) {
			view.lblStatus.setText("conectao ao banco");
		} else {
			view.lblStatus.setText("nao conectao ao banco");
		}
		this.view.bntLogin.addActionListener(e -> logar());
	}
	public void logar() {
		String login = view.txtUsuario.getText();
		String Senha = new String(view.txtSenha.getPassword());
		String perfil = model.autenticar(login, Senha);
		
		if(perfil != null) {
			JOptionPane.showMessageDialog(null, "Usuario pode acessar o banco ");
			
		} else {
			JOptionPane.showMessageDialog(null, "Login ou Senha invalido ");
		}
		
	}
}
