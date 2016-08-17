package br.unipe.jowsilva.ex05.ui;

import java.util.Scanner;

import br.unipe.jowsilva.ex05.pessoa.Pessoa;
import br.unipe.jowsilva.ex05.veiculo.Carga;
import br.unipe.jowsilva.ex05.veiculo.Passeio;
import br.unipe.jowsilva.ex05.veiculo.Veiculo;

public class Main {

	public static void main(String[] args) {

		int opcao;
		Scanner leitor = new Scanner(System.in);
		Pessoa proprietario = new Pessoa();

		System.out.println("LOCADORA DE CARROS JWBS");
		System.out.println("");
		System.out.println("1 - VEICULO DE CARGA");
		System.out.println("2 - VEICULO DE PASSEIO");

		opcao = leitor.nextInt();

		switch (opcao) {

		case 1:
			Veiculo carga = new Carga();
			carga.setPlaca("NQJ-0199");
			carga.setMarca("Ford");
			carga.setModelo("F4000");
			carga.setAno(1992);
			carga.setValorKmRodado(10.00);
			carga.setChaci("9BWZZZ377VT004251");

			proprietario.setNome("José William");
			carga.setProprietario(proprietario);

			System.out.println("Informe o KM Inicial: ");
			carga.setKmInicial(leitor.nextInt());
			System.out.println("Informe o KM Final: ");
			carga.setKmFinal(leitor.nextInt());

			carga.setValorLocacao(
					carga.CalculaValor(carga.getKmInicial(), carga.getKmFinal(), carga.getValorKmRodado()));

			System.out.println("Extrato de Locação:");
			System.err.println("");
			System.out.println("Veículo: " + carga.getMarca() + " " + carga.getModelo());
			System.out.println("Ano: " + carga.getAno());
			System.out.println("KM Inicial: " + carga.getKmInicial());
			System.out.println("KM Final: " + carga.getKmFinal());
			System.out.println("");
			System.out.println("Valor da Locação: R$" + carga.getValorLocacao());
			break;

		case 2:
			Veiculo passeio = new Passeio();
			passeio.setPlaca("NQJ-0200");
			passeio.setMarca("Fiat");
			passeio.setModelo("Uno Way");
			passeio.setAno(2010);
			passeio.setValorKmRodado(5.00);
			passeio.setChaci("9BWAAA377FT008451");
			proprietario.setNome("José William");
			passeio.setProprietario(proprietario);

			System.out.println("Informe o KM Inicial: ");
			passeio.setKmInicial(leitor.nextInt());
			System.out.println("Informe o KM Final: ");
			passeio.setKmFinal(leitor.nextInt());

			passeio.setValorLocacao(
					passeio.CalculaValor(passeio.getKmFinal(), passeio.getKmInicial(), passeio.getValorKmRodado()));

			System.out.println("Extrato de Locação:");
			System.err.println("");
			System.out.println("Veículo: " + passeio.getMarca() + " " + passeio.getModelo());
			System.out.println("Ano: " + passeio.getAno());
			System.out.println("KM Inicial: " + passeio.getKmInicial());
			System.out.println("KM Final: " + passeio.getKmFinal());
			System.out.println("");
			System.out.println("Valor da Locação: R$" + passeio.getValorLocacao());
			break;

		}

		leitor.close();

	}

}
