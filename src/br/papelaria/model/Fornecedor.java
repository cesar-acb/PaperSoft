package br.papelaria.model;

import br.papelaria.control.ControladorPersistencia;

public class Fornecedor extends ControladorPersistencia
{
	private String nome;
	private int cod_fornecedor;
	private String endereco;
	private String cnpj;
	private String ie;
	private String telefone;
	private String email;
	

	public void incluirFornecedor(String nome, int cod_fornecedor, String endereco, String cnpj, String ie, String telefone, String email)
	{
		this.nome = nome;
		this.cod_fornecedor = cod_fornecedor;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.ie = ie;
		this.telefone = telefone;
		this.email = email;
	}
	
	public void alterarFornecedor(String nome, int cod_fornecedor, String endereco, String cnpj, String ie, String telefone, String email)
	{
		this.nome = nome;
		this.cod_fornecedor = cod_fornecedor;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.ie = ie;
		this.telefone = telefone;
		this.email = email;
		
	}
	
	public int consultarFornecedor(int cod_fornecedor)
	{
		this.cod_fornecedor = cod_fornecedor;
		
		return cod_fornecedor;
	}
	
	public void excluirFornecedor(int cod_fornecedor)
	{
		this.cod_fornecedor = cod_fornecedor;
		
	}
	
	}
