package br.unipe.jowsilva.ex01;

public class Fatura {

	private String numero;
	private String descricao;
	private int qtd;
	private double preco;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		if (qtd < 0) {
			this.qtd = 0;
		} else {
			this.qtd = qtd;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			this.preco = 0;
		} else {
			this.preco = preco;
		}
	}

	public double getValorFatura() {
		double valor;
		valor = qtd * preco;
		return valor;
	}

	public Fatura() {

	}
}