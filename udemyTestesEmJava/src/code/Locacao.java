package code;

import java.util.Date;

public class Locacao {
	private Usuario usuario;
	private Filme filme;
	private Date dtLocacao;
	private Date dtDevolucao;
	private double valor;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public Date getDtLocacao() {
		return dtLocacao;
	}
	public void setDtLocacao(Date dtLocacao) {
		this.dtLocacao = dtLocacao;
	}
	public Date getDtDevolucao() {
		return dtDevolucao;
	}
	public void setDtDevolucao(Date dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
