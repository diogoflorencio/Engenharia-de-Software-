import java.util.List;

public class Execucao {

	public static void main(String[] args) {
		List<Disciplina> d;
		try{
		Stude s = new Stude("Diogo");
		System.out.println(s.getusuario());
		s.addDisciplina("ES", "Vermelho");
		s.addDisciplina("SI2", "Preto");
		s.addTempoEstudo("ES", 150);
		s.addTempoEstudo("ES", 150);
		s.removeDisciplina("ES");
		d = s.getDisciplinas();
		System.out.println(d.get(0).getNome());
		System.out.println(s.desempenho());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
