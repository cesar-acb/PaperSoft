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

public class Relatorios extends JFrame {

	private JPanel painelPrincipal;
	
	static Clientes frame1R = new Clientes();
	static Fornecedores frame2R = new Fornecedores();
	static Produtos frame3R = new Produtos();
	static Vendas frame4R = new Vendas();
	static Relatorios frame5R = new Relatorios();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					frame1R.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	/**
	 * Create the frame.
	 */
	public Relatorios() {
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
		buttonVendas.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonVendas.setBounds(340, 11, 111, 50);
		painelPrincipal.add(buttonVendas);

		JButton buttonRelatorios = new JButton("Relat\u00F3rios");
		buttonRelatorios.setFont(new Font("Arial", Font.BOLD, 12));
		buttonRelatorios.setBounds(450, 11, 111, 50);
		painelPrincipal.add(buttonRelatorios);

		JButton buttonEmitirRelatrio = new JButton("Emitir Relat\u00F3rio");
		buttonEmitirRelatrio.setFont(new Font("Arial", Font.PLAIN, 12));
		buttonEmitirRelatrio.setBounds(418, 92, 117, 23);
		painelPrincipal.add(buttonEmitirRelatrio);

		JLabel labelFiltrarPor = new JLabel("Filtrar por:");
		labelFiltrarPor.setFont(new Font("Arial", Font.BOLD, 12));
		labelFiltrarPor.setBounds(10, 96, 72, 14);
		painelPrincipal.add(labelFiltrarPor);

		JComboBox comboBoxFiltrarPor = new JComboBox();
		comboBoxFiltrarPor.setBounds(87, 91, 138, 20);
		painelPrincipal.add(comboBoxFiltrarPor);
		
		buttonFornecedores.addActionListener(new java.awt.event.ActionListener(){
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
		        	
		        	
	        	 
					frame2R.setVisible(true);
	             
	         }});
		
		buttonClientes.addActionListener(new java.awt.event.ActionListener(){
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();

	        	
	        	 
					frame1R.setVisible(true);
	             
	         }});
		
		buttonProdutos.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
					frame3R.setVisible(true);
	             
	         }});
		
		buttonVendas.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	
	        	 
					frame4R.setVisible(true);
	             
	         }});
		
		buttonRelatorios.addActionListener(new java.awt.event.ActionListener(){  
	         public void actionPerformed(java.awt.event.ActionEvent evt) 
	         {  
	        	 dispose();
	        	 
					frame5R.setVisible(true);
	             
	         }});
	}
}
