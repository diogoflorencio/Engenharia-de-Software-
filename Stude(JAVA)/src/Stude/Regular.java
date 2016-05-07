package Stude;

public class Regular implements MetodoDeEstudo{
	private int intervalo;
	private int tempoDeEstudo;
	
	public Regular(){
		intervalo = 5;
		tempoDeEstudo = 15;
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
		return "Metodo de estudo regular";
	}
}
