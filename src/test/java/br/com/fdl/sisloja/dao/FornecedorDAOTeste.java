package br.com.fdl.sisloja.dao;

import org.junit.Test;

import br.com.fdl.sisloja.domain.Endereco;
import br.com.fdl.sisloja.domain.Fornecedor;

public class FornecedorDAOTeste {
	
	@Test
	public void salvar() {
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(1L);
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNomeFantasia("Eletrocel");
		fornecedor.setRazaoSocial("Eletrocel Peças");
		fornecedor.setCnpj("111111111");
		fornecedor.setEndereco(endereco);
		fornecedor.setStatus(true);
		
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		fornecedorDAO.salvar(fornecedor);
	}
}
