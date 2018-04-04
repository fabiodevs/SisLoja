package br.com.fdl.sisloja.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.fdl.sisloja.domain.Uf;

public class UfDAOTeste {
	
	@Test
	//@Ignore
	public void salvar(){
		Uf uf = new Uf();
		uf.setNome("São Paulo");
		uf.setSigla("SP");
		
		UfDAO ufDAO = new UfDAO();
		ufDAO.salvar(uf);
	}
	
	@Test
	@Ignore
	public void listar() {
		
		UfDAO ufDAO = new UfDAO();
		List<Uf> resultado = ufDAO.listar();
		
		for(Uf uf:resultado) {
			System.out.println(uf.getCodigo()+" - "+uf.getNome()+" - "+uf.getSigla());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 9L;
		UfDAO ufDAO = new UfDAO();
		Uf uf = ufDAO.buscar(codigo);
		
		if(uf==null) {
			System.out.println("Registro não encontrado");
		}else {
			System.out.println(uf.getCodigo()+" - "+uf.getNome()+" - "+uf.getSigla());
		}	
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;
		UfDAO ufDAO = new UfDAO();
		Uf uf = ufDAO.buscar(codigo);
		
		if(uf==null) {
			System.out.println("Registro não encontrado");
		}else {
			ufDAO.excluir(uf);
			System.out.println(uf.getCodigo()+" - "+uf.getNome()+" - "+uf.getSigla());
		}	
	}
	
	@Test
	@Ignore
	public void editar() {
		Long codigo = 2L;
		UfDAO ufDAO = new UfDAO();
		Uf uf = ufDAO.buscar(codigo);
		
		if(uf==null) {
			System.out.println("Registro não encontrado");
		}else {
			
			uf.setSigla("RJ");
			ufDAO.editar(uf);
		}	
	}
}
