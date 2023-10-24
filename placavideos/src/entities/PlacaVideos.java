package entities;

import java.util.Scanner;

public class PlacaVideos {
	private String marca;
	private String nome;
	private double preco;
	private int quantidade;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marcaPlaca) {
		this.marca = marcaPlaca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nomePlaca) {
		this.nome = nomePlaca;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuant() {
		return quantidade;
	}
	
	public void setQuant(int quantPlaca) {
		this.quantidade = quantPlaca;
	}
}
