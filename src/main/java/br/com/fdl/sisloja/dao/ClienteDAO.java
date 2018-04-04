package br.com.fdl.sisloja.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fdl.sisloja.domain.Cliente;
import br.com.fdl.sisloja.domain.Endereco;
import br.com.fdl.sisloja.util.HibernateUtil;

public class ClienteDAO extends GenericDAO<Cliente>{
	
	public void salvar(Endereco endereco, Cliente cliente) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;
		
		try {
			transacao = sessao.beginTransaction();
			
			sessao.merge(endereco);
		
			cliente.setEndereco(endereco);
				
			sessao.merge(cliente);
			
			
			transacao.commit();
		}catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}throw erro;
		}finally {
			sessao.close();
		}
	}

}
