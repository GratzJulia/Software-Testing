package view;

import control.Invoker;

// tela com todas as opções pertinentes ao usuário
public class DiagramaView {

	// Invoker.invoke("renomear", "diagrama", "novoNomeDiagrama");

	public void criarDiagrama() throws Exception {
		Invoker.invoke("criar", "diagrama");
	}

	public void criarElemento() throws Exception {
		Invoker.invoke("criar", "elemento");
	}

	public void criarRelacionamento() throws Exception {
		Invoker.invoke("criar", "relacionamento");
	}

	public void salvarDiagrama() throws Exception {
		Invoker.invoke("salvar", "diagrama");
	}

	public void desfazer() throws Exception {
		Invoker.invoke("desfazer", "diagrama");
	}
	
	public void criarAtributo() throws Exception {
		Invoker.invoke("criar", "atributo");
	}
	
	public void adicionarAtributo(String nomeElemento, String nomeAtributo) throws Exception {
		Invoker.invoke("adicionarAtributo", "elemento", nomeElemento, nomeAtributo);
	}
}