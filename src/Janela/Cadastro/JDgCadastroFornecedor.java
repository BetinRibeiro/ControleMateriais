package Janela.Cadastro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class JDgCadastroFornecedor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtId;
	private JTextField txtRazaoSocial;
	private JTextField txtRazaoSocialFant;
	private JTextField txtCnpj;
	private JTextField txtInscricaoEstadual;
	private JTextField txtEnd;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtFone1;
	private JTextField txtCel;
	private JTextField txtCep;
	private JComboBox boxUf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDgCadastroFornecedor dialog = new JDgCadastroFornecedor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDgCadastroFornecedor() {
		setTitle("Cadastro de Fornecedor");
		setResizable(false);
		setBounds(100, 100, 642, 453);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout( null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 614, 367);
		contentPanel.add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("C\u00F3digo");
		label.setBounds(10, 10, 60, 20);
		panel.add(label);

		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setColumns(10);
		txtId.setBounds(10, 30, 120, 20);
		panel.add(txtId);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(436, 10, 168, 169);
		panel.add(panel_1);

		JLabel lblRazaoSocial = new JLabel("RazaoSocial");
		lblRazaoSocial.setBounds(10, 55, 132, 20);
		panel.add(lblRazaoSocial);

		JLabel lblNomeFantasia = new JLabel("Nome Fantasia");
		lblNomeFantasia.setBounds(223, 55, 148, 20);
		panel.add(lblNomeFantasia);

		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(10, 100, 60, 20);
		panel.add(lblCnpj);

		JLabel lblCpf = new JLabel("Insc. Estadual");
		lblCpf.setBounds(10, 145, 120, 20);
		panel.add(lblCpf);

		txtRazaoSocial = new JTextField();
		txtRazaoSocial.setBounds(10, 75, 203, 20);
		panel.add(txtRazaoSocial);
		txtRazaoSocial.setColumns(10);

		txtRazaoSocialFant = new JTextField();
		txtRazaoSocialFant.setColumns(10);
		txtRazaoSocialFant.setBounds(223, 75, 203, 20);
		panel.add(txtRazaoSocialFant);

		txtCnpj = new JTextField();
		txtCnpj.setColumns(10);
		txtCnpj.setBounds(10, 120, 203, 20);
		panel.add(txtCnpj);

		txtInscricaoEstadual = new JTextField();
		txtInscricaoEstadual.setColumns(10);
		txtInscricaoEstadual.setBounds(10, 165, 203, 20);
		panel.add(txtInscricaoEstadual);

		String[] a = { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viuvo(a)",
				"Separado(a)" };

		String[] b = { "Ensino fundamental incompleto",
				"Ensino fundamental completo", "Ensino médio incompleto",
				"Ensino médio completo", "Ensino superior incompleto",
				"Ensino superior completo", "Pós-graduação", "Mestrado",
				"Doutorado" };

		String[] c = { "Masculino", "Feminino" };

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 198, 594, 154);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblRua = new JLabel("Endere\u00E7o");
		lblRua.setBounds(10, 10, 111, 14);
		panel_2.add(lblRua);

		txtEnd = new JTextField();
		txtEnd.setBounds(10, 30, 414, 20);
		panel_2.add(txtEnd);
		txtEnd.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(434, 10, 82, 14);
		panel_2.add(lblBairro);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 55, 92, 14);
		panel_2.add(lblCidade);

		txtBairro = new JTextField();
		txtBairro.setBounds(434, 30, 150, 20);
		panel_2.add(txtBairro);
		txtBairro.setColumns(10);

		txtCidade = new JTextField();
		txtCidade.setBounds(10, 75, 250, 20);
		panel_2.add(txtCidade);
		txtCidade.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone ");
		lblTelefone.setBounds(10, 106, 82, 14);
		panel_2.add(lblTelefone);

		txtFone1 = new JTextField();
		txtFone1.setColumns(10);
		txtFone1.setBounds(10, 126, 150, 20);
		panel_2.add(txtFone1);

		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(170, 106, 98, 14);
		panel_2.add(lblCelular);

		txtCel = new JTextField();
		txtCel.setColumns(10);
		txtCel.setBounds(170, 126, 150, 20);
		panel_2.add(txtCel);
		
		txtCep = new JTextField();
		txtCep.setText("");
		txtCep.setColumns(10);
		txtCep.setBounds(270, 75, 150, 20);
		panel_2.add(txtCep);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(270, 55, 82, 14);
		panel_2.add(lblCep);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(434, 55, 46, 14);
		panel_2.add(lblUf);
		String[] uf = { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES",
				"GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR",
				"RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" };
		
		boxUf = new JComboBox(uf);
		boxUf.setBounds(434, 75, 71, 20);
		panel_2.add(boxUf);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
