import java.io.Serializable;

public class Avancado implements MetodoDeEstudo, Serializable {
	private static final long serialVersionUID = 1L;
	private static final int TEMPO_DE_ESTUDO_AVANCADO = 30;
	private static final int TEMPO_INTERVALO_AVANCADO = 10;
	private int intervalo;
	private int tempoDeEstudo;

	public Avancado() {
		intervalo = TEMPO_INTERVALO_AVANCADO;
		tempoDeEstudo = TEMPO_DE_ESTUDO_AVANCADO;
	}

	@Override
	public int getTempoDeEstudo() {
		return tempoDeEstudo;
	}

	@Override
	public int getIntervalo() {
		return intervalo;
	}

	@Override
	public String toString() {
		return "Metodo de estudo avancado";
	}
}