package com.ufcg.es.stude20.models;

import java.io.Serializable;

public class Regular implements MetodoDeEstudo, Serializable {

	private static final int TEMPO_INTERVALO_REGULAR = 5;
	private static final int TEMPO_DE_ESTUDO_REGULAR = 15;

	public Regular() {

	}

	@Override
	public int getTempoDeEstudo() {
		return TEMPO_DE_ESTUDO_REGULAR;
	}

	@Override
	public int getIntervalo() {
		return TEMPO_INTERVALO_REGULAR;
	}

	@Override
	public String toString() {
		return "Metodo de estudo regular";
	}
}
