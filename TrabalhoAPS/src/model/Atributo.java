package model;

import java.util.ArrayList;
import java.util.List;

public class Atributo {

	private String tipoDeDado;
	private String nome;
	private List<ModificadorDeAcesso> modificadoresDeAcesso;
	
	public Atributo() {
		modificadoresDeAcesso = new ArrayList<>();
	}
	
	@Override
	public String toString() {	
		return nome + " " + modificadoresDeAcesso;
	}

	public String getTipoDeDado() {
		return tipoDeDado;
	}

	public void setTipoDeDado(String tipoDeDado) {
		this.tipoDeDado = tipoDeDado;
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
}