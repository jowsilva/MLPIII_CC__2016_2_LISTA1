package br.unipe.jowsilva.ex05.veiculo;

import br.unipe.jowsilva.ex05.pessoa.Pessoa;

public class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double valorKmRodado;
	private int kmInicial;
	private int kmFinal;
	private double valorLocacao;
	private String chaci;
	Pessoa proprietario = new Pessoa();

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}

	public int getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}

	public int getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public String getChaci() {
		return chaci;
	}

	public void setChaci(String chaci) {
		this.chaci = chaci;
	}

	public Veiculo() {

	}

}
