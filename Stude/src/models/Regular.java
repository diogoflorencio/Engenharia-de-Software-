package models;

public class Regular implements MetodoDeEstudo {

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
