package br.papelaria.model;

import br.papelaria.control.ControladorVendas;

public class Pagamento extends ControladorVendas{
	
	private String tipo_pagamento;
	private float valor_compra;
	
	public void registraPagamento(String tipo_pagamento, float valor_compra)
	{
		this.tipo_pagamento = tipo_pagamento;
		this.valor_compra = valor_compra;
	}
	
	

}
