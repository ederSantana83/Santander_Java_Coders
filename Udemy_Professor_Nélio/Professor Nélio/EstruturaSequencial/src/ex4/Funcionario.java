package ex4;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, horasTrabalhadas;
		double valorHora, salario;
		
		System.out.println("Informe o ID do funcionário: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe o número de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Informe o valor hora do funcionário: ");
		valorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHora;	
		
		System.out.printf("NUMBER %d\n", id);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		sc.close();
	}
}
