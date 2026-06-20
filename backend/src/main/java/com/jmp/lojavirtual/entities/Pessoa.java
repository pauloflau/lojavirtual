package com.jmp.lojavirtual.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;

@Entity  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  //significa que essa tabela nao existira no banco e sim quem estender dela
public abstract class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private String email;
	private String telefone;
	
	//uma pessoa possui varios enderecos
	@OneToMany(mappedBy="pessoa", //procurara na classe endereco o atributo pessoa
			orphanRemoval = true, //se eu excluir o usuario exclui o endereco
			cascade = CascadeType.ALL,  //se eu salvar o usuario com endereço e so salvar o usuario que salva tudo
			fetch = FetchType.LAZY) //qdo busco pessoa so tras o endereço se eu pedir realmente o endereco
	private List<Endereco> enderecos = new ArrayList<Endereco>();
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(Long id, String nome, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
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
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}	
}
