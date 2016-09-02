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
import javax.swing.JRadioButton;
import java.awt.Toolkit;

public class Fornecedores extends JFrame {

	private JPanel painelPrincipal;
	private JTextField textFieldNome;
	private JTextField textFieldEndereco;
	private JTextField textFieldCNPJ;
	private JTextField textFieldTelefone;
	private JTextField textFieldEmail;
	private JTextField textFieldIE;
	
	static Clientes frame1F = new Clientes();
	static Fornecedores frame2F = new Fornecedores();
	static Produtos frame3F = new Produtos();
	static Vendas frame4F = new Vendas();
	static Relatorios frame5F = new Relatorios();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					frame1F.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fornecedores() {
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
		buttonFornecedores.setFont(new Font("Arial", Font.BOLD, 12));
		buttonFornecedores.setBounds(120, 11, 115, 50);
		painelPrincipal.add(buttonFornecedores);

		JButton buttonProdutos = new JButton("Produtos");
		buttonProdutos.setFont(new Font("Arial", Font.PLAIN, 12));
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

		JPanel painelDadosCadastrais = new JPanel();
		painelDadosCadastrais.setLayout(null);
		painelDadosCadastrais.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dados Cadastrais",

				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelDadosCadastrais.setBounds(24, 70, 526, 244);
		painelPrincipal.add(painelDadosCadastrais);

		JLabel labelNome = new JLabel("Nome:");
		labelNome.setFont(new Font("Arial", Font.BOLD, 12));
		labelNome.setBounds(37, 35, 46, 14);
		painelDadosCadastrais.add(labelNome);

		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(93, 30, 295, 20);
		painelDadosCadastrais.add(textFieldNome);

		JLabel labelCNPJ = new JLabel("CNPJ:");
		labelCNPJ.setFont(new Font("Arial", Font.BOLD, 12));
		labelCNPJ.setBounds(37, 70, 46, 14);
		painelDadosCadastrais.add(labelCNPJ);

		textFieldCNPJ = new JTextField();
		textFieldCNPJ.setColumns(10);
		textFieldCNPJ.setBounds(93, 65, 197, 20);
		painelDadosCadastrais.add(textFieldCNPJ);

		JLabel labelIE = new JLabel("IE:");
		labelIE.setFont(new Font("Arial", Font.BOLD, 12));
		labelIE.setBounds(301, 70, 19, 14);
		painelDadosCadastrais.add(labelIE);

		textFieldIE = new JTextField();
		textFieldIE.setColumns(10);
		textFieldIE.setBounds(319, 65, 197, 20);
		painelDadosCadastrais.add(textFieldIE);

		JLabel labelEndereco = new JLabel("Endere\u00E7o:");
		labelEndereco.setFont(new Font("Arial", Font.BOLD, 12));
		labelEndereco.setBounds(26, 105, 57, 14);
		painelDadosCadastrais.add(labelEndereco);

		textFieldEndereco = new JTextField();
		textFieldEndereco.setColumns(10);
		textFieldEndereco.setBounds(93, 100, 295, 20);
		painelDadosCadastrais.add(textFieldEndereco);

		JLabel labelTelefone = new JLabel("Telefone:");
		labelTelefone.setFont(new Font("Arial", Font.BOLD, 12));
		labelTelefone.setBounds(26, 140, 57, 14);
		painelDadosCadastrais.add(labelTelefone);

		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBounds(93, 135, 197, 20);
		painelDadosCadastrais.add(textFieldTelefone);

		JLabel labelEmail = new JLabel("E-mail:");
		labelEmail.setFont(new Font("Arial", Font.BOLD, 12));
		labelEmail.setBounds(37, 175, 46, 14);
		painelDadosCadastrais.add(labelEmail);

		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(93, 170, 197, 20);
		painelDadosCadastrais.add(textFieldEmail);

		JButton buttonConfirmar = new JButton("Confirmar");
		buttonConfirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonConfirmar.setBounds(154, 210, 89, 23);
		painelDadosCadastrais.add(buttonConfirmar);

		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonCancelar.setBounds(273, 210, 89, 23);
		painelDadosCadastrais.add(buttonCancelar);

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
		        	
		        	
	        	 
					frame2F.setVisible(true);
	             
	         }});
		
		buttonClientes.addActionListener(new java.awt.event.ActionListener(){
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();

	        	
	        	 
					frame1F.setVisible(true);
	             
	         }});
		
		buttonProdutos.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
					frame3F.setVisible(true);
	             
	         }});
		
		buttonVendas.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
					frame4F.setVisible(true);
	             
	         }});
		
		buttonRelatorios.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
					frame5F.setVisible(true);
	             
	         }});
	}

}
