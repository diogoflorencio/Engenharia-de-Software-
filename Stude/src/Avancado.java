public class Avancado implements MetodoDeEstudo {

	private int intervalo;

	private int tempoDeEstudo;
 
	public Avancado(){
		intervalo = 10;
		tempoDeEstudo = 30;
	}
	
	public int getTempo() {
		return tempoDeEstudo;
	}

	public int getIntervalo() {
		return intervalo;
	}
}