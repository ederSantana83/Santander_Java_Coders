package ex15_2;

public class Conversao {
	
	public static final double IOF = 0.06; 
	
	public static double converterMoedas(double cotacao, double valor) {
		return (cotacao * valor) + (cotacao * valor * IOF);
	}
	

}
