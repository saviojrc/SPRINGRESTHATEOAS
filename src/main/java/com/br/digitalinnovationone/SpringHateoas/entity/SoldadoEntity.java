package com.br.digitalinnovationone.SpringHateoas.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class SoldadoEntity implements Serializable, Comparable<SoldadoEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long id;
	@NotNull
	@NotBlank(message = "O Campo CPF Não pode ser nulo")
	@Size(min = 11, max = 11)
	private String cpf;
	@NotBlank(message = "O Campo Nome deve ser preenchido")
	@Size(min = 3, max = 250, message = "o Campo nome deve possuir entre 3 e 250 caracteres")
	private String nome;
	@NotBlank(message = "O campo raça deve ser preenchido")
	private String raca;
	@NotBlank(message = "O campo arma deve ser preenchido")
	private String arma;
	@NotBlank(message = "O campo status deve ser preenchido")
	private String status;

	public SoldadoEntity() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		if (!(obj instanceof SoldadoEntity)) {
			return false;
		}
		SoldadoEntity other = (SoldadoEntity) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public int compareTo(SoldadoEntity outroSoldado) {
		if (this.id > outroSoldado.id) {
			return 1;
		} else if (this.id < outroSoldado.id) {
			return -1;
		} else {
			return 0;
		}
	}

}
