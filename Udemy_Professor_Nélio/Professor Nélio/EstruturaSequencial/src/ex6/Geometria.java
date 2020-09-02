package ex6;

import java.util.Locale;
import java.util.Scanner;

public class Geometria {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.println("Informe o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Informe o valor de B: ");
		B = sc.nextDouble();
		System.out.println("Informe o valor de C: ");
		C = sc.nextDouble();
		
		double areaTriangulo = (A * C) / 2.0;
		double areaCirculo = Math.PI * Math.pow(C, 2.0);
		double areaTrapezio = ((A + B) * C) / 2;
		double areaQuadrado = Math.pow(B, 2.0);
		double areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO %.3f\n", areaTriangulo);
		System.out.printf("CIRCULO %.3f\n", areaCirculo);
		System.out.printf("TRAPEZIO %.3f\n", areaTrapezio);
		System.out.printf("QUADRADO %.3f\n", areaQuadrado);
		System.out.printf("RETANGULO %.3f\n", areaRetangulo);
		
		sc.close();
		
		
		
		
	}
}
