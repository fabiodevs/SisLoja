package br.com.fdl.sisloja.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Servico {
	
	@Column(length=50, nullable=false)
	private String descricao;
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataServico;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private Funcionario funcionario;

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the dataServico
	 */
	public Date getDataServico() {
		return dataServico;
	}

	/**
	 * @param dataServico the dataServico to set
	 */
	public void setDataServico(Date dataServico) {
		this.dataServico = dataServico;
	}

	/**
	 * @return the funcionario
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}

	/**
	 * @param funcionario the funcionario to set
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	

}
