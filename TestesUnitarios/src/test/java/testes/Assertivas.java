package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import code.Usuario;

public class Assertivas {
	
	@Test
	public void testVerdadeiroOuFalso() {
		assertTrue(true);
		assertFalse(false);
	}
	
	@Test
	public void testIgualdade() {
		assertEquals(1,1);
		// valores float e double necessitam de um delta que garanta a precisao da casa decimal
		assertEquals(0.051234, 0.0512, 0.001);
		assertEquals(Math.PI, 3.14, 0.01);
		
		int i = 5;		// tipo primitivo
		Integer i2 = 5; // objeto
		assertEquals(Integer.valueOf(i), i2);
		assertEquals(i, i2.intValue());
		
		assertEquals("string", "string");
		assertNotEquals("casa", "apartamento");
		// para ignorar letras maiusculas: (asserttrue)
		assertTrue("Bola".equalsIgnoreCase("bola"));
		// para comparar com substring: (asserttrue)
		assertTrue("bola".startsWith("bo"));
	}
	
	@Test
	public void testIgualdadeObjetos() {
		Usuario u = new Usuario("julia");
		Usuario j = u;
		Usuario outro = new Usuario();
		assertEquals(u, j);
		assertSame(j, u);
		assertNotSame(u, outro);
		
		Usuario vazio = null;
		assertTrue(vazio == null);
		assertNull(vazio);
		assertNotNull(outro);
	}
	
	@Test
	public void mostraMensagemErro() {
		assertEquals("Elementos não são iguais", 1, 2);
		// qualquer assert pode vir com um comentario de erro.
	}

}
