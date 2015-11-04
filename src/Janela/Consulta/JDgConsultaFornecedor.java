package Janela.Consulta;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import TableModel.TmFornecedor;

public class JDgConsultaFornecedor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tableFornecedors;
	private JTextField txtNomeBusca;
	private TmFornecedor modelForn=new TmFornecedor();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDgConsultaFornecedor dialog = new JDgConsultaFornecedor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDgConsultaFornecedor() {
		setTitle("Consulta de Fornecedor");
		setBounds(100, 100, 651, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 615, 208);
		contentPanel.add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 615, 208);
		panel.add(scrollPane);

		tableFornecedors = new JTable(modelForn);

		// tabela com colunas fixasv
		tableFornecedors.getTableHeader().setReorderingAllowed(false);
		// tamanho especifico da coluna
		tableFornecedors.getColumn("Nome")
				.setPreferredWidth(150);

		// seleciona apenas uma linha
		tableFornecedors
				.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(tableFornecedors);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
					txtNomeBusca = new JTextField();
					buttonPane.add(txtNomeBusca);
					txtNomeBusca.setColumns(25);
			{
				JButton okButton = new JButton("Consultar");
				okButton.setActionCommand("Consultar");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Detalhar");
				cancelButton.setActionCommand("Detalhar");
				buttonPane.add(cancelButton);
			}
		}
	}

}
