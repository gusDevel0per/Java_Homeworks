package entities;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;

	// retorna o total (preco * quantidade)
	public double total() {
		return preco * quantidade;
	}

	// adicionar produtos
	public void addProdutos(int quantidade) {
		// this.quantidade = this.quantidade + quantidade;
		this.quantidade += quantidade;
	}

	// remove produtos
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	// objeto convertido para String
	public String toString() {
		return nome 
				+ " / Preço: R$" 
				+ String.format("%.2f", preco)
				+ " / quantidade: " 
				+ quantidade 
				+ " / total: R$" 
				+ String.format("%.2f", total());
	}

}
