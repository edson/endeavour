package com.endeavour.model;

import java.util.List;

import com.endeavour.model.Clan;
import com.endeavour.model.Perfil;

public class Usuario {

	private String nome;
	private String sobrenome;
	
	private String email;
	private String senha;
	private Integer pontuacao;
	
	private List<Clan> clans;
	private Perfil perfil;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}
	public void setClans(List<Clan> clans) {
		this.clans = clans;
	}
	public List<Clan> getClans() {
		return clans;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	public Perfil getPerfil() {
		return perfil;
	}

	public Usuario(String nome, String nomeDoMeio, String sobrenome,
			String email, String senha, Perfil perfil) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
	}

}
