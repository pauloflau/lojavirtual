package com.jmp.lojavirtual.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import com.jmp.lojavirtual.entities.enums.StatusContaReceber;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "conta_receber")
public class ContaReceber {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String descricao;

	private StatusContaReceber status;

	private LocalDate dtVencimento;

	private LocalDate dtPagamento;

	private BigDecimal valorTotal = BigDecimal.ZERO;

	private BigDecimal valorDesconto = BigDecimal.ZERO;

	@ManyToOne // * conta_receber pode ter 1 pessoa
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;

	public ContaReceber() {
	}

	public ContaReceber(Long id, String descricao, StatusContaReceber status, LocalDate dtVencimento,
			LocalDate dtPagamento, BigDecimal valorTotal, BigDecimal valorDesconto, Pessoa pessoa) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.status = status;
		this.dtVencimento = dtVencimento;
		this.dtPagamento = dtPagamento;
		this.valorTotal = valorTotal;
		this.valorDesconto = valorDesconto;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusContaReceber getStatus() {
		return status;
	}

	public void setStatus(StatusContaReceber status) {
		this.status = status;
	}

	public LocalDate getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(LocalDate dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public LocalDate getDtPagamento() {
		return dtPagamento;
	}

	public void setDtPagamento(LocalDate dtPagamento) {
		this.dtPagamento = dtPagamento;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaReceber other = (ContaReceber) obj;
		return Objects.equals(id, other.id);
	}

}
