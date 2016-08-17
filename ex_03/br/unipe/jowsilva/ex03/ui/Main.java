package br.unipe.jowsilva.ex03.ui;

import java.util.Scanner;

import br.unipe.jowsilva.ex03.conexao.Conexao;

public class Main {

	public static void main(String[] args) {

		int opcao = -1;

		Scanner leitor = new Scanner(System.in);

		while (opcao != 2) {

			System.out.println("Deseja realizar uma conex�o?");

			System.out.println("1 - Sim");
			System.out.println("2 - N�o");

			opcao = leitor.nextInt();

			switch (opcao) {

			case 1:
				Conexao.getInstance();
				break;
			case 2:
				System.out.println("Opera��o Cancelada");

			}

		}

		leitor.close();

	}
}