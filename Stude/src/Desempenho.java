import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Desempenho implements Serializable{
	private static final long serialVersionUID = 1L;
	public Desempenho(){}
	
	public HashMap<Disciplina, Double> tempoDeEstudo(List<Disciplina> disciplinas){
		HashMap<Disciplina, Double> desempenho = new HashMap<Disciplina, Double>();
		Iterator<Disciplina> it =  disciplinas.iterator();
		Disciplina d;
		while(it.hasNext()){
			d = it.next();
			desempenho.put(d, d.getHorasEstudadas());
		}
		return desempenho;
	}
}
