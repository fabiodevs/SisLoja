package br.com.fdl.sisloja.dao;

import br.com.fdl.sisloja.domain.Transportadora;

public class TransportadoraDAOTeste {
	
	public void salvar() {
		Transportadora transportadora = new Transportadora();
		transportadora.setRazaoSocial("TranspRio");
		transportadora.setNomeFantasia("Transportadora");
	}

}
