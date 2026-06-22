package com.jmp.lojavirtual.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import com.jmp.lojavirtual.enums.StatusContasReceber;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String descricao;

	@Enumerated(EnumType.STRING)
	private StatusContasReceber status;
	private LocalDate dtPagamento;
	private LocalDate dtVencimento;
	private BigDecimal valorTotal;
	private BigDecimal valorDesconto;

	@ManyToOne() // muitos contaReceber p uma pessoa
	@JoinColumn(name = "pessoa_id", // cria uma coluna com o nome pessoa_id que e a pessoa
			nullable = false) // nao salva contaReceber sem pessoa
	private Pessoa pessoa;

	public ContaReceber() {
		// TODO Auto-generated constructor stub
	}

	public ContaReceber(Long id, String descricao, StatusContasReceber status, LocalDate dtPagamento,
			LocalDate dtVencimento, BigDecimal valorTotal, BigDecimal valorDesconto, Pessoa pessoa) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.status = status;
		this.dtPagamento = dtPagamento;
		this.dtVencimento = dtVencimento;
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

	public StatusContasReceber getStatus() {
		return status;
	}

	public void setStatus(StatusContasReceber status) {
		this.status = status;
	}

	public LocalDate getDtPagamento() {
		return dtPagamento;
	}

	public void setDtPagamento(LocalDate dtPagamento) {
		this.dtPagamento = dtPagamento;
	}

	public LocalDate getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(LocalDate dtVencimento) {
		this.dtVencimento = dtVencimento;
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
