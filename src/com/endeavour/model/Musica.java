package com.endeavour.model;

import java.util.Date;

public class Musica {

	private Integer codmusica;
	private int codartista;
	private int codidioma;
	private int codalbum;
	private int codusuario;
	private String titulo;
	private String txtletra;
	private Date ultimaAtualizacao;

	public Musica() {
	}

	public Musica(int codidioma, int codalbum, int codusuario, String titulo,
			String txtletra, Date ultimaAtualizacao) {
		this.codidioma = codidioma;
		this.codalbum = codalbum;
		this.codusuario = codusuario;
		this.titulo = titulo;
		this.txtletra = txtletra;
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	public Integer getCodmusica() {
		return this.codmusica;
	}

	public void setCodmusica(Integer codmusica) {
		this.codmusica = codmusica;
	}

	public int getCodidioma() {
		return this.codidioma;
	}

	public void setCodidioma(int codidioma) {
		this.codidioma = codidioma;
	}

	public int getCodalbum() {
		return this.codalbum;
	}

	public void setCodalbum(int codalbum) {
		this.codalbum = codalbum;
	}

	public int getCodusuario() {
		return this.codusuario;
	}

	public void setCodusuario(int codusuario) {
		this.codusuario = codusuario;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTxtletra() {
		return this.txtletra;
	}

	public void setTxtletra(String txtletra) {
		this.txtletra = txtletra;
	}

	public Date getUltimaAtualizacao() {
		return this.ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(Date ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	public void setCodartista(int codartista) {
		this.codartista = codartista;
	}

	public int getCodartista() {
		return codartista;
	}

}