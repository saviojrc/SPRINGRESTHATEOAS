package com.br.digitalinnovationone.SpringHateoas.controller.response;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SoldadoResponse implements Serializable, Comparable<SoldadoResponse> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String cpf;
	private String nome;
	private String raca;
	private String arma;

	/**
	 * @return the id
	 */

	@JsonProperty("id")
	public Long getResourceId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SoldadoResponse)) {
			return false;
		}
		SoldadoResponse other = (SoldadoResponse) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public int compareTo(SoldadoResponse outroSoldado) {
		if (this.id > outroSoldado.id) {
			return 1;
		} else if (this.id < outroSoldado.id) {
			return -1;
		} else {
			return 0;
		}
	}

}
