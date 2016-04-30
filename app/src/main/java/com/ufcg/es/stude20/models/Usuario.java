package com.ufcg.es.stude20.models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario implements Serializable {

	private String nome;
	private String dataDeIngresso;

	public Usuario(String nome) throws Exception {
		if (!isStringValida(nome))
			throw new Exception("Nome da disciplina invalido");
		this.nome = nome;
		insereData();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if (!isStringValida(nome))
			throw new Exception("Nome da disciplina invalido");
		this.nome = nome;
	}

	public String getDataDeIngresso() {
		return dataDeIngresso;
	}

	public boolean isStringValida(String string) {
		return (string != null && !string.trim().equals(""));
	}

	private void insereData() {
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		dataDeIngresso = dt.format(new Date());
	}

	@Override
	public String toString() {
		final String QUEBRA_DE_LINHA = System.lineSeparator();
		return "Usuario: " + getNome() + QUEBRA_DE_LINHA + "Data de ingresso: " + getDataDeIngresso();
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Usuario)) {
			return false;
		}
		Usuario usuario = (Usuario) obj;
		return (getNome().equals(usuario.getNome()) && getDataDeIngresso().equals(usuario.getDataDeIngresso()));
	}*/
}
