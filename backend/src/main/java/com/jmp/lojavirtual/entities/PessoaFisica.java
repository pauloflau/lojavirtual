package com.jmp.lojavirtual.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="pessoa_fisica")
@PrimaryKeyJoinColumn(name="pessoa_id")
public class PessoaFisica extends Pessoa{
	private String cpf;
	
	private LocalDate dataNascimento;
	
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(String cpf, LocalDate dataNascimento) {
		super();
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
