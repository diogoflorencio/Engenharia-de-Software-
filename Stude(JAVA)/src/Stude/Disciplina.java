package Stude;

public class Disciplina {
	private double horasEstudadas;
	private int cor;
	private String nome;

	public Disciplina(String nome, int cor) throws Exception {
		if (!isStringValida(nome))
			throw new Exception("Nome da disciplina invalido");
		this.nome = nome;
		this.cor = cor;
		horasEstudadas = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) throws Exception {
		if (!isStringValida(novoNome))
			throw new Exception("Nome da disciplina invalido");
		this.nome = novoNome;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public double getHorasEstudadas() {
		return horasEstudadas;
	}

	public void addHorasDeEstudo(double horas) throws Exception {
		if (horas <= 0)
			throw new Exception("Tempo de estudo invalido");
		horasEstudadas += horas;
	}

	private boolean isStringValida(String string) {
		return (string != null && !string.trim().equals(""));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cor;
		long temp;
		temp = Double.doubleToLongBits(horasEstudadas);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Disciplina))
			return false;
		Disciplina dsc = (Disciplina) obj;
		return nome.equals(dsc.getNome()) && hashCode() == dsc.hashCode();
	}

	@Override
	public String toString() {
		return nome;
	}
}