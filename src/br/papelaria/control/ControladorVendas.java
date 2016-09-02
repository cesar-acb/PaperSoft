package br.papelaria.control;

import java.util.Date;
import java.util.List;


import br.papelaria.model.Cliente;
import br.papelaria.model.Produto;

public class ControladorVendas {
	
	public void incluirCliente(String nome_cliente, String endereco_cliente, String telefone_cliente, String email_cliente)
	{
		
	
	}


	public void alterarCliente(String nome_cliente, String endereco_cliente, String telefone_cliente, String email_cliente)
	{
			
	}


	public int consultaCliente(int cod_cliente)
	{
		
		return cod_cliente;
	}


	public void excluirCliente(int cod_cliente)
	{
		
		
	}
	
	public void relatorioEstoqueDiario(int quantidade_produto, String nome_produto, int tipo_produto)
	{
	
		
	}
	
	public void incluirFornecedor(String nome, int cod_fornecedor, String endereco, String cnpj, String ie, String telefone, String email)
	{
		
	}
	
	public void alterarFornecedor(String nome, int cod_fornecedor, String endereco, String cnpj, String ie, String telefone, String email)
	{
		
		
	}
	
	public int consultarFornecedor(int cod_fornecedor)
	{
			
		
		return cod_fornecedor;
	}
	
	public void excluirFornecedor(int cod_fornecedor)
	{
		
		
	}
	
	public void registraPagamento(String tipo_pagamento, float valor_compra)
	{
		
	}
	
	public void incluirProduto(String nome_produto, String tipo_produto, float valor_compra_produto, float valor_venda_produto)
	{
		
		
	}
	
	public void alterarProduto(String nome_produto, String tipo_produto, float valor_compra_produto, float valor_venda_produto)
	{
		
		
	}
	
	public int consultarProduto (int cod_produto)
	{
		
		return cod_produto;
	}
	
	public void excluirProduto (int cod_produto)
	{
		
	}
	
	public void exibitRelatorio(int cod_produto, Date data_emissao)
	{
		
	}
	
	public void buscaItem()
	{
		
	}
	
	public void buscaVenda()
	{
		
	}
	
	public void registrarVenda(int cod_cliente, int cod_produto)
	{
		
	}
	
	public void registrarProduto()
	{
		
	}

	
	
}

	

	

