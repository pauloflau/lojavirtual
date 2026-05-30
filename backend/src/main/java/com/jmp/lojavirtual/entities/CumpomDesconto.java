package com.jmp.lojavirtual.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cumpom_desconto")
public class CumpomDesconto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String codigoDescricao;
	private BigDecimal valorRealDesconto;
	private BigDecimal valorPorcentagemDesconto;
	
	@Column(nullable = false)
	private LocalDate dataValidadeCumpom;

	public CumpomDesconto() {
		// TODO Auto-generated constructor stub
	}

	public CumpomDesconto(Long id, String codigoDescricao, BigDecimal valorRealDesconto,
			BigDecimal valorPorcentagemDesconto, LocalDate dataValidadeCumpom) {
		super();
		this.id = id;
		this.codigoDescricao = codigoDescricao;
		this.valorRealDesconto = valorRealDesconto;
		this.valorPorcentagemDesconto = valorPorcentagemDesconto;
		this.dataValidadeCumpom = dataValidadeCumpom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoDescricao() {
		return codigoDescricao;
	}

	public void setCodigoDescricao(String codigoDescricao) {
		this.codigoDescricao = codigoDescricao;
	}

	public BigDecimal getValorRealDesconto() {
		return valorRealDesconto;
	}

	public void setValorRealDesconto(BigDecimal valorRealDesconto) {
		this.valorRealDesconto = valorRealDesconto;
	}

	public BigDecimal getValorPorcentagemDesconto() {
		return valorPorcentagemDesconto;
	}

	public void setValorPorcentagemDesconto(BigDecimal valorPorcentagemDesconto) {
		this.valorPorcentagemDesconto = valorPorcentagemDesconto;
	}

	public LocalDate getDataValidadeCumpom() {
		return dataValidadeCumpom;
	}

	public void setDataValidadeCumpom(LocalDate dataValidadeCumpom) {
		this.dataValidadeCumpom = dataValidadeCumpom;
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
		CumpomDesconto other = (CumpomDesconto) obj;
		return Objects.equals(id, other.id);
	}

}
