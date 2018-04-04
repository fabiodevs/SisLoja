package br.com.fdl.sisloja.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import br.com.fdl.sisloja.domain.Usuario;

public class UsuarioDAOTeste {
	
	@Test
	public void salvar() {
		
		Usuario usuario = new Usuario();
		usuario.setNome("Fabio");
		usuario.setSobreNome("Azevedo");
		usuario.setSenha("1234");
		usuario.setTipo("Basico");
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
					
	}
	
	@Test
	@Ignore
	public void listar() {
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> resultado = usuarioDAO.listar();
		
		for(Usuario usuario:resultado) {
			System.out.println("Codigo: "+usuario.getCodigo());
			System.out.println("Tipo de Usuário: "+usuario.getTipo());
			System.out.println("----------------------");
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		
		if(usuario==null) {
			System.out.println("Registro não encontrado");
		}else {
			System.out.println(usuario.getCodigo());
		}	
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigo = 5L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		
		if(usuario==null) {
			System.out.println("Registro não encontrado");
		}else {
			usuarioDAO.excluir(usuario);
			System.out.println(usuario.getCodigo()+" - " +" - " + usuario.getTipo());
		}	
	}
	
	@Test
	@Ignore
	public void editar() {
		Long codigo = 1L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		
		if(usuario==null) {
			System.out.println("Registro não encontrado");
		}else {
			
			usuario.setTipo("Adm");
			usuarioDAO.editar(usuario);
		}	
	}

}
