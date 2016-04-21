import java.util.Calendar;

public class Usuario {

	private String nome;

	private Calendar dataDeIngresso;
	
	public Usuario(String nome) throws Exception{
		if(!testaString(nome)) throw new Exception("Nome da disciplina invalido");
	};

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		if(!testaString(nome)) throw new Exception("Nome da disciplina invalido");
		this.nome = nome;
	}

	public Calendar getDataDeIngresso() {
		return dataDeIngresso;
	}

	public boolean testaString(String string) {
		return !(string == null || string.trim().equals(""));
	}
}
