package aula15_Algaworks;

public class Cliente {
	
	String nome;
	String cpf;
	
	Cliente(){	
		System.out.println("Construindo cliente...");
	}
	
	Cliente(String nome){
		this();
		System.out.println("Cliente com nome " + nome);
		this.nome = nome;
	}
	
	Cliente(String nome, String cpf){
		this(nome);
		System.out.println("Cliente com cpf " + cpf);
		this.cpf = cpf;
	}

}
