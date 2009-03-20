package com.endeavour.model;

import com.endeavour.model.Artista;

public class Album {

	private Long codalbum;
	private Artista artista;
	private String nome;
	private String imagem;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public void setCodalbum(Long codalbum) {
		this.codalbum = codalbum;
	}

	public Long getCodalbum() {
		return codalbum;
	}
}
