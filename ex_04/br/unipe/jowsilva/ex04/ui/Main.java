package br.unipe.jowsilva.ex04.ui;

import java.util.Scanner;

import br.unipe.jowsilva.ex04.autor.Autor;
import br.unipe.jowsilva.ex04.fita.Fita;

public class Main {

	public static void main(String[] args) {

		int opcao;
		Scanner leitor = new Scanner(System.in);
		Autor autor = new Autor();

		System.out.println("LOCADORA DE FILMES JWBS");
		System.out.println("");
		System.out.println("1 - LANÇAMENTO");
		System.out.println("2 - INFANTIL");

		opcao = leitor.nextInt();

		switch (opcao) {

		case 1:
			Fita lancamento = new Fita();
			lancamento.setTitulo("Piratas do Caribe");
			lancamento.setPreco(5.00);
			autor.setNome("Walt Disney");
			lancamento.setAutor(autor);

			System.out.println("Fita Locada:");
			System.out.println("Titulo: " + lancamento.getTitulo());
			System.out.println("Autor: " + autor.getNome());
			System.out.println("Valor da Locação: " + lancamento.CalculaLancamento());
			break;

		case 2:
			Fita infantil = new Fita();
			infantil.setTitulo("O Rei Leão");
			infantil.setPreco(5.00);
			autor.setNome("Walt Disney");
			infantil.setAutor(autor);

			System.out.println("Fita Locada:");
			System.out.println("Titulo: " + infantil.getTitulo());
			System.out.println("Autor: " + autor.getNome());
			System.out.println("Valor da Locação: " + infantil.CalculaInfantil());
			break;

		}
		leitor.close();
	}

}
