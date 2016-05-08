package Stude;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {

	private Usuario usuario1, usuario2, usuario3;
	private String nome1, nome2, nome3;

	@Before
	public void setUp() throws Exception {
		nome1 = "Maria";
		nome2 = "Paulo";
		nome3 = "Julia";
		usuario1 = new Usuario(nome1);
		usuario2 = new Usuario(nome2);
		usuario3 = new Usuario(nome3);
	}

	@Test
	public void testaCriarUsuario() {
		try {
			new Usuario(null);
		} catch (Exception e) {
			assertEquals("Nome da disciplina invalido", e.getMessage());
		}

		try {
			new Usuario(" ");
		} catch (Exception e) {
			assertEquals("Nome da disciplina invalido", e.getMessage());
		}
	}

	@Test
	public void testaSetNome() throws Exception {
		usuario2.setNome(nome2);
		assertEquals(usuario2.getNome(), nome2);
		
		usuario1.setNome(nome3);
		assertEquals(usuario1.getNome(), nome3);
		
		try {
			usuario3.setNome(null);
		} catch (Exception e) {
			assertEquals("Nome da disciplina invalido", e.getMessage());
		}
		assertNotEquals(usuario3.getNome(), null);
		
		try {
			usuario1.setNome("");
		} catch (Exception e) {
			assertEquals("Nome da disciplina invalido", e.getMessage());
		}
		assertNotEquals(usuario1.getNome(), "");
	}
}
