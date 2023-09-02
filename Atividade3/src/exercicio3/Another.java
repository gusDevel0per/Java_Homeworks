package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Another {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nomeRefeicao;
		int numeroMesa, i;
		double valor, valorTotal;
		int quantidade; 
		
		System.out.println("Numero da mesa: ");
		numeroMesa = sc.nextInt();
		
		System.out.println("Insira a bebida/refeição: ");
		nomeRefeicao = sc.nextLine();
		System.out.println("Insira o valor: ");
		valor = sc.nextDouble();		
		System.out.println("Insira a quantidade");
		quantidade = sc.nextInt();
		sc.close();
		
		valorTotal = valor * quantidade;
		
		System.out.printf("Mesa: %d\nPedido: %s\nQuantidade: %d\nValor total: %f", numeroMesa, nomeRefeicao, quantidade, valorTotal);
	}

}
