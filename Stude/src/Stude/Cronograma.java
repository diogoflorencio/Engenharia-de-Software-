package Stude;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cronograma {
	private List<Disciplina> disciplinas;

	public Cronograma() {
		disciplinas = new ArrayList<Disciplina>();
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public int tamanhoDisciplinas() {
		return disciplinas.size();
	}

	public Disciplina getDisciplina(String nome) {
		Iterator<Disciplina> it = disciplinas.iterator();
		Disciplina d;
		while (it.hasNext()) {
			d = it.next();
			if (d.getNome().equals(nome))
				return d;
		}
		return null;
	}

	public void addDisciplina(Disciplina d) throws Exception {
		if (disciplinas.contains(d))
			throw new Exception("Disciplina existente");
		disciplinas.add(d);
	}

	public boolean removeDisciplina(String nome) throws Exception {
		if (!disciplinas.contains(getDisciplina(nome)))
			throw new Exception("Disciplina inexistente");
		return disciplinas.remove(getDisciplina(nome));
	}

//	public void setDisciplina(Disciplina d) throws Exception {
//		removeDisciplina(d);
//		addDisciplina(d);
//	}
}