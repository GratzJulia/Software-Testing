package control;

import model.Atributo;
import model.Elemento;

public class ElementoController implements Controller {

	private static int id = 1;

	@Override
	public void criar() {
		Elemento elemento = new Elemento();
		elemento.setNome("Elemento" + id);
		DiagramaController.diagrama.getHistorico().put(elemento.getNome(), elemento);
		id++;
		System.out.println("Criou o elemento: " + elemento);
	}

	// remover static e colocar opções de selecionar elemento na tela
	public static Elemento selecionarElemento(Elemento elemento) {

		if (DiagramaController.diagrama.getHistorico().containsKey(elemento.getNome())) {
			System.out.println("Selecionou o elemento: " + elemento);
			return elemento;
		}

		System.out.println("O elemento não existe no diagrama");
		return null;
	}
	
	// problemas:
	// 1. ao chamar o método desfazer, se for desfeito um atributo que já tenha sido atribuído a um elemento,
	// este deverá ser removido da lista de atributos do elemento ao qual foi associado
	// 2. o desfazer deveria desfazer a atribuição do atributo ao elemento, mas, da forma como está implementado atualmente,
	// apenas remove o último objeto inserido no diagrama,
	// não reconhecendo necessariamente a última ação (no caso desfazer a atribuição do atributo ao elemento)
	public void adicionarAtributo(String nomeElemento, String nomeAtributo) {
		Elemento elemento = (Elemento) DiagramaController.diagrama.getHistorico().get(nomeElemento);
		Atributo atributo = (Atributo) DiagramaController.diagrama.getHistorico().get(nomeAtributo);
		
		elemento.getAtributos().add(atributo);
		
		DiagramaController.diagrama.getHistorico().put(elemento.getNome(), elemento);
		
		System.out.println("Atribuiu " + atributo + " ao elemento " + elemento);
	}
}