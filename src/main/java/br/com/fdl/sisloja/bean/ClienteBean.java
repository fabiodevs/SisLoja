package br.com.fdl.sisloja.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.fdl.sisloja.dao.ClienteDAO;
import br.com.fdl.sisloja.dao.UfDAO;
import br.com.fdl.sisloja.domain.Cliente;
import br.com.fdl.sisloja.domain.Endereco;
import br.com.fdl.sisloja.domain.Uf;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable{
	private Cliente cliente;
	private List<Cliente> clientes;
	private List<Uf> estados;
	private Endereco endereco;
	
	//Métodos Set e Get
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<Uf> getEstados() {
		return estados;
	}
	public void setEstados(List<Uf> estados) {
		this.estados = estados;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	//Fim dos métodos Get e Set
	
	public void novo(){
		try {
			cliente = new Cliente();
			endereco = new Endereco();
			UfDAO ufDAO = new UfDAO();
			estados = ufDAO.listar();
			
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Erro ao tentar listar o endereço!");
			erro.printStackTrace();
		}//Fm do Try Catch
	}//Fim do método novo
	
	@PostConstruct
	public void listar() {
		try {
			ClienteDAO clienteDAO = new ClienteDAO();
			clientes = clienteDAO.listar("nome");
		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Erro ao tentar carregar os clientes!");
			erro.printStackTrace();
		}//Fm do Try Catch
	}//Fim do método listar
	
	public void salvar() {
		try {
			ClienteDAO clienteDAO = new ClienteDAO();
			clienteDAO.salvar(endereco, cliente);
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Erro ao tentar salvar o Cliente!");
		}
	}
}
