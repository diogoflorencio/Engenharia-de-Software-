package Stude;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RegularTest {

	private MetodoDeEstudo r;
	
	@Before
	public void setUp() {
		r = new Regular();
	}
	
	@Test
	public void test() {
		assertEquals(r.getIntervalo(), Regular.TEMPO_INTERVALO_REGULAR);
		assertEquals(r.getTempo(), Regular.TEMPO_DE_ESTUDO_REGULAR);
		assertEquals(r.toString(), "Metodo de estudo regular");
	}

}
