import java.io.Serializable;

public class Disciplina implements Serializable{
	private static final long serialVersionUID = 1L;
	private double horasEstudadas;
	private int cor;
	private String nome;
	
	public Disciplina(String nome, int cor) throws Exception{
		if(!testaString(nome)) throw new Exception("Nome da disciplina invalido");
		this.nome = nome;
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
	
	public int getCor(){
		return cor;
	}
	public void setCor(int cor){
		this.cor = cor; 
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
	@Override
	public String toString(){
		return nome;
	}
}