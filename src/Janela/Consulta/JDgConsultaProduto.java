package Janela.Consulta;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import TableModel.TmProduto;

public class JDgConsultaProduto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tableClassificacaoProdutos;
	private JTextField txtNomeBusca;
	private TmProduto modelProd=new TmProduto();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDgConsultaProduto dialog = new JDgConsultaProduto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDgConsultaProduto() {
		setTitle("Consulta de Produto");
		setBounds(100, 100, 589, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 553, 208);
		contentPanel.add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 553, 208);
		panel.add(scrollPane);

		tableClassificacaoProdutos = new JTable(modelProd);

		// tabela com colunas fixasv
		tableClassificacaoProdutos.getTableHeader().setReorderingAllowed(false);
		// tamanho especifico da coluna
		tableClassificacaoProdutos.getColumn("Descrição")
				.setPreferredWidth(150);
		tableClassificacaoProdutos.getColumn("Classe")
		.setPreferredWidth(150);

		// seleciona apenas uma linha
		tableClassificacaoProdutos
				.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(tableClassificacaoProdutos);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
					txtNomeBusca = new JTextField();
					buttonPane.add(txtNomeBusca);
					txtNomeBusca.setColumns(30);
			{
				JButton Consultar = new JButton("Consultar");
				Consultar.setActionCommand("Consultar");
				buttonPane.add(Consultar);
				getRootPane().setDefaultButton(Consultar);
			}
			{
				JButton detalhar = new JButton("Detalhar");
				buttonPane.add(detalhar);
			}
		}
	}

}
