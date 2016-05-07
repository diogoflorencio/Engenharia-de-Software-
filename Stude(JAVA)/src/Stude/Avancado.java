
package Stude;
public class Avancado implements MetodoDeEstudo{
	private static int intervalo = 10;
	private static int tempoDeEstudo = 30;
	
	public Avancado(){}
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