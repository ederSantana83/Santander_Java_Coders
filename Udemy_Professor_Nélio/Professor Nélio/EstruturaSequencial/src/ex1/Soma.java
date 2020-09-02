package ex1;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um inteiro");
		int x = sc.nextInt();
		System.out.println("Digite outro inteiro");
		int y = sc.nextInt();
		int soma = x + y;
		
		System.out.println("Soma: " + soma);
		
		sc.close();
	}
}
