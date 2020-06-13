package testes;

import static org.junit.Assert.*;
import org.junit.Test;

import code.*;

public class LocacaoServicoTeste {
	
	@Test
	public void testAlugarFilme() {
		LocacaoServico servico = new LocacaoServico();
		Usuario u = new Usuario("Julia");
		Filme f = new Filme("nome do filme", 2, 10.0);
		
		Locacao locacao = servico.alugarFilme(u, f);
		
		assertEquals(10.0, locacao.getValor(), 0.01);
		assertEquals(u, locacao.getUsuario());
		assertEquals(f, locacao.getFilme());
	}
}
