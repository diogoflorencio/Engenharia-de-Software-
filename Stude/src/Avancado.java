public class Avancado implements MetodoDeEstudo {

	private int intervalo;

	private int tempoDeEstudo;
 
	public Avancado(){
		intervalo = 10;
		//tempoDeEstudo = 30;
	}
	
	@Override
	public int getTempo() {
		return tempoDeEstudo;
	}
	
	@Override
	public int getIntervalo() {
		return intervalo;
	}
	
	@Override
	public String toString(){
		return "Metodo de estudo avancado";
	}
}