package ex3;

public class Geometria {

	public double largura;
	public double altura;
	
	public double calculaArea() {
		double area = this.altura * this.largura;
		return area;
	}
	
	public double calculaPerimetro() {
		return 2*(this.altura * this.largura);
	}
	public double calculaDiagonal() {
		return Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.largura, 2));
	}
	
}
