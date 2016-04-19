import java.util.ArrayList;
import java.util.List;

public class Disciplina extends Exception{

	private List<Integer> notas;
	private Situacao situacao;
	private String cor;
	private double media;
	private Cronograma cronograma;
	private Desempenho desempenho;

	public Disciplina(){
		notas = new ArrayList<Integer>();
		cronograma = new Cronograma();
		desempenho = new Desempenho();
		situacao = Situacao.EM_CURSO;
		media = 0.0;
		cor = "";
	}

	public String getCor(){
		return cor;
	}

	public Situacao getSituacao(){
		return situacao;
	}

	public Cronograma getCronograma(){
		return cronograma;
	}

	public double getMedia(){
		return media;
	}

	public Desempenho getDesempenho(){
		return desempenho;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public void setSituacao(Situacao situacao){
		this.situacao = situacao;
	}

	public void addNota(Integer nota)throws Exception {
		if (nota != null) {
			notas.add(nota);
		} else {
			throw new Exception("Insira uma nota válida");
		}
	}

	public void removerNota(int indice)throws Exception{
		if(indice > notas.size()-1){
			throw new Exception("Você não possui essa nota.");
		}else{
			notas.remove(indice);
		}
	}

	public double calculaMedia() {
		for (Integer inteiro : notas) {
			media += inteiro;
		}

		media /= notas.size();
		return media;
	}

}
