import java.util.ArrayList;
import java.util.Iterator;

public class Cronograma {

	private ArrayList<Disciplina> disciplinas;
	
	public Cronograma(){
		disciplinas =  new ArrayList<Disciplina>();
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public Disciplina getDisciplina(String nome){
		Iterator<Disciplina> it = disciplinas.iterator();
		Disciplina d ;
		while(it.hasNext()){
			d = it.next();
			if(d.getNome().equals(nome)) return d;
		}
		return null;
	}
	
	public void addDisciplina(Disciplina d) throws Exception{
		if(disciplinas.contains(d)) throw new Exception("Disciplina existente");
		disciplinas.add(d);
	}
	
	public void removeDisciplina(Disciplina d) throws Exception{
		if(!disciplinas.contains(d)) throw new Exception("Disciplina inexistente");
		disciplinas.add(d);
	}
	public void setDisciplina(Disciplina d) throws Exception{
		removeDisciplina(d);
		addDisciplina(d);
	}
}