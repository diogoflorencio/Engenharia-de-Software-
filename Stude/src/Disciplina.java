import java.util.ArrayList;
import java.util.List;

public class Disciplina extends Exception{
	
	private double horasEstudadas;
	private List<Double> notas;
	private Situacao situacao;
	private String cor;
	private String nome;
	
	public Disciplina(String nome, String cor) throws Exception{
		if(!testaString(nome)) throw new Exception("Nome da disciplina invalido");
		this.nome = nome;
		notas = new ArrayList<Double>();
		situacao = Situacao.EM_CURSO;
		this.cor = cor;
		horasEstudadas = 0;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String novoNome) throws Exception{
		if(!testaString(novoNome)) throw new Exception("Nome da disciplina invalido");
		this.nome = novoNome;
	}
	/* criar enum para cor ???*/
	public String getCor(){
		return cor;
	}
	public void setCor(String cor){
		this.cor = cor; 
	}

	public Situacao getSituacao(){
		return situacao;
	}
	public void setSituacao(Situacao situacao){
		this.situacao = situacao;
	}

	public void addNota(double nota)throws Exception {
		if (nota < 0) throw new Exception("Nota invalida");
			notas.add(nota);
	}
	public void removeNota(int indice)throws Exception{
		if(indice > notas.size()-1)throw new Exception("Voce nao possui essa nota.");
		notas.remove(indice);
	}

	public double calculaMedia() {
		if(notas.size() == 0) return 0;
		float media = 0;
		for (double nota : notas) media += nota;
		return media /= notas.size();
	}
	
	public double getHorasEstudadas(){
		return horasEstudadas;
	}
	public void addHorasDeEstudo(double horas) throws Exception{
		if(horas < 0) throw new Exception("Tempo de estudo invalido");
		horasEstudadas += horas;
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Disciplina))return false;
		Disciplina dsc = (Disciplina) obj;
		return nome.toUpperCase().equals(dsc.getNome().toUpperCase());
	}
	
	public boolean testaString(String string) {
		return !(string == null || string.trim().equals(""));
	}
}