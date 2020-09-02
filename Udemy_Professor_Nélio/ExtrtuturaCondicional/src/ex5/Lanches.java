package ex5;

import java.util.Scanner;

public class Lanches {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cod;
		String esp;
		double qtde, valorTotal;
		
		System.out.println("Informe o código do lanche desejado");
		cod = sc.nextInt();
		System.out.println("Informe a quantidade");
		qtde = sc.nextInt();
		
		if(cod == 1){
			valorTotal = 4.00 * qtde;
		}else if(cod ==2) {
			valorTotal = 4.50 * qtde;
		}else if(cod ==3) {
			valorTotal = 5.00 * qtde;
		}else if(cod ==4) {
			valorTotal = 2.00 * qtde;
		}else {
			valorTotal = 1.50 * qtde;
		}
		
		System.out.printf("TOTAL: R$ %.2f", valorTotal);
		
		
		
		sc.close();
	
		
		
		
	}
}
