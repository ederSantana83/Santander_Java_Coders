package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto p1 = new Produto();
		
		System.out.println("Digite o nome do produto: ");
		p1.nome = sc.nextLine();
		System.out.println("Digite o preço do produto: ");
		p1.preco = sc.nextDouble();
		System.out.println("Digite o quantidade no estoque: ");
		p1.quantidade = sc.nextInt();
		
		p1.resumo();
		System.out.println("Digite a quantidade de produtos a ser adicionada no estoque: ");
		int quantidade = sc.nextInt();
		p1.addProduto(quantidade);
		
		p1.updateResumo();
		
		System.out.println("Digite a quantidade de produtos a ser removida do estoque: ");
		quantidade = sc.nextInt();
		p1.saidaProduto(quantidade);
		
		p1.updateResumo();
			
		sc.close();
	}
}
