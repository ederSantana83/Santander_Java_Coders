package Intervalor;

import java.util.Locale;
import java.util.Scanner;

public class Intervalor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double num;
		String intervalo;
		
		System.out.println("Informe o valor a ser checado");
		num = sc.nextDouble();
		sc.nextLine();
		
		if(num > 0 && num <= 25) {
			intervalo = "Intervalo [0, 25]";
		}else if(num > 25 && num <= 50) {
			intervalo = "Intervalo [25, 50]";
		}else if(num > 50 && num <= 75) {
			intervalo = "Intervalo [50, 75]";
		}else if(num > 75 && num <= 100) {
			intervalo = "Intervalo [75, 100]";
		}else {
			intervalo = "Fora de intervalo";
		}
		
		System.out.println(intervalo);
		
		sc.close();
	
		
		

	}
}
