import java.io.Serializable;

public class Regular implements MetodoDeEstudo, Serializable {
	private static final long serialVersionUID = 1L;
	private int intervalo;
	private int tempoDeEstudo;
	
	public Regular(){
		intervalo = 5;
		tempoDeEstudo = 15;
	}
	
	
	@Override
	public int getTempo() {
		// TODO Auto-generated method stub
		return tempoDeEstudo;
	}

	@Override
	public int getIntervalo() {
		// TODO Auto-generated method stub
		return intervalo;
	}
	
	@Override
	public String toString(){
		return "Metodo de estudo regular";
	}
}
