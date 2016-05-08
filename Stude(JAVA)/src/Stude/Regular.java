package Stude;

public class Regular implements MetodoDeEstudo {
	public static final int TEMPO_INTERVALO_REGULAR = 5;
	public static final int TEMPO_DE_ESTUDO_REGULAR = 15;

	public Regular() {

	}

	@Override
	public int getTempo() {
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
