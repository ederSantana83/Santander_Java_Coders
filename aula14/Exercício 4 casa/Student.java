package ex4;

public class Student {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaFinal;
	
	public double finalGrade() {
		notaFinal = this.nota1 + this.nota2 + this.nota3; 
		return this.notaFinal;
	}
	
	public void missingPoints() {
		if(notaFinal > 60) {
			System.out.printf("FINAL GRADE = %.2f%n", this.notaFinal);
			System.out.println("PASS");
		}else {
			System.out.printf("FINAL GRADE = %.2f%n", this.notaFinal);
			System.out.println("FAILED");
			System.out.printf("MISSING = %.2f POINTS %n", (60.0 - this.notaFinal));
		}
	}
	
}
