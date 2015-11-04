package Janela.Cadastro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class JDgCadastroProduto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private Container contentPane;
	private JTextField txtDescr;
	private JTextField txtEstMin;
	private JTextField txtPrec;
	private JComboBox boxClass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDgCadastroProduto dialog = new JDgCadastroProduto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDgCadastroProduto() {
		setTitle("Cadastro de Produto");
		setBounds(100, 100, 407, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 375, 208);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(10, 10, 60, 20);
		panel.add(lblCdigo);

		txtCodigo = new JTextField("");
		txtCodigo.setEnabled(false);
		txtCodigo.setBounds(10, 30, 120, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);

		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(10, 55, 93, 20);
		panel.add(lblDescrio);

		txtDescr = new JTextField();
		txtDescr.setBounds(10, 75, 355, 20);
		panel.add(txtDescr);
		txtDescr.setColumns(10);

		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setBounds(10, 150, 81, 20);
		panel.add(lblPreo);

		txtEstMin = new JTextField();
		txtEstMin.setBounds(10, 125, 120, 20);
		panel.add(txtEstMin);
		txtEstMin.setColumns(10);

		JLabel lblEstMinimo = new JLabel("Est. Minimo");
		lblEstMinimo.setBounds(10, 105, 93, 20);
		panel.add(lblEstMinimo);

		txtPrec = new JTextField();
		txtPrec.setEnabled(false);
		txtPrec.setText("0.00");
		txtPrec.setBounds(10, 170, 120, 20);
		panel.add(txtPrec);
		txtPrec.setColumns(10);

		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificao.setBounds(160, 150, 100, 20);
		panel.add(lblClassificao);

		String[] lista = {"Item do Conjunto", "Item de Venda"};
		boxClass = new JComboBox(lista);
		boxClass.setBounds(160, 170, 205, 20);
		panel.add(boxClass);
		
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
