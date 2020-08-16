package principal;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Circulo c1 = new Circulo();
		//Circulo c2 = new Circulo();
		
		System.out.println("Qual o raio?");
		double raio = sc.nextDouble();
		
		System.out.printf("Circunference: %.2f%n", Circulo.calcCircunferencia(raio));
		System.out.printf("Volume: %.2f%n", Circulo.calcVolume(raio));
		System.out.printf("PI: %.2f%n%n", Math.PI);
	
		System.out.println("Qual o segundo raio?");
		
		raio = sc.nextDouble();
		
		System.out.printf("Circunference: %.2f%n", Circulo.calcCircunferencia(raio));
		System.out.printf("Volume: %.2f%n", Circulo.calcVolume(raio));
		System.out.printf("PI: %.2f%n", Circulo.PI);
		
		sc.close();
	}
}
