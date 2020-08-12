import java.util.Scanner;
public class ExerciciosExtras {

	public static void main(String[] args) {

	//Exercício 4	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite seu nome:");
	String nome = sc.next();
	
	System.out.println("Boa noite " + nome);
	
	//Exercício 5
	System.out.println("Informe sua idade:");
	int idade  = sc.nextInt();
	if(idade < 18){
		System.out.println("Você é menor de idade");
	}else{
		System.out.println("Você é maior de idade");
	}
	
	//Exercício 6
	System.out.println("Qual o dia da semana:");
	int dia = sc.nextInt();
	
	if(dia == 1 || dia == 7){
		System.out.println("É final de semana");	
	} else if(dia > 1 && dia < 7){
		System.out.println("Não é final de semana:");
	}else{
		System.out.println("Dia incorreto");
	}
	
	//Exercício 7
	System.out.println("Qual a sua idade? ");
	int idade2 = sc.nextInt();
	System.out.println("Aprovado na prova teórica? sim/nao");
	String provaTeorica = sc.next();
	System.out.println("Aprovado na prova prática? sim/nao");
	String provaPratica = sc.next();
	
	if(idade2 > 18 && provaTeorica.equals("sim") && provaPratica.equals("sim")){
		System.out.println("Liberar permissão para dirigir");	
	}else{
		System.out.println("Não liberar a permissão para dirigir");	
	}

	}
}