package ex3;

import java.util.Scanner;

public class DireferncaProduto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, dif;
		
		System.out.println("Informe o valor de A");
		A = sc.nextInt();
		System.out.println("Informe o valor de B");
		B = sc.nextInt();
		System.out.println("Informe o valor de C");
		C = sc.nextInt();
		System.out.println("Informe o valor de D");
		D = sc.nextInt();
		
		dif = (A * B - C * D);
		
		System.out.println("DIFERENCA: " + dif);
		
		sc.close();
		
		

	}
}
