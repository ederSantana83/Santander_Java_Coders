package principal;

import java.util.Locale;
import java.util.Scanner;

import geometria.Triangulo;

public class Principal {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Informe os três lados do triangulo X: ");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Informe os três lados do triângulo Y: ");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double xArea = x.calcularArea();
		
		double yArea = y.calcularArea();
		
		System.out.printf("A área do triângulo X é: %.4f%n", xArea);
		System.out.printf("A área do triângulo Y é %.4f%n", yArea);
		
		if(xArea > yArea) {
			System.out.println("A área do triângulo maior é: X");
		}else if(xArea < yArea) {
			System.out.println("A área do triângulo maior é: Y");
		}else {
			System.out.println("As áreas dos triângulos são iguais");
		}
			
		
		sc.close();
	}
}
