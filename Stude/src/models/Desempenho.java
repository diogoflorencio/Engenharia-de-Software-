package models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Desempenho {

	public Desempenho() {
	}

	public float calculaCRE(List<Disciplina> disciplinas) {
		if (disciplinas.size() == 0)
			return 0;
		float cre = 0;
		Iterator<Disciplina> it = disciplinas.iterator();
		Disciplina d;
		while (it.hasNext()) {
			d = it.next();
			if (d.getSituacao().equals(Situacao.CONCLUIDA))
				cre += d.calculaMedia() / disciplinas.size();
		}
		return cre;
	}

	public HashMap<Disciplina, Double> tempoDeEstudo(List<Disciplina> disciplinas) {
		HashMap<Disciplina, Double> desempenho = new HashMap<Disciplina, Double>();
		Iterator<Disciplina> it = disciplinas.iterator();
		Disciplina d;
		while (it.hasNext()) {
			d = it.next();
			desempenho.put(d, d.getHorasEstudadas());
		}
		return desempenho;
	}
}
