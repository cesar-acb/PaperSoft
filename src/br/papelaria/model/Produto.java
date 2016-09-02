

package br.papelaria.model;
import br.papelaria.control.ControladorPersistencia;

public class Produto extends ControladorPersistencia
{
	private String nome_produto;
	private String tipo_produto;
	private float valor_compra_produto;
	private float valor_venda_produto;
	private int cod_fornecedor;
	private int cod_produto;
	
	public void incluirProduto(String nome_produto, String tipo_produto, float valor_compra_produto, float valor_venda_produto)
	{
		this.nome_produto = nome_produto;
		this.tipo_produto = tipo_produto;
		this.valor_compra_produto = valor_compra_produto;
		this.valor_venda_produto = valor_venda_produto;
		
	}
	
	public void alterarProduto(String nome_produto, String tipo_produto, float valor_compra_produto, float valor_venda_produto)
	{
		this.nome_produto = nome_produto;
		this.tipo_produto = tipo_produto;
		this.valor_compra_produto = valor_compra_produto;
		this.valor_venda_produto = valor_venda_produto;
		
	}
	
	public int consultarProduto (int cod_produto)
	{
		this.cod_produto = cod_produto;
		
		return cod_produto;
	}
	
	public void excluirProduto (int cod_produto)
	{
		this.cod_produto = cod_produto;
	}
}
