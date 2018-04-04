package br.com.fdl.sisloja.dao;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.fdl.sisloja.domain.Cliente;
import br.com.fdl.sisloja.domain.Endereco;
import br.com.fdl.sisloja.domain.Uf;


public class ClienteDAOTeste {
	@Test
	@Ignore
	public void salvar() throws ParseException {
		
		Long codigo = 1L;
		UfDAO ufDAO = new UfDAO();
		Uf uf =ufDAO.buscar(codigo);
		
		Endereco endereco = new Endereco();
		
		endereco.setRua("Rua Teste");
		endereco.setNumero(new BigInteger("10"));
		endereco.setBairro("Japteste");
		endereco.setCidade("Japeribaba");
		endereco.setUf(uf);

		
		Cliente cliente = new Cliente();
		cliente.setNome("Fabio");
		cliente.setSobreNome("Silva");
		cliente.setCelular("99999");
		cliente.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("05/03/1986"));
		cliente.setStatus(false);
		
							
		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(endereco, cliente);
		
	}
	
	@Test
	@Ignore
	public void listar() {
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultado = clienteDAO.listar();
		
		for(Cliente cliente:resultado) {
			System.out.println("Codigo: "+ cliente.getCodigo());
			//System.out.println("Nome: "+ cliente.getPessoa().getNome());
			System.out.println("Codigo: "+ cliente.getStatus());
			
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 3L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		
		if(cliente==null) {
			System.out.println("Registro não encontrado");
		}else {
			//System.out.println(cliente.getCodigo()+" - "+cliente.getPessoa().getNome()+" - "+cliente.getPessoa().getSobreNome() +" - " + cliente.getStatus());
		}	
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigo = 5L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		
		if(cliente==null) {
			System.out.println("Registro não encontrado");
		}else {
			clienteDAO.excluir(cliente);
			//System.out.println(cliente.getCodigo()+" - "+cliente.getPessoa().getNome()+" - "+cliente.getPessoa().getSobreNome() +" - " + cliente.getStatus());
		}	
	}
	
	@Test
	@Ignore
	public void editar() {
		Long codigo = 1L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		
		if(cliente==null) {
			System.out.println("Registro não encontrado");
		}else {
			
			cliente.setStatus(true);
			
			clienteDAO.editar(cliente);
		}	
	}
	
	

}
