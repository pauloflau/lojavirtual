package com.jmp.lojavirtual.entities;

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
@Table(name = "nota_item_produto")
public class NotaItemProduto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Double quantidade;

	@ManyToOne // * notaItemProduto pode ter 1 notaFiscalCompra
	@JoinColumn(name = "nota_fiscal_compra_id")
	private NotaFiscalCompra notaFiscalCompra;

	@ManyToOne // * notaItemProduto pode ter 1 produto
	@JoinColumn(name = "produto_id")
	private Produto produto;

	public NotaItemProduto() {
		// TODO Auto-generated constructor stub
	}

	public NotaItemProduto(Long id, Double quantidade, NotaFiscalCompra notaFiscalCompra, Produto produto) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.notaFiscalCompra = notaFiscalCompra;
		this.produto = produto;
	}

	public Long getId() {
		return id;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public NotaFiscalCompra getNotaFiscalCompra() {
		return notaFiscalCompra;
	}

	public void setNotaFiscalCompra(NotaFiscalCompra notaFiscalCompra) {
		this.notaFiscalCompra = notaFiscalCompra;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setId(Long id) {
		this.id = id;
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
		NotaItemProduto other = (NotaItemProduto) obj;
		return Objects.equals(id, other.id);
	}

}
