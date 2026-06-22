package com.jmp.lojavirtual.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cupom_desconto")
public class CupomDesconto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String codigoDescricao;
	private BigDecimal valorRealDesconto;
	private BigDecimal valorPorcentDescricao;
	private LocalDate dataValidadeCupom;
	
	public CupomDesconto() {
		// TODO Auto-generated constructor stub
	}

	public CupomDesconto(Long id, String codigoDescricao, BigDecimal valorRealDesconto,
			BigDecimal valorPorcentDescricao, LocalDate dataValidadeCupom) {
		super();
		this.id = id;
		this.codigoDescricao = codigoDescricao;
		this.valorRealDesconto = valorRealDesconto;
		this.valorPorcentDescricao = valorPorcentDescricao;
		this.dataValidadeCupom = dataValidadeCupom;
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

	public BigDecimal getValorPorcentDescricao() {
		return valorPorcentDescricao;
	}

	public void setValorPorcentDescricao(BigDecimal valorPorcentDescricao) {
		this.valorPorcentDescricao = valorPorcentDescricao;
	}

	public LocalDate getDataValidadeCupom() {
		return dataValidadeCupom;
	}

	public void setDataValidadeCupom(LocalDate dataValidadeCupom) {
		this.dataValidadeCupom = dataValidadeCupom;
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
		CupomDesconto other = (CupomDesconto) obj;
		return Objects.equals(id, other.id);
	}	
}
