package ex4;

import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, duracao;
		
		System.out.println("Informe o inicio");
		inicio = sc.nextInt();
		System.out.println("Informe o fim");
		fim = sc.nextInt();
		
		if(fim > inicio){
			duracao = fim - inicio;
		}else {
			duracao = 24 - inicio + fim;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}
}
