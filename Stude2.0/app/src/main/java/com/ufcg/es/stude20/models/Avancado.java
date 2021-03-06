package com.ufcg.es.stude20.models;

import java.io.Serializable;

public class Avancado implements MetodoDeEstudo, Serializable {

	private static final int TEMPO_INTERVALO_AVANCADO = 10;
	private static final int TEMPO_DE_ESTUDO_AVANCADO = 30;

	public Avancado() {

	}

	@Override
	public int getTempoDeEstudo() {
		return TEMPO_DE_ESTUDO_AVANCADO;
	}

	@Override
	public int getIntervalo() {
		return TEMPO_INTERVALO_AVANCADO;
	}

	@Override
	public String toString() {
		return "Metodo de estudo avancado";
	}
}