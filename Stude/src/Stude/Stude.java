package Stude;

import java.util.HashMap;
import java.util.List;

public class Stude {
	private Usuario usuario;
	private Cronograma cronograma;
	private MetodoDeEstudo metodoDeEstudo;

	public Stude(String nomeUsuario) throws Exception {
		usuario = new Usuario(nomeUsuario);
		cronograma = new Cronograma();
		metodoDeEstudo = new Regular();
	}

	public Cronograma getCronograma() {
		return cronograma;
	}

	/* METODOS DO CONTEXTO USUARIO */
	public Usuario getUsuario() {
		return usuario;
	}

	public void setNomeUsuario(String nome) throws Exception {
		usuario.setNome(nome);
	}

	/* METODOS DO CONTEXTO DISCIPLINA */
	public List<Disciplina> getDisciplinas() {
		return cronograma.getDisciplinas();
	}

	public Disciplina getDisciplina(String nome) {
		return cronograma.getDisciplina(nome);
	}

	public void addDisciplina(String nome, int cor) throws Exception {
		cronograma.addDisciplina(new Disciplina(nome, cor));
	}

	public boolean removeDisciplina(String nome) throws Exception {
		return cronograma.removeDisciplina(nome);
	}

	/* METODOS DO CONTEXTO DE DESEMPENHO */
	public HashMap<Disciplina, Double> desempenho() {
		return Desempenho.tempoDeEstudo(cronograma.getDisciplinas());
	}

	public void addTempoEstudo(String nomeDisciplina, double tempo) throws Exception {
		cronograma.getDisciplina(nomeDisciplina).addHorasDeEstudo(tempo);
	}

	/* METODOS DO CONTEXTO DE METODOS DE ESTUDOS */
	public MetodoDeEstudo getMetodoDeEstudo() {
		return metodoDeEstudo;
	}

	public int tempoDeEstudo() {
		return metodoDeEstudo.getTempo();
	}

	public int intervalo() {
		return metodoDeEstudo.getIntervalo();
	}

	public void setMetodoRegular() {
		metodoDeEstudo = new Regular();
	}

	public void setMetodoAvancado() {
		metodoDeEstudo = new Avancado();
	}
}