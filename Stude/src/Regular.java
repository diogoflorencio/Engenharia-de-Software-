import java.io.Serializable;

public class Regular implements MetodoDeEstudo, Serializable {

	private static final long serialVersionUID = 1L;
	private static final int TEMPO_DE_ESTUDO_REGULAR = 15;
	private static final int TEMPO_INTERVALO_REGULAR = 5;
	private int intervalo;
	private int tempoDeEstudo;

	public Regular() {
		intervalo = TEMPO_INTERVALO_REGULAR;
		tempoDeEstudo = TEMPO_DE_ESTUDO_REGULAR;
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
		return "Metodo de estudo regular";
	}
}
