package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String NomeProfessor, NomeAluno;
		double Nota1, Nota2, Media;
		
		System.out.println("Insira o nome do professor: ");
		NomeProfessor = sc.nextLine();
		
		System.out.println("Insira o nome do estudante: ");
		NomeAluno = sc.nextLine();
		
		System.out.println("Insira a 1ª nota: ");
		Nota1 = sc.nextDouble();
		System.out.println("Insira a 2ª nota");
		Nota2 = sc.nextDouble();
		
		Media = (Nota1 + Nota2)/2;
				
		System.out.println("Nome do professor: " + NomeProfessor);
		System.out.println("Nome do aluno: " + NomeAluno);
		System.out.printf("Nota1: %.2f\nNota2: %.2f\nMédia do semestre: %.2f", Nota1, Nota2, Media);
		
		sc.close();
	}

}
