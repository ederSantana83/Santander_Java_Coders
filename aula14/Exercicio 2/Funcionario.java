package ex2;

public class Funcionario {
	
	public String name;
	public double salario;
	public double desconto;
	
	public double salarioLiquido() {
		return this.salario - this.desconto;
	}
	
	public double aumentarSalario(double perc) {
		return this.salario += salario * perc/100;
	}	
	
	public void resumo() {
		System.out.println("Funcionário: " + this.name + ", $ " + this.salarioLiquido());
	}
	
	public void updateResumo() {
		System.out.println("Dados atualizados: " + this.name + ", $ " + this.salarioLiquido());
	}
	
	
	
}
