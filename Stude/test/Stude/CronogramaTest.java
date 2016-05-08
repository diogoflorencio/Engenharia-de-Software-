package Stude;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CronogramaTest {

	private Cronograma cronograma;
	private Disciplina disciplina1, disciplina2;

	@Before
	public void setUp() throws Exception {
		cronograma = new Cronograma();
		disciplina1 = new Disciplina("ES", 1);
		disciplina2 = new Disciplina("SI1", 2);
	}

	@Test
	public void test() throws Exception {
		assertTrue(cronograma.tamanhoDisciplinas() == cronograma.getDisciplinas().size());
		assertTrue(cronograma.tamanhoDisciplinas() == 0);
		cronograma.addDisciplina(disciplina1);
		assertTrue(cronograma.tamanhoDisciplinas() == 1);

		try {
			cronograma.addDisciplina(disciplina1);
		} catch (Exception e) {
			assertEquals("Disciplina existente", e.getMessage());
		}
		assertTrue(cronograma.tamanhoDisciplinas() == 1);

		try {
			cronograma.removeDisciplina(disciplina2.getNome());
		} catch (Exception e) {
			assertEquals("Disciplina inexistente", e.getMessage());
		}
		assertTrue(cronograma.tamanhoDisciplinas() == 1);

		cronograma.addDisciplina(disciplina2);
		assertTrue(cronograma.tamanhoDisciplinas() == 2);

		assertTrue(cronograma.removeDisciplina(disciplina2.getNome()));
		assertTrue(cronograma.tamanhoDisciplinas() == 1);

		assertEquals(cronograma.getDisciplina(disciplina2.getNome()), null);
		assertEquals(cronograma.getDisciplina(disciplina1.getNome()), disciplina1);
	}

}
