package Stude;

public class Usuario {
	private String nome;

	public Usuario(String nome) throws Exception {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if (!isStringValida(nome))
			throw new Exception("Nome da disciplina invalido");
		this.nome = nome;
	}

	private boolean isStringValida(String string) {
		return (string != null && !string.trim().equals(""));
	}
}
