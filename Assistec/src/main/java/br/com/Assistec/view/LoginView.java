package br.com.Assistec.view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.Assistec.controller.LoginController;

public class LoginView extends JFrame {
	public JTextField txtUsuario;
	public JPasswordField txtSenha;
	public JLabel lblStatus;
	public JButton bntLogin;
 	
	public LoginView() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				LoginController lc = new LoginController();
				
				if (lc.verificarBancoOnline()) {
					view.lblStatus.setText("Conectado");
					lblStatus.setIcon(new
							ImageIcon.getResource("/")
					
				}
				
				//if(model.conexao != null) {
					//view.lblStatus.setText("conectao ao banco");
				//} else {
				//	view.lblStatus.setText("nao conectao ao banco");
			//	}
				//this.view.bntLogin.addActionListener(e -> logar());
			//}
			}
			
		});
		setBounds(100, 100, 374, 281);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblUsuario = new JLabel("Usuario");

		JLabel lblSenha = new JLabel("Senha");

		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);

		txtSenha = new JPasswordField();

		JButton bntLogin = new JButton("Login");

		lblStatus = new JLabel("");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(66)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(lblSenha)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtSenha))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblUsuario)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblStatus)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(199)
							.addComponent(bntLogin)))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario)
						.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSenha))
					.addGap(42)
					.addComponent(bntLogin)
					.addGap(18)
					.addComponent(lblStatus)
					.addContainerGap(175, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

}
