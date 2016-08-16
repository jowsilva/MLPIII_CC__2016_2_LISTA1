package br.unipe.jowsilva;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Fatura faturar = new Fatura();

		System.out.println("CAIXA LIVRE");
		System.out.println("");
		System.out.println("");
		System.out.println("Informe o número da nota fiscal:");
		faturar.setNumero(leitor.nextLine());
		System.out.println("Informe a descrição do produto:");
		faturar.setDescricao(leitor.nextLine());
		System.out.println("Informe a quantidade a ser vendida");
		faturar.setQtd(leitor.nextInt());
		System.out.println("Informe o preço do produto:");
		faturar.setPreco(leitor.nextDouble());

		System.out.println("		TECH SOLUTIONS ME");
		System.out.println("");
		System.out.println("			      FATURA: " + faturar.getNumero());
		System.out.println("DESCRICAO		QTD		VALOR");
		System.out.println(faturar.getDescricao() + "	" + faturar.getQtd() + "		" + faturar.getPreco());
		System.out.println("---------------------------------------------");
		System.out.println("			TOTAL: " + "		" + faturar.getValorFatura());
		leitor.close();

	}

}
