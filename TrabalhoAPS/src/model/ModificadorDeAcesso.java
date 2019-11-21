package model;

public class ModificadorDeAcesso {

	private String nome;
	
	@Override
	public String toString() {
		return nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}