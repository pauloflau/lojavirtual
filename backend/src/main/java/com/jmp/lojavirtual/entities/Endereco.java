package com.jmp.lojavirtual.entities;

import java.util.Objects;

import com.jmp.lojavirtual.enums.TipoEndereco;

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
@Table(name="endereco")
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String rua;
	private String cep;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	
	@ManyToOne() //muitos enderecos p uma pessoa
	@JoinColumn(name="pessoa_id",  //cria uma coluna com o nome pessoa_id que e a pessoa 
		nullable = false) //nao salva endereco sem pessoa 
	private Pessoa pessoa;
	
	@Enumerated(EnumType.STRING)
	private TipoEndereco tipoEndereco;
		
	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(Long id, String rua, String cep, String numero, String complemento, String bairro, String cidade,
			String estado, Pessoa pessoa) {
		super();
		this.id = id;
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
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
		Endereco other = (Endereco) obj;
		return Objects.equals(id, other.id);
	}	
}
