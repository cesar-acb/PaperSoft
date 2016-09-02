package br.papelaria.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;

import br.papelaria.model.Cliente;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Window.Type;

public class Clientes extends JFrame {

	private JPanel painelPrincipal;
	private JTextField textFieldNome;
	private JTextField textFieldEndereco;
	private JTextField textFieldCodigo;
	private JTextField textFieldTelefone;
	private JTextField textFieldEmail;
	
	static Clientes frame1C = new Clientes();
	static Fornecedores frame2C = new Fornecedores();
	static Produtos frame3C = new Produtos();
	static Vendas frame4C = new Vendas();
	static Relatorios frame5C = new Relatorios();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame1C.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Clientes() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Teodoro\\Desktop\\1.png"));
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("PaperSoft 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 415);
		painelPrincipal = new JPanel();
		painelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelPrincipal);
		painelPrincipal.setLayout(null);

		JButton buttonClientes = new JButton("Clientes");
		buttonClientes.setFont(new Font("Arial", Font.BOLD, 12));
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
		buttonVendas.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonVendas.setBounds(340, 11, 111, 50);
		painelPrincipal.add(buttonVendas);

		JButton buttonRelatorios = new JButton("Relat\u00F3rios");
		buttonRelatorios.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonRelatorios.setBounds(450, 11, 111, 50);
		painelPrincipal.add(buttonRelatorios);

		JPanel painelDadosCadastrais = new JPanel();
		painelDadosCadastrais.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dados Cadastrais",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelDadosCadastrais.setBounds(24, 70, 526, 244);
		painelPrincipal.add(painelDadosCadastrais);
		painelDadosCadastrais.setLayout(null);

		JLabel labelNome = new JLabel("Nome:");
		labelNome.setFont(new Font("Arial", Font.BOLD, 12));
		labelNome.setBounds(37, 35, 46, 14);
		painelDadosCadastrais.add(labelNome);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(93, 30, 295, 20);
		painelDadosCadastrais.add(textFieldNome);
		textFieldNome.setColumns(10);

		JLabel labelCodigo = new JLabel("C\u00F3digo:");
		labelCodigo.setFont(new Font("Arial", Font.BOLD, 12));
		labelCodigo.setBounds(37, 70, 46, 14);
		painelDadosCadastrais.add(labelCodigo);

		textFieldCodigo = new JTextField();
		textFieldCodigo.setColumns(10);
		textFieldCodigo.setBounds(93, 65, 197, 20);
		painelDadosCadastrais.add(textFieldCodigo);

		JRadioButton radioButtonCPF = new JRadioButton("CPF");
		radioButtonCPF.setSelected(true);
		radioButtonCPF.setFont(new Font("Arial", Font.PLAIN, 12));
		radioButtonCPF.setBounds(303, 65, 59, 23);
		painelDadosCadastrais.add(radioButtonCPF);

		JRadioButton radioButtonCNPJ = new JRadioButton("CNPJ");
		radioButtonCNPJ.setEnabled(false);
		radioButtonCNPJ.setFont(new Font("Arial", Font.PLAIN, 12));
		radioButtonCNPJ.setBounds(360, 65, 57, 23);
		painelDadosCadastrais.add(radioButtonCNPJ);

		JLabel labelEndereo = new JLabel("Endere\u00E7o:");
		labelEndereo.setFont(new Font("Arial", Font.BOLD, 12));
		labelEndereo.setBounds(26, 105, 57, 14);
		painelDadosCadastrais.add(labelEndereo);

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
				frame2C.setVisible(true);
					
	         }});
		
		buttonClientes.addActionListener(new java.awt.event.ActionListener(){
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();

	        	
	        	 
					frame1C.setVisible(true);
	             
	         }});
		
		buttonProdutos.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
					frame3C.setVisible(true);
	             
	         }});
		
		buttonVendas.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
	        	
	        	 
					frame4C.setVisible(true);
	             
	         }});
		
		buttonRelatorios.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
					frame5C.setVisible(true);
	             
	         }});
	}
	
	 

}
