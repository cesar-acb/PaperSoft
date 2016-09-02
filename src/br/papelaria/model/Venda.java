package br.papelaria.model;
import br.papelaria.control.ControladorVendas;


public class Venda extends ControladorVendas
{
	private int cod_cliente;
	private int cod_produto;
	
	public void registrarVenda(int cod_cliente, int cod_produto)
	{
		this.cod_cliente = cod_cliente;
		this.cod_produto = cod_produto;
		
	}
	
	public void registrarProduto()
	{
		
	}	
	
}
