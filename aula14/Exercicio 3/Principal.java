package ex3;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Geometria g1 = new Geometria();
		
		System.out.println("Informe a largura retângulo: ");
		g1.largura = sc.nextDouble();
		System.out.println("Informe a altura retângulo: ");
		g1.altura = sc.nextDouble();
			
		
		System.out.printf("AREA = %.2f%n", g1.calculaArea());
		System.out.printf("PERIMETER = %.2f%n", g1.calculaPerimetro());
		System.out.printf("DIAGONAL = %.2f%n", g1.calculaDiagonal());
		
		sc.close();
	}

}
