package model;

import java.util.ArrayList;
import java.util.List;

public class Metodo {

	private String tipoDeRetorno;
	private String nome;
	private List<ModificadorDeAcesso> modificadoresDeAcesso;
	private List<Parametro> parametros;
	
	public Metodo() {
		modificadoresDeAcesso = new ArrayList<>();
		parametros = new ArrayList<>();
	}

	public String getTipoDeRetorno() {
		return tipoDeRetorno;
	}

	public void setTipoDeRetorno(String tipoDeRetorno) {
		this.tipoDeRetorno = tipoDeRetorno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ModificadorDeAcesso> getModificadoresDeAcesso() {
		return modificadoresDeAcesso;
	}

	public void setModificadoresDeAcesso(List<ModificadorDeAcesso> modificadoresDeAcesso) {
		this.modificadoresDeAcesso = modificadoresDeAcesso;
	}

	public List<Parametro> getParametros() {
		return parametros;
	}

	public void setParametros(List<Parametro> parametros) {
		this.parametros = parametros;
	}
}