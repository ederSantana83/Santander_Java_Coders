package ex5;

import java.util.Locale;
import java.util.Scanner;

public class CalculoPeca {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, codigoPeca2, quantidadePecas1, quantidadePecas2;
		double valorUnit1, valorUnit2, valorTotal;
		
		System.out.println("Informe o código da peça 1:");
		codigoPeca1 = sc.nextInt();
		System.out.println("Informe o código da peça 2:");
		codigoPeca2 = sc.nextInt();
		System.out.println("Informe a quantidade da peça 1:");
		quantidadePecas1 = sc.nextInt();
		System.out.println("Informe a quantidade peça 2:");
		quantidadePecas2 = sc.nextInt();
		System.out.println("Informe o valor da peça 1:");
		valorUnit1 = sc.nextDouble();
		System.out.println("Informe o valor da peça 2:");
		valorUnit2 = sc.nextDouble();

		valorTotal = (quantidadePecas1 * valorUnit1) + (quantidadePecas2 * valorUnit2); 
		System.out.printf("VALOR A PAGAR: RS %.2f\n", valorTotal);
		
		sc.close();

	}

}
