package model;

public class ElementoRelacao {

	private String modificadorAcesso;
	private String nomeAssociacao;
	private String navegabilidade;
	// private List<Elemento> relacao;
	// preferi colocar dois objetos do tipo Elemento, porque a associação é sempre entre apenas dois elementos
	private Elemento primeiroElemento;
	private Elemento segundoElemento;

	public ElementoRelacao(Elemento primeiroElemento, Elemento segundoElemento) {
		this.primeiroElemento = primeiroElemento;
		this.segundoElemento = segundoElemento;
	}

	public String getModificadorAcesso() {
		return modificadorAcesso;
	}

	public void setModificadorAcesso(String modificadorAcesso) {
		this.modificadorAcesso = modificadorAcesso;
	}

	public String getNomeAssociacao() {
		return nomeAssociacao;
	}

	public void setNomeAssociacao(String nomeAssociacao) {
		this.nomeAssociacao = nomeAssociacao;
	}

	public String getNavegabilidade() {
		return navegabilidade;
	}

	public void setNavegabilidade(String navegabilidade) {
		this.navegabilidade = navegabilidade;
	}

	public Elemento getPrimeiroElemento() {
		return primeiroElemento;
	}

	public void setPrimeiroElemento(Elemento primeiroElemento) {
		this.primeiroElemento = primeiroElemento;
	}

	public Elemento getSegundoElemento() {
		return segundoElemento;
	}

	public void setSegundoElemento(Elemento segundoElemento) {
		this.segundoElemento = segundoElemento;
	}
}