package com.endeavour.model;

import java.util.List;

import com.endeavour.model.Estilo;

public class Artista {

	private String nome;
	private Gravadora gravadora;
	
	private List<Estilo> estilos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Gravadora getGravadora() {
		return gravadora;
	}

	public void setGravadora(Gravadora gravadora) {
		this.gravadora = gravadora;
	}

	public List<Estilo> getEstilos() {
		return estilos;
	}

	public void setEstilos(List<Estilo> estilos) {
		this.estilos = estilos;
	}
	
	
}
