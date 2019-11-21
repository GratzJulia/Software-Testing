package model;

import java.util.ArrayList;
import java.util.List;

public class Elemento {

	private String tipo;
	private String nome;
	private List<Atributo> atributos;
	private List<Metodo> metodos;
	
	public Elemento() {
		atributos = new ArrayList<>();
		metodos = new ArrayList<>();
	}

	@Override
	public String toString() {
		return nome;
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

	public List<Atributo> getAtributos() {
		return atributos;
	}

	public void setAtributos(List<Atributo> atributos) {
		this.atributos = atributos;
	}

	public List<Metodo> getMetodos() {
		return metodos;
	}

	public void setMetodos(List<Metodo> metodos) {
		this.metodos = metodos;
	}
}