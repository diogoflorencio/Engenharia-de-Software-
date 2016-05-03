import java.util.ArrayList;
import java.util.HashMap;
import projetop2.utils.ArquivoDeDados;

public class Stude {

	private Usuario usuario;
	private Cronograma cronograma;
	private MetodoDeEstudo metodoDeEstudo;
	private ArquivoDeDados<String> a;

	public Stude(String nomeUsuario) throws Exception {
		a = new ArquivoDeDados<String>("arquivo");
		a.salvaObjeto("a");
		usuario = new Usuario(nomeUsuario);
		cronograma = new Cronograma();
		metodoDeEstudo = new Regular();
	}

	/* METODOS DO CONTEXTO USUARIO */
	public String getusuario() {
		return usuario.getNome();
	}

	public void setNomeUsuario(String nome) throws Exception {
		usuario.setNome(nome);
	}

	public String dataDeIngresso() {
		return usuario.getDataDeIngresso();
	}

	/* METODOS DO CONTEXTO DISCIPLINA */
	public ArrayList<Disciplina> getDisciplinas() {
		return cronograma.getDisciplinas();
	}

	public Disciplina getDisciplina(String nome) {
		return cronograma.getDisciplina(nome);
	}

	public void addDisciplina(String nome, int cor) throws Exception {
		cronograma.addDisciplina(new Disciplina(nome, cor));
	}

	public void removeDisciplina(String nome) throws Exception {
		cronograma.removeDisciplina(new Disciplina(nome, 0));
	}

	/* METODOS DO CONTEXTO DE DESEMPENHO */
	public HashMap<Disciplina, Double> desempenho() {
		Desempenho d = new Desempenho();
		return d.tempoDeEstudo(cronograma.getDisciplinas());
	}

	public void addTempoEstudo(String nomeDisciplina, int tempo) throws Exception {
		Disciplina d = cronograma.getDisciplina(nomeDisciplina);
		d.addHorasDeEstudo(tempo);
		cronograma.setDisciplina(d);
	}

	/* METODOS DO CONTEXTO DE METODOS DE ESTUDOS */
	public int tempoDeEstudo() {
		return metodoDeEstudo.getTempoDeEstudo();
	}

	public int intervalo() {
		return metodoDeEstudo.getTempoDeEstudo();
	}

	public void setMetodoRegular() {
		metodoDeEstudo = new Regular();
	}

	public void setMetodoAvancado() {
		metodoDeEstudo = new Avancado();
	}

	public String getMetodoDeEstudo() {
		return metodoDeEstudo.toString();
	}
}
