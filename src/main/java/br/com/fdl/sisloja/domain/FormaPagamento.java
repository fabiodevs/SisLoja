package br.com.fdl.sisloja.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FormaPagamento {
	
	@Id
	@Column(name = "meu_id", columnDefinition = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(length=50, nullable=false)
	private String descricao;
	
	@Column(nullable=false)
	private Short parcelas;
	
	@Column(nullable=false)
	private BigDecimal juros;

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
	 * @return the parcelas
	 */
	public Short getParcelas() {
		return parcelas;
	}

	/**
	 * @param parcelas the parcelas to set
	 */
	public void setParcelas(Short parcelas) {
		this.parcelas = parcelas;
	}

	/**
	 * @return the juros
	 */
	public BigDecimal getJuros() {
		return juros;
	}

	/**
	 * @param juros the juros to set
	 */
	public void setJuros(BigDecimal juros) {
		this.juros = juros;
	}
	
	

}
