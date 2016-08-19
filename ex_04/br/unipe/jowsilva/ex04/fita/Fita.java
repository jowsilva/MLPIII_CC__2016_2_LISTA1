package br.unipe.jowsilva.ex04.fita;

import br.unipe.jowsilva.ex04.autor.Autor;

public class Fita {

	private String titulo;
	private double preco;
	private Autor autor;
	private double valor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Fita() {

	}

	public double CalculaLancamento() {

		valor = preco + (preco * 0.20);

		return valor;
	}

	public double CalculaInfantil() {

		valor = preco - (preco * 0.40);

		return valor;
	}

}
