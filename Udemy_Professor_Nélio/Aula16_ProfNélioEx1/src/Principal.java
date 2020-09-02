import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		double x = 3.0;
		double y = 4.0;
		double z = - 5.0;
		double A, B, C;
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
				
		System.out.printf("Raiz de %.2f = %.2f\n", x, A);
		System.out.println("Raiz de " + y + " = " + B);
		System.out.println("Raiz de " + 25.0 + " = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.printf("%.2f elevado a %.2f = %.2f\n", x, y, A);
		System.out.printf("%.2f elevado a %.2f = %.2f\n", x, 2.0, B);
		System.out.printf("%.2f elevado a %.2f = %.2f\n", 5.0, 2.0, C);
		
		C = Math.abs(z);
		
		System.out.println("Valor absoluto de z: " + C);
		
		
		sc.close();	
	}
}
