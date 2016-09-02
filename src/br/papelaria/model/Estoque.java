package br.papelaria.model;

import br.papelaria.control.ControladorVendas;

public class Estoque extends ControladorVendas{
	
	private int quantidade_produto;
	private String nome_produto;
	private int tipo_produto;
	
	public void relatorioEstoqueDiario(int quantidade_produto, String nome_produto, int tipo_produto)
	{
		this.quantidade_produto = quantidade_produto;
		this.nome_produto = nome_produto;
		this.tipo_produto = tipo_produto;
		
	}
	

}
