package ex2;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Funcionario f1 = new Funcionario();
		System.out.println("Qual o nome do funcionário: ");
		f1.name = sc.nextLine();
		System.out.println("Qual o salário bruto: ");
		f1.salario = sc.nextDouble();
		System.out.println("Qual o valor dos descontos: ");
		f1.desconto = sc.nextDouble();
		
		f1.resumo();
		
		System.out.println("Qual o percentual de aumento no salário: ");
		double perc = sc.nextDouble();
		f1.aumentarSalario(perc); 
		
		f1.updateResumo();
		
		sc.close();
	}
}
