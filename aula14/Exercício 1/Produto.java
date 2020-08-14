package main;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	
	public double valorTotal() {
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void saidaProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public void resumo() {
		System.out.println("Product data: " + this.nome + ", $" + this.preco + ", " + this.quantidade + " units, Total: $ " + this.valorTotal());
	}
	
	public void updateResumo() {
		System.out.println("Updated data: " + this.nome + ", $" + this.preco + ", " + this.quantidade + " units, Total: $ " + this.valorTotal());
	}

	

}
