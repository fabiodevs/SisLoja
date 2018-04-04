package br.com.fdl.sisloja.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.fdl.sisloja.domain.Cliente;
import br.com.fdl.sisloja.domain.Pessoa;

public class PessoaDAOTeste {
	
	@Test
	
	public void salvar(){
		Cliente cliente = new Cliente();
		cliente.setNome("Fabio");
		cliente.setSobreNome("Azevedo");
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);
		
		//Pessoa pessoa = new Pessoa();
		//pessoa.setNome("Sarah");
		//pessoa.setSobreNome("Silva");
		//pessoa.setCelular("123456");
		//pessoa.
		
		//PessoaDAO pessoaDAO = new PessoaDAO();
		//pessoaDAO.salvar(pessoa);
	}
	
	@Test
	@Ignore
	public void listar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();
		
		for(Pessoa pessoa:resultado) {
		System.out.println("Nome: " + pessoa.getNome());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		
		Long codigo = 1L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		
		if(pessoa==null) {
			System.out.println("Registro não encontrado");
		}else {
			System.out.println(pessoa.getCodigo()+" - "+pessoa.getNome()+" - "+pessoa.getSobreNome());
		}	
	}
	@Test
	@Ignore
	public void excluir() {
		Long codigo = 4L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		
		if(pessoa==null) {
			System.out.println("Registro não encontrado");
		}else {
			pessoaDAO.excluir(pessoa);
			System.out.println(pessoa.getCodigo()+" - "+pessoa.getNome()+" - "+pessoa.getSobreNome());
		}	
		
	}
	
	@Test
	@Ignore
	public void editar() {
		Long codigo = 1L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		
		if(pessoa==null) {
			System.out.println("Registro não encontrado");
		}else {
			pessoa.setNome("Fabinho");
			pessoaDAO.editar(pessoa);
			
		}	
		
	}
}
