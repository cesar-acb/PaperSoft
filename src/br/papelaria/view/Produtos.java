package br.papelaria.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JComboBox;

public class Produtos extends JFrame {

	private JPanel painelPrincipal;
	private JTextField textFieldNome;
	private JTextField textFieldValorDaCompra;
	private JTextField textFieldTipo;
	private JTextField textFieldValorDaVenda;
	
	static Clientes frame1P = new Clientes();
	static Fornecedores frame2P = new Fornecedores();
	static Produtos frame3P = new Produtos();
	static Vendas frame4P = new Vendas();
	static Relatorios frame5P = new Relatorios();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame1P.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Produtos() {
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
		buttonProdutos.setFont(new Font("Arial", Font.BOLD, 12));
		buttonProdutos.setBounds(230, 11, 111, 50);
		painelPrincipal.add(buttonProdutos);

		JButton buttonVendas = new JButton("Vendas");
		buttonVendas.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonVendas.setBounds(340, 11, 111, 50);
		painelPrincipal.add(buttonVendas);

		JButton buttonRelatorios = new JButton("Relat\u00F3rios");
		buttonRelatorios.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonRelatorios.setBounds(450, 11, 111, 50);
		painelPrincipal.add(buttonRelatorios);

		JPanel painelDadosDoProduto = new JPanel();
		painelDadosDoProduto.setLayout(null);
		painelDadosDoProduto.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dados do Produto",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelDadosDoProduto.setBounds(24, 70, 526, 244);
		painelPrincipal.add(painelDadosDoProduto);

		JLabel labelNome = new JLabel("Nome:");
		labelNome.setFont(new Font("Arial", Font.BOLD, 12));
		labelNome.setBounds(78, 38, 46, 14);
		painelDadosDoProduto.add(labelNome);

		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(140, 33, 277, 20);
		painelDadosDoProduto.add(textFieldNome);

		JLabel labelTipo = new JLabel("Tipo:");
		labelTipo.setFont(new Font("Arial", Font.BOLD, 12));
		labelTipo.setBounds(78, 73, 46, 14);
		painelDadosDoProduto.add(labelTipo);

		textFieldTipo = new JTextField();
		textFieldTipo.setColumns(10);
		textFieldTipo.setBounds(140, 68, 197, 20);
		painelDadosDoProduto.add(textFieldTipo);

		JLabel labelValorDaCompra = new JLabel("Valor da Compra:");
		labelValorDaCompra.setFont(new Font("Arial", Font.BOLD, 12));
		labelValorDaCompra.setBounds(26, 108, 98, 14);
		painelDadosDoProduto.add(labelValorDaCompra);

		textFieldValorDaCompra = new JTextField();
		textFieldValorDaCompra.setColumns(10);
		textFieldValorDaCompra.setBounds(140, 103, 74, 20);
		painelDadosDoProduto.add(textFieldValorDaCompra);

		JLabel labelValorDaVenda = new JLabel("Valor da Venda:");
		labelValorDaVenda.setFont(new Font("Arial", Font.BOLD, 12));
		labelValorDaVenda.setBounds(26, 143, 98, 14);
		painelDadosDoProduto.add(labelValorDaVenda);

		textFieldValorDaVenda = new JTextField();
		textFieldValorDaVenda.setColumns(10);
		textFieldValorDaVenda.setBounds(140, 138, 74, 20);
		painelDadosDoProduto.add(textFieldValorDaVenda);

		JLabel labelFornecedor = new JLabel("Fornecedor:");
		labelFornecedor.setFont(new Font("Arial", Font.BOLD, 12));
		labelFornecedor.setBounds(37, 175, 87, 14);
		painelDadosDoProduto.add(labelFornecedor);

		JComboBox comboBoxFornecedor = new JComboBox();
		comboBoxFornecedor.setBounds(140, 173, 138, 20);
		painelDadosDoProduto.add(comboBoxFornecedor);

		JButton buttonConfirmar = new JButton("Confirmar");
		buttonConfirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonConfirmar.setBounds(154, 210, 89, 23);
		painelDadosDoProduto.add(buttonConfirmar);

		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonCancelar.setBounds(273, 210, 89, 23);
		painelDadosDoProduto.add(buttonCancelar);

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
		        	
		        	
	        	 
					frame2P.setVisible(true);
	             
	         }});
		
		buttonClientes.addActionListener(new java.awt.event.ActionListener(){
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();

	        	
	        	 
					frame1P.setVisible(true);
	             
	         }});
		
		buttonProdutos.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
					frame3P.setVisible(true);
	             
	         }});
		
		buttonVendas.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	
	        	 
					frame4P.setVisible(true);
	             
	         }});
		
		buttonRelatorios.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
					frame5P.setVisible(true);
	             
	         }});
	}
}
