package com.jmp.lojavirtual.entities;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tipoUnidade;
	private String nome;
	private Boolean ativo;

	@Column(columnDefinition = "TEXT")
	private String descricao;

	/* Nota item nota produto - ASSOCIAR */
	private Double peso;
	private Double largura;
	private Double profundidade;
	private BigDecimal valorVenda = BigDecimal.ZERO;
	private Integer quantidadeEstoque = 0;
	private Integer quantidadeAlertaEstoque = 0;
	private String linkYoutube;
	private Boolean alertaQuantidadeEstoque = Boolean.FALSE;
	private Integer quantidadeClique = 0;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Long id, String tipoUnidade, String nome, Boolean ativo, String descricao, Double peso,
			Double largura, Double profundidade, BigDecimal valorVenda, Integer quantidadeEstoque,
			Integer quantidadeAlertaEstoque, String linkYoutube, Boolean alertaQuantidadeEstoque,
			Integer quantidadeClique) {
		super();
		this.id = id;
		this.tipoUnidade = tipoUnidade;
		this.nome = nome;
		this.ativo = ativo;
		this.descricao = descricao;
		this.peso = peso;
		this.largura = largura;
		this.profundidade = profundidade;
		this.valorVenda = valorVenda;
		this.quantidadeEstoque = quantidadeEstoque;
		this.quantidadeAlertaEstoque = quantidadeAlertaEstoque;
		this.linkYoutube = linkYoutube;
		this.alertaQuantidadeEstoque = alertaQuantidadeEstoque;
		this.quantidadeClique = quantidadeClique;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(Double profundidade) {
		this.profundidade = profundidade;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Integer getQuantidadeAlertaEstoque() {
		return quantidadeAlertaEstoque;
	}

	public void setQuantidadeAlertaEstoque(Integer quantidadeAlertaEstoque) {
		this.quantidadeAlertaEstoque = quantidadeAlertaEstoque;
	}

	public String getLinkYoutube() {
		return linkYoutube;
	}

	public void setLinkYoutube(String linkYoutube) {
		this.linkYoutube = linkYoutube;
	}

	public Boolean getAlertaQuantidadeEstoque() {
		return alertaQuantidadeEstoque;
	}

	public void setAlertaQuantidadeEstoque(Boolean alertaQuantidadeEstoque) {
		this.alertaQuantidadeEstoque = alertaQuantidadeEstoque;
	}

	public Integer getQuantidadeClique() {
		return quantidadeClique;
	}

	public void setQuantidadeClique(Integer quantidadeClique) {
		this.quantidadeClique = quantidadeClique;
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
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

}
