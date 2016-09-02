package br.papelaria.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Vendas extends JFrame {

	private JPanel painelPrincipal;
	private JTextField textFieldCodigo;

	/**
	 * Launch the application.
	 */
	
	static Clientes frame1V = new Clientes();
	static Fornecedores frame2V = new Fornecedores();
	static Produtos frame3V = new Produtos();
	static Vendas frame4V = new Vendas();
	static Relatorios frame5V = new Relatorios();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
									
					frame1V.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	/**
	 * Create the frame.
	 */
	public Vendas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Teodoro\\Desktop\\1.png"));
		setResizable(false);
		setTitle("PaperSoft 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 415);
		painelPrincipal = new JPanel();
		painelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelPrincipal);
		painelPrincipal.setLayout(null);

		JButton buttonClientes = new JButton("Clientes");
		buttonClientes.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonClientes.setBounds(10, 11, 111, 50);
		painelPrincipal.add(buttonClientes);

		JButton buttonFornecedores = new JButton("Fornecedores");
		buttonFornecedores.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonFornecedores.setBounds(120, 11, 111, 50);
		painelPrincipal.add(buttonFornecedores);

		JButton buttonProdutos = new JButton("Produtos");
		buttonProdutos.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonProdutos.setBounds(230, 11, 111, 50);
		painelPrincipal.add(buttonProdutos);

		JButton buttonVendas = new JButton("Vendas");
		buttonVendas.setFont(new Font("Arial", Font.BOLD, 12));
		buttonVendas.setBounds(340, 11, 111, 50);
		painelPrincipal.add(buttonVendas);

		JButton buttonRelatorios = new JButton("Relat\u00F3rios");
		buttonRelatorios.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonRelatorios.setBounds(450, 11, 111, 50);
		painelPrincipal.add(buttonRelatorios);

		JPanel painelDadosDaVenda = new JPanel();
		painelDadosDaVenda.setLayout(null);
		painelDadosDaVenda.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dados da Venda",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelDadosDaVenda.setBounds(24, 70, 526, 244);
		painelPrincipal.add(painelDadosDaVenda);

		JLabel labelCodigo = new JLabel("C\u00F3digo:");
		labelCodigo.setFont(new Font("Arial", Font.BOLD, 12));
		labelCodigo.setBounds(53, 30, 57, 14);
		painelDadosDaVenda.add(labelCodigo);

		textFieldCodigo = new JTextField();
		textFieldCodigo.setColumns(10);
		textFieldCodigo.setBounds(105, 25, 97, 20);
		painelDadosDaVenda.add(textFieldCodigo);

		JLabel labelCliente = new JLabel("Cliente:");
		labelCliente.setFont(new Font("Arial", Font.BOLD, 12));
		labelCliente.setBounds(53, 60, 46, 14);
		painelDadosDaVenda.add(labelCliente);

		JComboBox comboBoxCliente = new JComboBox();
		comboBoxCliente.setBounds(105, 55, 138, 20);
		painelDadosDaVenda.add(comboBoxCliente);

		JLabel labelProduto = new JLabel("Produto:");
		labelProduto.setFont(new Font("Arial", Font.BOLD, 12));
		labelProduto.setBounds(42, 90, 57, 14);
		painelDadosDaVenda.add(labelProduto);

		JComboBox comboBoxProduto = new JComboBox();
		comboBoxProduto.setBounds(105, 85, 138, 20);
		painelDadosDaVenda.add(comboBoxProduto);

		JLabel labelPagamento = new JLabel("Pagamento:");
		labelPagamento.setFont(new Font("Arial", Font.BOLD, 12));
		labelPagamento.setBounds(22, 117, 74, 14);
		painelDadosDaVenda.add(labelPagamento);

		JRadioButton radioButtonAVista = new JRadioButton("\u00E0 vista");
		radioButtonAVista.setEnabled(false);
		radioButtonAVista.setBounds(102, 114, 100, 23);
		painelDadosDaVenda.add(radioButtonAVista);

		JComboBox comboBoxPagamentoAVista = new JComboBox();
		comboBoxPagamentoAVista.setEnabled(false);
		comboBoxPagamentoAVista.setBounds(132, 140, 138, 20);
		painelDadosDaVenda.add(comboBoxPagamentoAVista);

		JRadioButton radioButtonAPrazo = new JRadioButton("\u00E0 prazo");
		radioButtonAPrazo.setSelected(true);
		radioButtonAPrazo.setBounds(105, 160, 100, 23);
		painelDadosDaVenda.add(radioButtonAPrazo);

		JCheckBox checkBoxBoleto = new JCheckBox("Boleto");
		checkBoxBoleto.setSelected(true);
		checkBoxBoleto.setBounds(132, 180, 100, 23);
		painelDadosDaVenda.add(checkBoxBoleto);

		JLabel labelItens = new JLabel("Itens:");
		labelItens.setFont(new Font("Arial", Font.BOLD, 12));
		labelItens.setBounds(326, 30, 36, 14);
		painelDadosDaVenda.add(labelItens);

		JTextArea textAreaItens = new JTextArea();
		textAreaItens.setBounds(374, 25, 124, 178);
		painelDadosDaVenda.add(textAreaItens);

		JButton buttonConfirmar = new JButton("Confirmar");
		buttonConfirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonConfirmar.setBounds(154, 210, 89, 23);
		painelDadosDaVenda.add(buttonConfirmar);

		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonCancelar.setBounds(273, 210, 89, 23);
		painelDadosDaVenda.add(buttonCancelar);

		JButton buttonInserir = new JButton("Inserir");
		buttonInserir.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonInserir.setBounds(67, 339, 89, 23);
		painelPrincipal.add(buttonInserir);

		JButton buttonAlterar = new JButton("Alterar");
		buttonAlterar.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonAlterar.setBounds(186, 339, 89, 23);
		painelPrincipal.add(buttonAlterar);

		JButton buttonExcluir = new JButton("Excluir");
		buttonExcluir.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonExcluir.setBounds(303, 339, 89, 23);
		painelPrincipal.add(buttonExcluir);

		JButton buttonVoltar = new JButton("Voltar");
		buttonVoltar.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonVoltar.setBounds(422, 339, 89, 23);
		painelPrincipal.add(buttonVoltar);
		
		buttonFornecedores.addActionListener(new java.awt.event.ActionListener(){
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();

	        	
	        	 
					frame2V.setVisible(true);
	             
	         }});
		
		buttonClientes.addActionListener(new java.awt.event.ActionListener(){
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();

	        	
	        	 
					frame1V.setVisible(true);
	             
	         }});
		
		buttonProdutos.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
					frame3V.setVisible(true);
	             
	         }});
		
		buttonVendas.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	
	        	 
					frame4V.setVisible(true);
	             
	         }});
		
		buttonRelatorios.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
					frame5V.setVisible(true);
	             
	         }});
	}
}
