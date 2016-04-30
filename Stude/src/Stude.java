import java.util.ArrayList;
import java.util.HashMap;

public class Stude {

	private Usuario usuario;
	private Cronograma cronograma;
	private MetodoDeEstudo metodoDeEstudo;
	
	public Stude(String nomeUsuario) throws Exception{
		usuario = new Usuario(nomeUsuario);
		cronograma = new Cronograma();
		metodoDeEstudo = new Regular();
	}
	
	/* METODOS DO CONTEXTO USUARIO*/
	public String getusuario(){
		return usuario.getNome();
	}
	public void setNomeUsuario(String nome)throws Exception{
		usuario.setNome(nome);
	}
	public String dataDeIngresso(){
		return usuario.getDataDeIngresso();
	}
	/* METODOS DO CONTEXTO DISCIPLINA*/
	public ArrayList<Disciplina> getDisciplinas(){
		return cronograma.getDisciplinas();
	}
	public Disciplina getDisciplina(String nome){
		return cronograma.getDisciplina(nome);
	}
	public void addDisciplina(String nome, String cor) throws Exception{
		cronograma.addDisciplina(new Disciplina(nome, cor));
	}
	public void removeDisciplina(String nome) throws Exception{
		cronograma.removeDisciplina(new Disciplina(nome, null));
	}
	public void addNota(String nomeDisciplina, Double nota) throws Exception{
		Disciplina d = cronograma.getDisciplina(nomeDisciplina);
		d.addNota(nota);
		cronograma.setDisciplina(d);
	}
	public void removeNota(String nomeDisciplina, int indiceDaNota) throws Exception{
		Disciplina d = cronograma.getDisciplina(nomeDisciplina);
		d.removeNota(indiceDaNota);
		cronograma.setDisciplina(d);
	}
	
	/*METODOS DO CONTEXTO DE DESEMPENHO*/
	public HashMap<Disciplina, Double> desempenho(){
		Desempenho d = new Desempenho();
		return d.tempoDeEstudo(cronograma.getDisciplinas());
	}
	public float cre(){
		Desempenho d = new Desempenho();
		return d.calculaCRE(cronograma.getDisciplinas());
	}
	public void addTempoEstudo(String nomeDisciplina, int tempo) throws Exception{
		Disciplina d = cronograma.getDisciplina(nomeDisciplina);
		d.addHorasDeEstudo(tempo);
		cronograma.setDisciplina(d);
	}
	/*METODOS DO CONTEXTO DE METODOS DE ESTUDOS*/
	public int tempoDeEstudo(){
		return metodoDeEstudo.getTempo();
	}
	public int intervalo(){
		return metodoDeEstudo.getTempo();
	}
	public void setMetodoRegular(){
		metodoDeEstudo = new Regular();
	}
	public void setMetodoAvancado(){
		metodoDeEstudo = new Avancado();
	}
	public String getMetodoDeEstudo(){
		return metodoDeEstudo.toString();
	}
}

