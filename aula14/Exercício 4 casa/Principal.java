package ex4;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
	Student s1 = new Student();
	
	System.out.println("Qual o nome do aluno?");
	s1.nome = sc.nextLine();
	System.out.println("Qual a nota do primeiro trimestre?");	
	s1.nota1 = sc.nextDouble();	
	System.out.println("Qual a nota do segundo trimestre?");	
	s1.nota2 = sc.nextDouble();	
	System.out.println("Qual a nota do terceiro trimestre?");	
	s1.nota3 = sc.nextDouble();	

	s1.finalGrade();
	s1.missingPoints();
	
	sc.close();	
	}
}
