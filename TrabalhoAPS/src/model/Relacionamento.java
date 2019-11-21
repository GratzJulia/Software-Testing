package model;

public class Relacionamento {

	private String tipo;
	private String nome;
	private String direcao;
	private ElementoRelacao elementoRelacao;

	public Relacionamento(Elemento primeiroElemento, Elemento segundoElemento) {
		elementoRelacao = new ElementoRelacao(primeiroElemento, segundoElemento);
	}
	
	@Override
	public String toString() {
		return nome + " [" + elementoRelacao.getPrimeiroElemento() + " - " + elementoRelacao.getSegundoElemento() + "]";
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

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public ElementoRelacao getElementoRelacao() {
		return elementoRelacao;
	}

	public void setElementoRelacao(ElementoRelacao elementoRelacao) {
		this.elementoRelacao = elementoRelacao;
	}
}