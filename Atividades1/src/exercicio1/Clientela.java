package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Clientela {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String Nome;
		int Valor1, Valor2, Resultado;
		System.out.println("Insira seu nome completo: ");
		Nome = sc.nextLine();
		System.out.println("Insira os dois valores");
		Valor1 = sc.nextInt();
		Valor2 = sc.nextInt();
		Resultado = Valor1 + Valor2;
		System.out.println("Registrado.");
		System.out.println("Nome completo: " + Nome);
		System.out.printf("Valores atríbuidos: %d %d\n", Valor1, Valor2);
		System.out.printf("Resultado: %d", Resultado);
		
		
		
		sc.close();
	}

}
