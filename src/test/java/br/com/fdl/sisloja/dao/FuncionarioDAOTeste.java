package br.com.fdl.sisloja.dao;

import java.util.Date;

import org.junit.Test;

import br.com.fdl.sisloja.domain.Endereco;
import br.com.fdl.sisloja.domain.Funcionario;

public class FuncionarioDAOTeste {
	
	@Test
	public void salvar() {
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(1L);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Fabio");
		funcionario.setSobreNome("Azevedo");
		funcionario.setDataCadastro(new Date());
		funcionario.setFuncao("Tecnico");
		funcionario.setEndereco(endereco);
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.salvar(funcionario);
	}

}
