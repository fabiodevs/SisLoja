package br.com.fdl.sisloja.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.fdl.sisloja.domain.Endereco;
import br.com.fdl.sisloja.domain.Uf;

public class EnderecoDAOTeste {
	
	@Test
	//@Ignore
	public void salvar() {
		UfDAO ufDAO = new UfDAO();
		Uf uf = ufDAO.buscar(1L);
		Endereco endereco = new Endereco();
		endereco.setRua("Sheik Rejane");
		//endereco.setNumero(new Short ("524"));
		endereco.setBairro("Centro");
		
		endereco.setCidade("Japeri");
		endereco.setUf(uf);
		
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		enderecoDAO.salvar(endereco);
		
	}
	
	@Test
	@Ignore
	public void listar() {
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		List<Endereco> resultado = enderecoDAO.listar();
		
		for(Endereco endereco:resultado) {
			System.out.println("Codigo: "+endereco.getCodigo());
			System.out.println("Rua: "+endereco.getRua());
			System.out.println("UF: "+endereco.getUf().getSigla());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 2L;
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigo);
		
		if(endereco==null) {
			System.out.println("Registro não encontrado");
		}else {
			System.out.println(endereco.getCodigo()+" - "+endereco.getRua()+" - "+endereco.getCidade() +" - " + endereco.getUf().getSigla());
		}	
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigo = 3L;
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigo);
		
		if(endereco==null) {
			System.out.println("Registro não encontrado");
		}else {
			enderecoDAO.excluir(endereco);
			System.out.println(endereco.getCodigo()+" - "+endereco.getRua()+" - "+endereco.getCidade() +" - " + endereco.getUf().getSigla());
		}	
	}
	
	@Test
	@Ignore
	public void editar() {
		Long codigo = 2L;
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigo);
		
		if(endereco==null) {
			System.out.println("Registro não encontrado");
		}else {
			endereco.setCidade("Japera");
			endereco.setRua("Emidio Lemos");
			enderecoDAO.editar(endereco);
		}	
	}

}
