package Stude;

public class Regular implements MetodoDeEstudo{
	private static int intervalo = 5;
	private static int tempoDeEstudo = 15;
	
	public Regular(){}
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
