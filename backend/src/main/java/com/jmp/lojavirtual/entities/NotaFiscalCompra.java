package com.jmp.lojavirtual.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "nota_fiscal_compra")
public class NotaFiscalCompra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String numeroNota;
	
	@Column(nullable = false)
	private String serieNota;
	private String descricaoObs;
	
	@Column(nullable = false)
	private BigDecimal valorTotal;
	private BigDecimal valorDesconto;
	
	@Column(nullable = false)
	private BigDecimal valorIcms;
	
	@Column(nullable = false)
	private LocalDate dataCompra;
	
	@ManyToOne // * notafiscal pode ter 1 pessoa
	@JoinColumn(name = "pessoa_id", nullable = false)
	private Pessoa pessoa;
	
	@ManyToOne // * notafiscal pode ter 1 pessoa
	@JoinColumn(name = "conta_pagar_id", nullable = false)
	private ContaPagar contaPagar;
	
	public NotaFiscalCompra() {
	}

	public NotaFiscalCompra(Long id, String numeroNota, String serieNota, String descricaoObs, BigDecimal valorTotal,
			BigDecimal valorDesconto, BigDecimal valorIcms, LocalDate dataCompra, Pessoa pessoa,
			ContaPagar contaPagar) {
		super();
		this.id = id;
		this.numeroNota = numeroNota;
		this.serieNota = serieNota;
		this.descricaoObs = descricaoObs;
		this.valorTotal = valorTotal;
		this.valorDesconto = valorDesconto;
		this.valorIcms = valorIcms;
		this.dataCompra = dataCompra;
		this.pessoa = pessoa;
		this.contaPagar = contaPagar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(String numeroNota) {
		this.numeroNota = numeroNota;
	}

	public String getSerieNota() {
		return serieNota;
	}

	public void setSerieNota(String serieNota) {
		this.serieNota = serieNota;
	}

	public String getDescricaoObs() {
		return descricaoObs;
	}

	public void setDescricaoObs(String descricaoObs) {
		this.descricaoObs = descricaoObs;
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

	public BigDecimal getValorIcms() {
		return valorIcms;
	}

	public void setValorIcms(BigDecimal valorIcms) {
		this.valorIcms = valorIcms;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public ContaPagar getContaPagar() {
		return contaPagar;
	}

	public void setContaPagar(ContaPagar contaPagar) {
		this.contaPagar = contaPagar;
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
		NotaFiscalCompra other = (NotaFiscalCompra) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
