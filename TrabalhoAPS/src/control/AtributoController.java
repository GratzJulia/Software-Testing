package control;

import model.Atributo;

public class AtributoController implements Controller {

	private static int id = 1;
	
	@Override
	public void criar() {
		Atributo atributo = new Atributo();
		atributo.setNome("Atributo" + id);
		DiagramaController.diagrama.getHistorico().put(atributo.getNome(), atributo);
		id++;
		System.out.println("Criou o atributo: " + atributo);
	}
}