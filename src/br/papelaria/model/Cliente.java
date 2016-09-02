package br.papelaria.model;


import br.papelaria.control.ControladorVendas;
import br.papelaria.control.ControladorPersistencia;


public class Cliente extends ControladorPersistencia
{

	private String nome_cliente;
	private int cod_cliente;
	private String endereco_cliente;
	private String telefone_cliente;
	private String email_cliente;

	
	


	public void incluirCliente(String nome_cliente, String endereco_cliente, String telefone_cliente, String email_cliente)
	{
		this.nome_cliente = nome_cliente;
		this.endereco_cliente = endereco_cliente;
		this.telefone_cliente = telefone_cliente;
		this.email_cliente = email_cliente;	
		
	
	}


	public void alterarCliente(String nome_cliente, String endereco_cliente, String telefone_cliente, String email_cliente)
	{
		this.nome_cliente = nome_cliente;
		this.endereco_cliente = endereco_cliente;
		this.telefone_cliente = telefone_cliente;
		this.email_cliente = email_cliente;	
	}


	public int consultaCliente(int cod_cliente)
	{
		this.cod_cliente = cod_cliente;
		
		return cod_cliente;
	}


	public void excluirCliente(int cod_cliente)
	{
		this.cod_cliente = cod_cliente;		
	}
	



	
}
