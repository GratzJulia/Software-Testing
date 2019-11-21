package main;

import view.DiagramaView;

public class Main {

	public static void main(String[] args) throws Exception {

		// inicia a tela com o menu de ações para o usuário
		DiagramaView telaMenu = new DiagramaView();

		telaMenu.criarDiagrama();
		telaMenu.criarElemento();
		telaMenu.criarElemento();
		telaMenu.criarAtributo();
		telaMenu.adicionarAtributo("Elemento1", "Atributo1");
		telaMenu.criarRelacionamento();
		telaMenu.salvarDiagrama();
		telaMenu.desfazer();
		telaMenu.desfazer();
	}
}