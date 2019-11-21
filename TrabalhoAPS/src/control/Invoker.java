package control;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

public class Invoker {

	private static Map<String, Class<?>> comandos = new HashMap<>();

	static {
		comandos.put("criar diagrama", DiagramaController.class);
		comandos.put("desfazer diagrama", DiagramaController.class);
		comandos.put("salvar diagrama", DiagramaController.class);
		comandos.put("criar elemento", ElementoController.class);
		comandos.put("criar relacionamento", RelacionamentoController.class);
		comandos.put("criar atributo", AtributoController.class);
		comandos.put("adicionarAtributo elemento", ElementoController.class);
	}

	public static void invoke(String comando, String objeto, Object... parametros) throws Exception {

		Controller c = (Controller) comandos.get(comando + " " + objeto).newInstance();

		if (parametros.length == 0) {
			Method metodo = c.getClass().getMethod(comando);
			metodo.invoke(c);
		} else if (parametros.length == 1) {
			Method metodo = c.getClass().getMethod(comando, String.class);
			metodo.invoke(c, parametros[0]);
		} else {
			Method metodo = c.getClass().getMethod(comando, String.class, String.class);
			metodo.invoke(c, parametros[0], parametros[1]);
		}
	}
}