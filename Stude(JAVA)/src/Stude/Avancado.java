
package Stude;

public class Avancado implements MetodoDeEstudo {
	public static final int TEMPO_INTERVALO_AVANCADO = 10;
	public static final int TEMPO_DE_ESTUDO_AVANCADO = 30;

	public Avancado() {

	}

	@Override
	public int getTempo() {
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