package br.com.fdl.sisloja.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@PrimaryKeyJoinColumn(name="codigo")

public class Cliente extends Pessoa{
	@ManyToOne
	private Endereco endereco;
	
	//@Column(nullable=false)
	private Boolean status;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the data
	 */
	public Date getData() {
		return dataCadastro;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.dataCadastro = data;
	}
	
	
}
