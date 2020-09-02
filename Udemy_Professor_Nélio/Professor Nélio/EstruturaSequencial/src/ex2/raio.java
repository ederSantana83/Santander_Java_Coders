package ex2;

import java.util.Locale;
import java.util.Scanner;

public class raio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = sc.nextDouble();

		Double area = Math.PI * Math.pow(raio, 2.0);	
		
		System.out.printf("A= %.4f", area);
		
		sc.close();
		
		
		
	}
}
