package ex15_2;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o preço do dolar?");
		double cotacao = sc.nextDouble();
		
		System.out.println("Quantos dolares você comprou?");
		double valor = sc.nextDouble();
		
		System.out.printf("Quantidade a ser paga em reais: %.2f%n", Conversao.converterMoedas(cotacao, valor));
		 
		sc.close();
	}
}
