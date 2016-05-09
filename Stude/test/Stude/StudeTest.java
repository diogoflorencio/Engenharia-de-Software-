package Stude;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StudeTest {

	private Stude stude;
	
	@Before
	public void setUp() throws Exception {
		stude = new Stude("Carlos");
	}
	
	@Test
	public void test() throws Exception {
		assertEquals(stude.getUsuario().getNome(), "Carlos");
		stude.setNomeUsuario("Pedro");
		assertEquals(stude.getUsuario().getNome(), "Pedro");
		
		assertEquals(stude.getDisciplinas(), stude.getCronograma().getDisciplinas());
		stude.addDisciplina("SI1", 2);
		assertEquals(stude.getDisciplina("SI1"), stude.getCronograma().getDisciplina("SI1"));

		assertTrue(stude.removeDisciplina("SI1"));
		
		stude.addDisciplina("ES", 5);
		assertTrue(stude.getDisciplina("ES").getHorasEstudadas() == 0);
		stude.addTempoEstudo("ES", 0.2);
		assertTrue(stude.getDisciplina("ES").getHorasEstudadas() == 0.2);
		
		assertEquals(stude.getMetodoDeEstudo().toString(), "Metodo de estudo regular");
		stude.setMetodoAvancado();
		assertEquals(stude.getMetodoDeEstudo().toString(), "Metodo de estudo avancado");
		
		assertTrue(stude.tempoDeEstudo() == Avancado.TEMPO_DE_ESTUDO_AVANCADO);
		assertTrue(stude.intervalo() == Avancado.TEMPO_INTERVALO_AVANCADO);
		
		stude.setMetodoRegular();
		
		assertTrue(stude.tempoDeEstudo() == Regular.TEMPO_DE_ESTUDO_REGULAR);
		assertTrue(stude.intervalo() == Regular.TEMPO_INTERVALO_REGULAR);
		
		assertEquals(stude.desempenho().toString(), "{ES=0.2}");
		stude.addDisciplina("SI", 2);
		stude.addTempoEstudo("SI", 0.5);
		assertEquals(stude.desempenho().toString(), "{SI=0.5, ES=0.2}");
	}

}
