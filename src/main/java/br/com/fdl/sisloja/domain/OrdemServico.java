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
public class OrdemServico {
	
	@Id
	@Column(name = "meu_id", columnDefinition = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(nullable=false)
	@ManyToOne
	private Cliente cliente;
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	@ManyToOne
	private Endereco endereco;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private Funcionario funcionario;
	
	@Column(length=15, nullable=false)
	private String tipoAtendimento;
	
	@Temporal(TemporalType.DATE)
	private Date vencimentoGarantia;
	
	@Temporal(TemporalType.DATE)
	private Date dataConserto;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private Equipamento equipamento;
	
	@Column(length=100, nullable=false)
	private String problemaReclamado;
	
	@Column(nullable=false, precision=8, scale=2)
	private BigDecimal valorServico;
	
	@Column(nullable=false)
	private Boolean status;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private Servico servico;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private PagamentoServico pagamentoServico;
	
	@Column(length=15, nullable=false)
	private String posicao;

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
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	/**
	 * @return the tipoAtendimento
	 */
	public String getTipoAtendimento() {
		return tipoAtendimento;
	}

	/**
	 * @param tipoAtendimento the tipoAtendimento to set
	 */
	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
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
	 * @return the dataConserto
	 */
	public Date getDataConserto() {
		return dataConserto;
	}

	/**
	 * @param dataConserto the dataConserto to set
	 */
	public void setDataConserto(Date dataConserto) {
		this.dataConserto = dataConserto;
	}

	/**
	 * @return the equipamento
	 */
	public Equipamento getEquipamento() {
		return equipamento;
	}

	/**
	 * @param equipamento the equipamento to set
	 */
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	/**
	 * @return the problemaReclamado
	 */
	public String getProblemaReclamado() {
		return problemaReclamado;
	}

	/**
	 * @param problemaReclamado the problemaReclamado to set
	 */
	public void setProblemaReclamado(String problemaReclamado) {
		this.problemaReclamado = problemaReclamado;
	}

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
	 * @return the servico
	 */
	public Servico getServico() {
		return servico;
	}

	/**
	 * @param servico the servico to set
	 */
	public void setServico(Servico servico) {
		this.servico = servico;
	}

	/**
	 * @return the pagamentoServico
	 */
	public PagamentoServico getPagamentoServico() {
		return pagamentoServico;
	}

	/**
	 * @param pagamentoServico the pagamentoServico to set
	 */
	public void setPagamentoServico(PagamentoServico pagamentoServico) {
		this.pagamentoServico = pagamentoServico;
	}

	/**
	 * @return the posicao
	 */
	public String getPosicao() {
		return posicao;
	}

	/**
	 * @param posicao the posicao to set
	 */
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	
	
}
