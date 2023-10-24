package applications;

import java.util.Scanner;

import entities.PlacaVideos;

public class Programa {

	public static void main(String[] args) {
		PlacaVideos placa = new PlacaVideos();
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadastre o nome da marca: ");
		String marcaPlaca = sc.nextLine(); 
		placa.setMarca(marcaPlaca);
		System.out.println(placa.getMarca());
		
		System.out.println("Cadastre o nome da placa de video: ");
		String nomePlaca = sc.nextLine();
		placa.setNome(nomePlaca);
		
		System.out.println("Cadastre o preço do produto: ");
		double precoPlaca = sc.nextDouble();
		placa.setPreco(precoPlaca);
		
		System.out.println("Cadastre a quantidade desejada");
		int quantPlaca = sc.nextInt();
		placa.setQuant(quantPlaca);
		
		System.out.println(placa.getNome());
		System.out.println(placa.getPreco());
		System.out.println(placa.getQuant());
								
		sc.close();
	}

}
