package com.jmp.lojavirtual.entities;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements UserDetails{  //implemento a interface p o spring security

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String login;
	private String senha;
	
	//NAO VOU USAR POR SER ANTIDO
	//@Temporal(TemporalType.DATE) 
	//private Date dataAtualSenha;

	private LocalDateTime dataAtualSenha;
	
	@ManyToMany(fetch = FetchType.LAZY)  //so carrega perfil se eu chamar
	@JoinTable(
		    name = "perfil_usuario", //cria a tabela associativa
		    joinColumns = @JoinColumn(name = "usuario_id"), //usa o id do usuario
		    inverseJoinColumns = @JoinColumn(name = "perfil_id")) //usa o id de perfil
	private Set<Perfil> perfis;
	/*
	 * Usando lista
	 * List<Perfil> perfis = new ArrayList<>();
	 * perfis.add(admin);
	 * perfis.add(admin);
	 * System.out.println(perfis);
	 * RESULTADO = [admin, admin]
	 * 
	 * Usando set
	 * Set<Perfil> perfis = new HashSet<>();
	 * perfis.add(admin);
	 * perfis.add(admin);
	 * System.out.println(perfis);
	 * RESULTADO = [admin]	
	*/
		
	public Usuario() {
	}
	
	public Usuario(Long id, String login, String senha, LocalDateTime dataAtualSenha) {
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.dataAtualSenha = dataAtualSenha;
	}
	
	//Autoridades - e o perfil ROLE_ADMIN, ROLE_USER
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.perfis;  //retorno o atributo onde tem os perfis que posso usar
	}

	@Override
	public String getPassword() {
		return this.senha;
	}

	@Override
	public String getUsername() {
		return this.login;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDateTime getDataAtualSenha() {
		return dataAtualSenha;
	}

	public void setDataAtualSenha(LocalDateTime dataAtualSenha) {
		this.dataAtualSenha = dataAtualSenha;
	}

	public Set<Perfil> getPerfis() {
		return perfis;
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
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}
	
}
