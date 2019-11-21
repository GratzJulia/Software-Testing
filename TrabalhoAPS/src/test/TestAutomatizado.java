package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import control.*;
import model.*;

class TestAutomatizado {

	Diagrama d;
	Elemento elem;
	ElementoRelacao e1,e2;
	Relacionamento r;
	
	@Test
	void testNovoDiagramaValido() {
		assertDoesNotThrow(() -> d = new Diagrama());
		assertNotNull(d);
		assertEquals(new Diagrama().getClass(), d.getClass());
	}
	
	@Test
	void testNovoElementoValido() {
		assertDoesNotThrow(() -> elem = new Elemento());
		assertNotNull(elem);
		assertEquals(new Elemento().getClass(), elem.getClass());
	}
	
	@Test
	void testNovoRelacionamentoValido() {
		assertDoesNotThrow(() -> r = new Relacionamento(elem,elem));
		assertNotNull(r);
	}
	
	
}
