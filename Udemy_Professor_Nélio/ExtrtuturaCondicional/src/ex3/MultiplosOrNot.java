package ex3;

import java.util.Scanner;

public class MultiplosOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Informe um inteiro");
		num1 = sc.nextInt();
		System.out.println("Informe outro inteiro");
		num2 = sc.nextInt();
		
		System.out.println("São multíplos?");
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São Multíplos");
		}else {
			System.out.println("Não são Multíplos");
		}
		
		sc.close();

	}

}
