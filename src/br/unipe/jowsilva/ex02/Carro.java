package br.unipe.jowsilva.ex02;

public class Carro {

	private String cor;
	private String modelo;
	private int vAtual;
	private int vMax;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getvAtual() {
		return vAtual;
	}

	public void setvAtual(int vAtual) {
		if (vAtual > this.vMax) {
			this.vAtual = this.vMax;
		} else {
			this.vAtual = vAtual;
		}
	}

	public int getvMax() {
		return vMax;
	}

	public void setvMax(int vMax) {
		this.vMax = vMax;
	}

	public void Ligar() {

	}

	public void Acelerar(int velocidade) {

		this.vAtual = this.vAtual + velocidade;
		
		if (this.vAtual > this.vMax){
			this.vAtual = this.vMax;
			System.out.println("");
			System.out.println("Velocidade Máxima excedida, velocidade atual = "+ this.vAtual + "KM");
			System.out.println("");
		}

	}

	public Carro() {

	}

}
