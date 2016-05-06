package Stude;
import java.util.ArrayList;
import java.util.HashMap;

import projetop2.utils.ArquivoDeDados;
import projetop2.utils.ProjetoHelperExceptions;
public class Stude{
	private Usuario usuario;
	private Cronograma cronograma;
	private MetodoDeEstudo metodoDeEstudo;
	private ArquivoDeDados<Cronograma> fileCronograma;
	private ArquivoDeDados<Usuario> fileUsuario;
	private ArquivoDeDados<MetodoDeEstudo> fileMetodo;
	
	public Stude(String nomeUsuario) throws Exception{
		fileUsuario = new ArquivoDeDados<Usuario>("usuario.stude");
		fileCronograma = new ArquivoDeDados<Cronograma>("cronograma.stude");
		fileMetodo = new ArquivoDeDados<MetodoDeEstudo>("metodo.stude");
		try{
			carrega();
		}catch(Exception e){
			usuario = new Usuario(nomeUsuario);
			cronograma = new Cronograma();
			metodoDeEstudo = new Regular();
		}
	}
	private void carrega() throws ProjetoHelperExceptions{
		usuario = fileUsuario.carregaObjetos();
		cronograma = fileCronograma.carregaObjetos();
		metodoDeEstudo = fileMetodo.carregaObjetos();
	}
	public void salvar() throws ProjetoHelperExceptions{
		fileUsuario.salvaObjeto(usuario);
		fileCronograma.salvaObjeto(cronograma);
		fileMetodo.salvaObjeto(metodoDeEstudo);
	}
	
	public void  delete() {
		fileUsuario.limpaArquivo();
		fileCronograma.limpaArquivo();
		fileMetodo.limpaArquivo();
	}
	
	/* METODOS DO CONTEXTO USUARIO*/
	public Usuario getusuario(){
		return usuario;
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
	public void addDisciplina(String nome, int cor) throws Exception{
		cronograma.addDisciplina(new Disciplina(nome, cor));
	}
	public void removeDisciplina(String nome) throws Exception{
		cronograma.removeDisciplina(new Disciplina(nome, 0));
	}
	
	/*METODOS DO CONTEXTO DE DESEMPENHO*/
	public HashMap<Disciplina, Double> desempenho(){
		Desempenho d = new Desempenho();
		return d.tempoDeEstudo(cronograma.getDisciplinas());
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
}