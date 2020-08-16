package aula15_Algaworks;

public class Principal {

	public static void main(String[] args) {
		
		//Construtor padrão sem parâmetros
		Cliente c1 = new Cliente();
		
		// Construtor que recebe o nome
		Cliente c2 = new Cliente("Eder Sant'ana");
		
		// Construtor que recebe o nome e cpf
		Cliente c3 = new Cliente("Eder Sant'ana", "12345612321");
		
	}

}
