import java.util.Map;
import java.util.Calendar;
import java.util.Collection;

public class Usuario {

	private Map<Calendar,Calendar> horasEstudadas;

	private String nome;

	private Calendar dataDeIngresso;

	private Stude stude;

	private Disciplina disciplina;

	private Cronograma cronograma;

	private Collection<Disciplina> desempenho;

}
