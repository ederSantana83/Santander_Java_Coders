package principal;

public class Circulo {
	
	public static final double PI = 3.1415; //final para constante
	
	public static double calcCircunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double calcVolume(double raio) {
		return (4.0 * PI * Math.pow(raio, 3)) / 3;
	}

 

}
