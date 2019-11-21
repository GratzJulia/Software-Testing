package control;

import java.util.ArrayList;
import java.util.List;
import model.BancoDeDados;
import model.Diagrama;

public class DiagramaController implements Controller {

	public static Diagrama diagrama;
	// decrementar ao excluir
	private static int id = 1;

	@Override
	public void criar() {
		diagrama = new Diagrama();
		diagrama.setNome("Diagrama" + id);
		id++;
		System.out.println("Criou o diagrama: " + diagrama);
	}

	public void desfazer() {
		
		// cria uma lista de chaves do mapa que representa nosso histórico de alterações
		List<String> listaDeChavesDoHistorico = new ArrayList<String>(diagrama.getHistorico().keySet());
		
		if (!diagrama.getHistorico().isEmpty()) {
			// com base na lista de chaves criada, remove a última chave inserida
			diagrama.getHistorico().remove(listaDeChavesDoHistorico.get(listaDeChavesDoHistorico.size() - 1));
			System.out.println("Desfez a última alteração");
			System.out.println("Novo estado do diagrama: " + diagrama);
		} else {
			System.out.println("Não há mais alterações");
		}
	}

	public void salvar() {
		BancoDeDados.diagramas.put(diagrama.getNome(), diagrama);
		System.out.println("Salvou o diagrama: " + diagrama.getNome());

		if (BancoDeDados.diagramas.containsKey(diagrama.getNome())) {
			// verificando se realmente foi salvo no mapa
			System.out.println("Estado salvo: " + BancoDeDados.diagramas.get(diagrama.getNome()));
		}
	}
}