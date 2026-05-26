package com.jmp.lojavirtual.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "nota_fiscal_venda")
public class NotaFiscalVenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String numero;
	private String serie;
	private String tipo;
	
	@Column(columnDefinition = "TEXT")
	private String xml;

	@Column(columnDefinition = "TEXT")
	private String pdf;
	
	@OneToOne //1 venda pra 1 notafiscal
	@JoinColumn(name = "venda_compra_loja_virtual_id")
	private VendaCompraLojaVirtual vendaCompraLojaVirtual;
	
	public NotaFiscalVenda() {
		// TODO Auto-generated constructor stub
	}

	public NotaFiscalVenda(Long id, String numero, String serie, String tipo, String xml, String pdf) {
		super();
		this.id = id;
		this.numero = numero;
		this.serie = serie;
		this.tipo = tipo;
		this.xml = xml;
		this.pdf = pdf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getXml() {
		return xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
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
		NotaFiscalVenda other = (NotaFiscalVenda) obj;
		return Objects.equals(id, other.id);
	}
	
}
