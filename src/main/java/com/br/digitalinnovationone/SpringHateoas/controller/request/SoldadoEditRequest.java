package com.br.digitalinnovationone.SpringHateoas.controller.request;

import java.io.Serializable;

public class SoldadoEditRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cpf;
	private String nome;
	private String raca;
	private String arma;
	private String status;
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the raca
	 */
	public String getRaca() {
		return raca;
	}
	/**
	 * @param raca the raca to set
	 */
	public void setRaca(String raca) {
		this.raca = raca;
	}
	/**
	 * @return the arma
	 */
	public String getArma() {
		return arma;
	}
	/**
	 * @param arma the arma to set
	 */
	public void setArma(String arma) {
		this.arma = arma;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
