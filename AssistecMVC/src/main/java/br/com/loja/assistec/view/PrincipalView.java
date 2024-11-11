package br.com.loja.assistec.view;

import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class PrincipalView extends JFrame {

	private JMenuItem menuSair;
	private JMenuItem menuAjuda2;
	private JMenuItem menuUsuarios;

	public PrincipalView(String user, String perfil) {
		setTitle(" ASSISTEC ");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblUsuario = new JLabel(" ");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(378, Short.MAX_VALUE)
					.addComponent(lblUsuario)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(214, Short.MAX_VALUE)
					.addComponent(lblUsuario)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuArquivos = new JMenu(" Arquivos ");
		menuBar.add(menuArquivos);

		menuSair = new JMenuItem(" Sair ");
		menuSair.setActionCommand(" MenuSairAction ");
		menuArquivos.add(menuSair);
		
				JMenu menuRelatorio = new JMenu(" Relatório ");
				menuRelatorio.setEnabled(false);
				menuBar.add(menuRelatorio);

		JMenu menuCadastro = new JMenu(" Cadastro ");
		menuCadastro.setEnabled(false);
		menuBar.add(menuCadastro);
		menuUsuarios = new JMenuItem(" Usuários ");
		menuUsuarios.setActionCommand(" MenuUsuariosAction ");
		menuCadastro.add(menuUsuarios);

		JMenu menuAjuda = new JMenu(" Ajuda ");
		menuBar.add(menuAjuda);

		menuAjuda2 = new JMenuItem(" Sobre ");
		menuAjuda2.setActionCommand(" MenuSobreAction ");
		menuAjuda.add(menuAjuda2);

		lblUsuario.setText(user);

		if ("Admin ".equalsIgnoreCase(perfil)) {
			menuCadastro.setEnabled(true);
			menuRelatorio.setEnabled(true);
		}

	}

	public void addPrincipalListener(ActionListener listener) {
		menuSair.addActionListener(listener);
		menuAjuda2.addActionListener(listener);
		menuUsuarios.addActionListener(listener);
	}

	public int SairSistema() {
		int sair = JOptionPane.showConfirmDialog(null, " Tem certeza que deseja sair? ", " Atenção ", JOptionPane.YES_NO_OPTION);
		return sair;
	}

	public void mostrarMensagem(String mensagem, String tipo) {
		int messageType = switch (tipo) {
		case " Atenção " -> JOptionPane.WARNING_MESSAGE;
		case " Erro " -> JOptionPane.ERROR_MESSAGE;
		case " Informação " -> JOptionPane.INFORMATION_MESSAGE;
		default -> JOptionPane.PLAIN_MESSAGE;
		};
		JOptionPane.showMessageDialog(this, mensagem, tipo, messageType);
	}

}
