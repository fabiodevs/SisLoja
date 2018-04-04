package br.com.fdl.sisloja.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Equipamento {
	
	@Column(length=20)
	private String numeroSerie;
	
	@Column(nullable=false, length=20)
	private String descricao;
	
	@Column(nullable=false, length=20)
	private String marca;
	
	@Temporal(TemporalType.DATE)
	private Date vencimentoGarantia;
	
	@Column(length=20)
	private String acessorios;
	
	@Column(length=200)
	private String observacao;
	
	@Column(nullable=false, length=20)
	private String modelo;

	/**
	 * @return the numeroSerie
	 */
	public String getNumeroSerie() {
		return numeroSerie;
	}

	/**
	 * @param numeroSerie the numeroSerie to set
	 */
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

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
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the vencimentoGarantia
	 */
	public Date getVencimentoGarantia() {
		return vencimentoGarantia;
	}

	/**
	 * @param vencimentoGarantia the vencimentoGarantia to set
	 */
	public void setVencimentoGarantia(Date vencimentoGarantia) {
		this.vencimentoGarantia = vencimentoGarantia;
	}

	/**
	 * @return the acessorios
	 */
	public String getAcessorios() {
		return acessorios;
	}

	/**
	 * @param acessorios the acessorios to set
	 */
	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}

	/**
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
