package ex1;
import java.util.Scanner;

public class NegativoOuNao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Informe um inteiro");
		number = sc.nextInt();
		sc.nextLine();
		
		if (number < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();

	}
}
