package br.papelaria.model;


import br.papelaria.control.ControladorVendas;

import java.util.Date;


public class Relatorio extends ControladorVendas
{
	
	private int cod_produto;
	private Date data_emissao;
	
	public void exibitRelatorio(int cod_produto, Date data_emissao)
	{
		this.cod_produto = cod_produto;
		this.data_emissao = data_emissao;
	}
	
	public void buscaItem()
	{
		
	}
	
	public void buscaVenda()
	{
		
	}



	
}
