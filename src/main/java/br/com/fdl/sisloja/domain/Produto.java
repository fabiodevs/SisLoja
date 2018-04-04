package br.com.fdl.sisloja.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Produto {
	
	@Id
	@Column(name = "meu_id", columnDefinition = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(length=30)
	private String codigoBarra;
	
	@Column(length=30, nullable=false)
	private String descricao;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private Fornecedor fornecedor;
	
	@Column(length=30)
	private String localProduto;
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	@Column(length=2, nullable=false)
	private String unidade;
	
	@Column(length=30, nullable=false)
	private String marca;
	
	@Column(nullable=false, precision=8, scale=2)
	private BigDecimal valorCustoinicial;
	
	@Column(nullable=false, precision=8, scale=2)
	private BigDecimal frete;
	
	@Column(nullable=false, precision=8, scale=2)
	private BigDecimal encargos;
	
	@Column(nullable=false, precision=8, scale=2)
	private BigDecimal valorCustoFinal;
	
	@Column(nullable=false, precision=8, scale=2)
	private BigDecimal margemLucro;
	
	@Column(nullable=false, precision=8, scale=2)
	private BigDecimal comissão;
	
	@Column(nullable=false)
	private Short estoqueAtual;
	
	@Column(nullable=false)
	private Boolean status;

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
	 * @return the codigoBarra
	 */
	public String getCodigoBarra() {
		return codigoBarra;
	}

	/**
	 * @param codigoBarra the codigoBarra to set
	 */
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
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
	 * @return the fornecedor
	 */
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	/**
	 * @param fornecedor the fornecedor to set
	 */
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	/**
	 * @return the localProduto
	 */
	public String getLocalProduto() {
		return localProduto;
	}

	/**
	 * @param localProduto the localProduto to set
	 */
	public void setLocalProduto(String localProduto) {
		this.localProduto = localProduto;
	}

	/**
	 * @return the dataCadastro
	 */
	public Date getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	/**
	 * @return the unidade
	 */
	public String getUnidade() {
		return unidade;
	}

	/**
	 * @param unidade the unidade to set
	 */
	public void setUnidade(String unidade) {
		this.unidade = unidade;
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
	 * @return the valorCustoinicial
	 */
	public BigDecimal getValorCustoinicial() {
		return valorCustoinicial;
	}

	/**
	 * @param valorCustoinicial the valorCustoinicial to set
	 */
	public void setValorCustoinicial(BigDecimal valorCustoinicial) {
		this.valorCustoinicial = valorCustoinicial;
	}

	/**
	 * @return the frete
	 */
	public BigDecimal getFrete() {
		return frete;
	}

	/**
	 * @param frete the frete to set
	 */
	public void setFrete(BigDecimal frete) {
		this.frete = frete;
	}

	/**
	 * @return the encargos
	 */
	public BigDecimal getEncargos() {
		return encargos;
	}

	/**
	 * @param encargos the encargos to set
	 */
	public void setEncargos(BigDecimal encargos) {
		this.encargos = encargos;
	}

	/**
	 * @return the valorCustoFinal
	 */
	public BigDecimal getValorCustoFinal() {
		return valorCustoFinal;
	}

	/**
	 * @param valorCustoFinal the valorCustoFinal to set
	 */
	public void setValorCustoFinal(BigDecimal valorCustoFinal) {
		this.valorCustoFinal = valorCustoFinal;
	}

	/**
	 * @return the margemLucro
	 */
	public BigDecimal getMargemLucro() {
		return margemLucro;
	}

	/**
	 * @param margemLucro the margemLucro to set
	 */
	public void setMargemLucro(BigDecimal margemLucro) {
		this.margemLucro = margemLucro;
	}

	/**
	 * @return the comissão
	 */
	public BigDecimal getComissão() {
		return comissão;
	}

	/**
	 * @param comissão the comissão to set
	 */
	public void setComissão(BigDecimal comissão) {
		this.comissão = comissão;
	}

	/**
	 * @return the estoqueAtual
	 */
	public Short getEstoqueAtual() {
		return estoqueAtual;
	}

	/**
	 * @param estoqueAtual the estoqueAtual to set
	 */
	public void setEstoqueAtual(Short estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
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
	
	

}
