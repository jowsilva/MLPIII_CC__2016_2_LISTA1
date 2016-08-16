package br.unipe.jowsilva.ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int aceleracao;

		Carro carro = new Carro();
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o modelo do carro:");
		carro.setModelo(leitor.nextLine());
		System.out.println("Informe a cor do carro:");
		carro.setCor(leitor.nextLine());
		System.out.println("Informe a velocidade máxima:");
		carro.setvMax(leitor.nextInt());
		System.out.println("Informe a velocidade atual:");
		carro.setvAtual(leitor.nextInt());

		System.out.println("");
		System.out.println("Informe a aceleração:");
		aceleracao = leitor.nextInt();

		System.out.println("Carro: " + carro.getModelo() + " - Cor: " + carro.getCor() + "- Velocidade Inicial: "
				+ carro.getvAtual() + "KM - Velocidade Máxima: " + carro.getvMax() + "KM.");
		carro.Acelerar(aceleracao);
		System.out.println("Carro: " + carro.getModelo() + " - Cor: " + carro.getCor() + " - Velocidade Atual: "
				+ carro.getvAtual() + "KM - Velocidade Máxima: " + carro.getvMax() + "KM.");
		
		leitor.close();

	}

}
