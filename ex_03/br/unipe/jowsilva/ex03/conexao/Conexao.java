package br.unipe.jowsilva.ex03.conexao;

public class Conexao {

	private static Conexao instancia;

	private Conexao() {

	}

	public static synchronized Conexao getInstance(){
		if (instancia == null){
			instancia = new Conexao();
		}else{
			System.out.println("");
			System.out.println("J� existe uma conex�o em andamento.");
			System.out.println("");
		}
		return instancia;
	}
}
