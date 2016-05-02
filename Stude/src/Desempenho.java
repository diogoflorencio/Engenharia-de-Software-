import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Desempenho {
	
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
