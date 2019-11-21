package control;

import model.Elemento;
import model.Relacionamento;

public class RelacionamentoController implements Controller {

	private static int id = 1;

	// remover as chamadas para o método selecionarElemento
	@Override
	public void criar() {
		Elemento primeiroElemento = ElementoController
				.selecionarElemento((Elemento) DiagramaController.diagrama.getHistorico().get("Elemento1"));
		Elemento segundoElemento = ElementoController
				.selecionarElemento((Elemento) DiagramaController.diagrama.getHistorico().get("Elemento2"));
		Relacionamento relacionamento = new Relacionamento(primeiroElemento, segundoElemento);
		relacionamento.setNome("Relacionamento" + id);
		DiagramaController.diagrama.getHistorico().put(relacionamento.getNome(), relacionamento);
		id++;
		System.out.println("Criou o relacionamento " + relacionamento.getNome() + " entre o elemento "
				+ relacionamento.getElementoRelacao().getPrimeiroElemento() + " e o elemento "
				+ relacionamento.getElementoRelacao().getSegundoElemento());
	}
}