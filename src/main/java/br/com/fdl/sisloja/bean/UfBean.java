package br.com.fdl.sisloja.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.fdl.sisloja.dao.UfDAO;
import br.com.fdl.sisloja.domain.Uf;

/**
 * @author FDL Tecnologia
 *
 */
@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class UfBean implements Serializable{
	
	private Uf uf;
	private List<Uf> estados;
	
	//Metodos get e set
	public Uf getUf() {
		return uf;
	}
	public void setUf(Uf uf) {
		this.uf = uf;
	}


	public List<Uf> getEstados() {
		return estados;
	}
	public void setEstados(List<Uf> estados) {
		this.estados = estados;
	}
	//Fim dos metodos get e set
	
	@PostConstruct
	public void listar() {
		
		 try {
			 UfDAO ufDAO =new UfDAO();
			 estados = ufDAO.listar("nome");
		} catch (RuntimeException erro) {
			Messages.addGlobalInfo("Não foi possível mostrar os Estados!");
		}//Fim Try Catch
	}//Fim do método listar
	
	public void novo() {
		uf = new Uf();
	}//Fim do méodo novo
	
	public void salvar() {
		try {
			UfDAO ufDAO = new UfDAO();
			ufDAO.merge(uf);
			novo();
			estados = ufDAO.listar();
			Messages.addFlashGlobalInfo("Estado salvo com sucesso!");
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Erro ao tentar salvar o Estado!");
		}
	}
	
	public void excluir(ActionEvent evento) {
		try {
			uf = (Uf) evento.getComponent().getAttributes().get("estadoSelecionado");
			
			UfDAO ufDAO = new UfDAO();
			ufDAO.excluir(uf);
			estados = ufDAO.listar();
			Messages.addGlobalInfo("Estado excluído com sucesso");
		} catch (RuntimeException erro) {
			erro.printStackTrace();
			Messages.addGlobalError("Erro ao tentar excluir");
		}
	}
	
	public void editar(ActionEvent evento) {
		try {
			uf = (Uf) evento.getComponent().getAttributes().get("estadoSelecionado");
			
			UfDAO ufDAO = new UfDAO();
			ufDAO.merge(uf);
			Messages.addGlobalInfo("Estado editado com sucesso");
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Erro ao tentar editar!");
			erro.printStackTrace();
		}
	}
}
