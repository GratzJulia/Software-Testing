package model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Diagrama {

	private String tipo;
	private String nome;
	private Map<String, Object> historico;

	public Diagrama() {
		// LinkedHashMap, pois o HashMap não guarda a ordem de inserção dos valores
		// e essa ordem é importante para que nosso método desfazer pegue exatamente a última alteração
		historico = new LinkedHashMap<>();
	}

	@Override
	public String toString() {
		return nome + " - " + historico.values();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<String, Object> getHistorico() {
		return historico;
	}

	public void setHistorico(Map<String, Object> historico) {
		this.historico = historico;
	}
}