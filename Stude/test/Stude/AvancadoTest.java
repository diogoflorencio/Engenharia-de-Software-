package Stude;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AvancadoTest {

	private MetodoDeEstudo a;

	@Before
	public void setUp() {
		a = new Avancado();
	}

	@Test
	public void test() {
		assertEquals(a.getIntervalo(), Avancado.TEMPO_INTERVALO_AVANCADO);
		assertEquals(a.getTempo(), Avancado.TEMPO_DE_ESTUDO_AVANCADO);
		assertEquals(a.toString(), "Metodo de estudo avancado");
	}

}
