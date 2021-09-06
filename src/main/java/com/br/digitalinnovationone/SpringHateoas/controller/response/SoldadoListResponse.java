package com.br.digitalinnovationone.SpringHateoas.controller.response;

import org.springframework.hateoas.ResourceSupport;

public class SoldadoListResponse extends ResourceSupport {

	private Long id;
	private String nome;
	private String raca;

	/**
	 * @return the id
	 */
	public Long getResourceId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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

}
