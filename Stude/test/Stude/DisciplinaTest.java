package Stude;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DisciplinaTest {

	private Disciplina disciplina1, disciplina2, disciplina3;

	@Before
	public void setUp() throws Exception {
		disciplina1 = new Disciplina("Calculo 1", 1);
		disciplina2 = new Disciplina("Programacao 2", 7);
		disciplina3 = new Disciplina("Fisica Moderna", 9);
	}

	@Test
	public void test1() throws Exception {
		try {
			new Disciplina(null, 5);
		} catch (Exception e) {
			assertEquals("Nome da disciplina invalido", e.getMessage());
		}

		try {
			new Disciplina("", 1);
		} catch (Exception e) {
			assertEquals("Nome da disciplina invalido", e.getMessage());
		}

		Disciplina ES = new Disciplina("Engenharia de Software", 2);
		assertEquals(ES.getNome(), "Engenharia de Software");
		assertEquals(ES.getCor(), 2);
		assertTrue(ES.getHorasEstudadas() == 0);
		assertEquals(ES.toString(), ES.getNome());
	}

	@Test
	public void test2() throws Exception {
		try {
			disciplina1.setNome(null);
		} catch (Exception e) {
			assertEquals("Nome da disciplina invalido", e.getMessage());
		}
		assertNotEquals(disciplina1.getNome(), null);
		assertEquals(disciplina1.getNome(), "Calculo 1");

		try {
			disciplina2.setNome("");
		} catch (Exception e) {
			assertEquals("Nome da disciplina invalido", e.getMessage());
		}
		assertNotEquals(disciplina2.getNome(), "");
		assertEquals(disciplina2.getNome(), "Programacao 2");

		disciplina1.setNome("Engenharia de Software");
		assertEquals(disciplina1.getNome(), "Engenharia de Software");
	}

	@Test
	public void test3() {
		assertEquals(disciplina1.getCor(), 1);
		disciplina1.setCor(5);
		assertEquals(disciplina1.getCor(), 5);

		assertEquals(disciplina3.getCor(), 9);
		disciplina3.setCor(88);
		assertEquals(disciplina3.getCor(), 88);
	}

	@Test
	public void test4() throws Exception {
		assertTrue(disciplina1.getHorasEstudadas() == 0);
		try {
			disciplina1.addHorasDeEstudo(0);
		} catch (Exception e) {
			assertEquals("Tempo de estudo invalido", e.getMessage());
		}

		try {
			disciplina1.addHorasDeEstudo(-0.5);
		} catch (Exception e) {
			assertEquals("Tempo de estudo invalido", e.getMessage());
		}
		assertTrue(disciplina1.getHorasEstudadas() == 0);

		disciplina1.addHorasDeEstudo(0.25);
		assertTrue(disciplina1.getHorasEstudadas() == 0.25);

		disciplina1.addHorasDeEstudo(0.2);
		assertTrue(disciplina1.getHorasEstudadas() == 0.45);
	}

	@Test
	public void test5() throws Exception {
		Disciplina d1 = new Disciplina("ES", 1);
		Disciplina d2 = new Disciplina("LES", 5);
		assertFalse(d1.equals(d2));

		Usuario user = new Usuario("Joao");
		assertFalse(d1.equals(user));

		d2.setNome(d1.getNome());
		assertFalse(d1.equals(d2));
		
		Disciplina d3 = d1;
		
		assertTrue(d3.equals(d1));
	}

}
