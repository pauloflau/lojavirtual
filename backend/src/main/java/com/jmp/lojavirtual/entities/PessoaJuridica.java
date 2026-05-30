package com.jmp.lojavirtual.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="pessoa_juridica")
@PrimaryKeyJoinColumn(name="pessoa_id")
public class PessoaJuridica extends Pessoa {
	@Column(nullable = false)
	private String cnpj;
	@Column(nullable = false)
	private String inscEstadual;
	private String inscMunicipal;
	@Column(nullable = false)
	private String nomeFantasia;
	@Column(nullable = false)
	private String razaoSocial;
	private String categoria;
	
	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}

	public PessoaJuridica(String cnpj, String inscEstadual, String inscMunicipal, String nomeFantasia,
			String razaoSocial, String categoria) {
		super();
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
		this.inscMunicipal = inscMunicipal;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.categoria = categoria;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getInscMunicipal() {
		return inscMunicipal;
	}

	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
