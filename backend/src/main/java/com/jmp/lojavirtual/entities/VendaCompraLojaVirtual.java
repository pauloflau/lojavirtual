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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "venda_compra_loja")
public class VendaCompraLojaVirtual {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "pessoa_id", nullable = false)
	private Pessoa pessoa;

	@ManyToOne
	@JoinColumn(name = "endereco_entrega_id", nullable = false)
	private Endereco enderecoEntrega;
	
	@ManyToOne
	@JoinColumn(name = "endereco_cobranca_id", nullable = false)
	private Endereco enderecoCobranca;

	@Column(nullable = false)
	private BigDecimal valorTotal = BigDecimal.ZERO;
	
	private BigDecimal valorDesconto = BigDecimal.ZERO;
	
	@ManyToOne
	@JoinColumn(name = "forma_pagamento_id", nullable = false)
	private Endereco formaPagamento;
		
	@OneToOne //1 venda pra 1 notafiscal
	@JoinColumn(name = "nota_fiscal_venda_id", nullable = false)
	private NotaFiscalVenda notaFiscalVenda;
	
	@ManyToOne
	@JoinColumn(name = "cumpom_desconto_id")
	private CumpomDesconto cumpomDesconto;
	
	@Column(nullable = false)
	private BigDecimal valorFrete = BigDecimal.ZERO;
	@Column(nullable = false)
	private Integer diaEntrega;
	@Column(nullable = false)
	private LocalDate dataVenda;
	@Column(nullable = false)
	private LocalDate dataEntrega;
	
	public VendaCompraLojaVirtual() {
		// TODO Auto-generated constructor stub
	}

	public VendaCompraLojaVirtual(Long id, Pessoa pessoa, Endereco enderecoEntrega, Endereco enderecoCobranca,
			BigDecimal valorTotal, BigDecimal valorDesconto, Endereco formaPagamento, NotaFiscalVenda notaFiscalVenda,
			CumpomDesconto cumpomDesconto, BigDecimal valorFrete, Integer diaEntrega, LocalDate dataVenda,
			LocalDate dataEntrega) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.enderecoEntrega = enderecoEntrega;
		this.enderecoCobranca = enderecoCobranca;
		this.valorTotal = valorTotal;
		this.valorDesconto = valorDesconto;
		this.formaPagamento = formaPagamento;
		this.notaFiscalVenda = notaFiscalVenda;
		this.cumpomDesconto = cumpomDesconto;
		this.valorFrete = valorFrete;
		this.diaEntrega = diaEntrega;
		this.dataVenda = dataVenda;
		this.dataEntrega = dataEntrega;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public Endereco getEnderecoCobranca() {
		return enderecoCobranca;
	}

	public void setEnderecoCobranca(Endereco enderecoCobranca) {
		this.enderecoCobranca = enderecoCobranca;
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

	public Endereco getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(Endereco formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public NotaFiscalVenda getNotaFiscalVenda() {
		return notaFiscalVenda;
	}

	public void setNotaFiscalVenda(NotaFiscalVenda notaFiscalVenda) {
		this.notaFiscalVenda = notaFiscalVenda;
	}

	public CumpomDesconto getCumpomDesconto() {
		return cumpomDesconto;
	}

	public void setCumpomDesconto(CumpomDesconto cumpomDesconto) {
		this.cumpomDesconto = cumpomDesconto;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Integer getDiaEntrega() {
		return diaEntrega;
	}

	public void setDiaEntrega(Integer diaEntrega) {
		this.diaEntrega = diaEntrega;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
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
		VendaCompraLojaVirtual other = (VendaCompraLojaVirtual) obj;
		return Objects.equals(id, other.id);
	}

	
}
