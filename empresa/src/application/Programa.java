package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produtos;
public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produtos produtos = new Produtos(); //import the Produtos class
		
		System.out.println("Informe o nome do produto");
		produtos.nome = sc.nextLine();
		System.out.println("Informe o preço do produto");
		produtos.preco = sc.nextDouble();
		System.out.println("Informe a quantidade");
		produtos.quantidade = sc.nextInt();
		System.out.println("Isso é um texto aleatório");
		System.out.println(produtos);
		System.out.println("Produto: " + produtos.nome + "\tpreço: R$" + produtos.preco + "\nquantidade: " + produtos.quantidade + "\tPreço total: R$" + produtos.total());
		
		sc.close();
	}

}
