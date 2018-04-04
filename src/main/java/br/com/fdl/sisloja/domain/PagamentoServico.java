package br.com.fdl.sisloja.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class PagamentoServico {
	
	@Column(nullable=false, precision=8, scale=2)
	private BigDecimal valorServico;
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPagamentoServico;
	
	@Column(nullable=false, precision=8, scale=2)
	private BigDecimal valorRestante;

	/**
	 * @return the valorServico
	 */
	public BigDecimal getValorServico() {
		return valorServico;
	}

	/**
	 * @param valorServico the valorServico to set
	 */
	public void setValorServico(BigDecimal valorServico) {
		this.valorServico = valorServico;
	}

	/**
	 * @return the dataPagamentoServico
	 */
	public Date getDataPagamentoServico() {
		return dataPagamentoServico;
	}

	/**
	 * @param dataPagamentoServico the dataPagamentoServico to set
	 */
	public void setDataPagamentoServico(Date dataPagamentoServico) {
		this.dataPagamentoServico = dataPagamentoServico;
	}

	/**
	 * @return the valorRestante
	 */
	public BigDecimal getValorRestante() {
		return valorRestante;
	}

	/**
	 * @param valorRestante the valorRestante to set
	 */
	public void setValorRestante(BigDecimal valorRestante) {
		this.valorRestante = valorRestante;
	}
	
	

}
