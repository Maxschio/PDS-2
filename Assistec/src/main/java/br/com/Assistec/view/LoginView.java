package br.com.Assistec.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginView extends JFrame {
	public JTextField txtUsuario;
	public JPasswordField txtSenha;
	public JLabel lblStatus;
	public JButton bntLogin;
 	
	public LoginView() {
		setBounds(100, 100, 709, 423);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblUsuario = new JLabel("Usuario");

		JLabel lblSenha = new JLabel("Senha");

		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);

		txtSenha = new JPasswordField();

		JButton bntLogin = new JButton("Login");

		lblStatus = new JLabel("");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(66)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup().addComponent(lblSenha)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(txtSenha))
										.addGroup(groupLayout.createSequentialGroup().addComponent(lblUsuario)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(txtUsuario,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(lblStatus)))
						.addGroup(groupLayout.createSequentialGroup().addGap(199).addComponent(bntLogin)))
				.addContainerGap(405, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(56)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblUsuario).addComponent(
						txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(30)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblSenha).addComponent(
						txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(42).addComponent(bntLogin).addGap(18).addComponent(lblStatus)
				.addContainerGap(161, Short.MAX_VALUE)));
		getContentPane().setLayout(groupLayout);

	}

}
