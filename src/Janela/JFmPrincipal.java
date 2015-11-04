package Janela;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.jboss.jandex.Main;

import Janela.Cadastro.JDgCadastroFornecedor;
import Janela.Cadastro.JDgCadastroProduto;
import Janela.Consulta.JDgConsultaFornecedor;
import Janela.Consulta.JDgConsultaProduto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;

public class JFmPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel foto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//com.jtattoo.plaf.acryl.AcrylLookAndFeel
					//com.jtattoo.plaf.bernstein.BernsteinLookAndFeel
					UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
					JFmPrincipal frame = new JFmPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFmPrincipal() {
		setResizable(false);
		setTitle("Fun\u00E7\u00E3o Organizacional Material e Logistico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 460);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);

		JMenuItem mntmCadastroProduto = new JMenuItem("Cadastro Produto");
		mntmCadastroProduto.addActionListener(this);
		mnCadastro.add(mntmCadastroProduto);

		JMenuItem mntmCadastroFornecedor = new JMenuItem("Cadastro Fornecedor");
		mnCadastro.add(mntmCadastroFornecedor);
		mntmCadastroFornecedor.addActionListener(this);

		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);

		JMenuItem mntmConsultarProduto = new JMenuItem("Consultar Produto");
		mnConsultar.add(mntmConsultarProduto);
		mntmConsultarProduto.addActionListener(this);

		JMenuItem mntmConsultarFornecedor = new JMenuItem("Consultar Fornecedor");
		mnConsultar.add(mntmConsultarFornecedor);
		mntmConsultarFornecedor.addActionListener(this);

		JMenu mnRelatrio = new JMenu("Relat\u00F3rio");
		menuBar.add(mnRelatrio);

		JMenuItem mntmRelatrioDeCompras = new JMenuItem("Relat\u00F3rio de Compras");
		mnRelatrio.add(mntmRelatrioDeCompras);

		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);

		JMenuItem mntmDocumentao = new JMenuItem("Documenta\u00E7\u00E3o");
		mnAjuda.add(mntmDocumentao);

		JMenuItem mntmTutorial = new JMenuItem("Tutorial");
		mnAjuda.add(mntmTutorial);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 167, 345);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton button_1 = new JButton("Ordem de Compra");
		button_1.setBounds(10, 10, 150, 20);
		panel.add(button_1);

		JButton btnComprarProduto = new JButton("Comprar Produto");
		btnComprarProduto.setBounds(10, 35, 150, 20);
		panel.add(btnComprarProduto);

		JButton btnAlocarProduto = new JButton("Alocar Produto");
		btnAlocarProduto.setBounds(10, 60, 150, 20);
		panel.add(btnAlocarProduto);

		JButton btnInventarioDoEstoque = new JButton("Inventario do Estoque");
		btnInventarioDoEstoque.setBounds(10, 85, 150, 20);
		panel.add(btnInventarioDoEstoque);
		
		foto = new JLabel();
		foto.setBounds(0, 116, 167, 229);
		ImageIcon imagem = new ImageIcon(
				Main.class.getResource("/img/black-158186_640.png"));
		Image img = imagem.getImage().getScaledInstance(foto.getWidth(),
				foto.getHeight(), Image.SCALE_DEFAULT);
		foto.setIcon(new ImageIcon(img));
		panel.add(foto);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(185, 10, 370, 345);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(565, 10, 285, 345);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 365, 840, 40);
		contentPane.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(null);

		JLabel lblUsbetingmailcom = new JLabel("usbetin@gmail.com");
		lblUsbetingmailcom.setBounds(330, 10, 154, 14);
		lblUsbetingmailcom.setIconTextGap(12);
		lblUsbetingmailcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsbetingmailcom.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_3.add(lblUsbetingmailcom);

		JLabel lblRogobertoRibeiro = new JLabel("Rogoberto Ribeiro ");
		lblRogobertoRibeiro.setBounds(10, 10, 123, 14);
		lblRogobertoRibeiro.setHorizontalTextPosition(SwingConstants.CENTER);
		lblRogobertoRibeiro.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblRogobertoRibeiro);

		JLabel label = new JLabel("(88) 98878-0587");
		label.setIconTextGap(12);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		label.setBounds(738, 10, 92, 14);
		panel_3.add(label);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String acao = e.getActionCommand();

		switch (acao) {
		case "Cadastro Produto":
			JDgCadastroProduto cadastroProduto = new JDgCadastroProduto();
			cadastroProduto.setVisible(true);
			break;
		case "Cadastro Fornecedor":
			JDgCadastroFornecedor cadastroFornecedor = new JDgCadastroFornecedor();
			cadastroFornecedor.setVisible(true);
			break;
		case "Consultar Produto":
			JDgConsultaProduto colsultarProduto = new JDgConsultaProduto();
			colsultarProduto.setVisible(true);
			break;
		case "Consultar Fornecedor":
			JDgConsultaFornecedor consultaFornecedor = new JDgConsultaFornecedor();
			consultaFornecedor.setVisible(true);
			break;

		default:
			break;
		}

	}
}
