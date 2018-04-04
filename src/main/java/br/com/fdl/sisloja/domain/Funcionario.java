package br.com.fdl.sisloja.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@SuppressWarnings("serial")
@Entity
@PrimaryKeyJoinColumn(name="codigo")
public class Funcionario extends Pessoa{
	
	@Column(length=50)
	private String funcao;
	
	@Column(length=50)
	private String departamento;
	
	@Column(length=50)
	private String setor;
	
	private Date dataCadastro;
	
	@ManyToOne
	private Endereco endereco;
	
	private Double status;
	
	@Column(length=50)
	private String ctps;

	/**
	 * @return the funcao
	 */
	public String getFuncao() {
		return funcao;
	}

	/**
	 * @param funcao the funcao to set
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the setor
	 */
	public String getSetor() {
		return setor;
	}

	/**
	 * @param setor the setor to set
	 */
	public void setSetor(String setor) {
		this.setor = setor;
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
	 * @return the status
	 */
	public Double getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Double status) {
		this.status = status;
	}

	/**
	 * @return the ctps
	 */
	public String getCtps() {
		return ctps;
	}

	/**
	 * @param ctps the ctps to set
	 */
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	
	
	
}
