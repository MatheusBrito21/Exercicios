package exercicios.ex19;

public class Produto {
	String nomeProduto;
	double preco;
	int qtd;
	protected double desconto = 0.0;
//	@SuppressWarnings("unused")
//	private int qtd_estoque;
	
	public Produto(String nomeProduto, double preco, int qtd) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.qtd = qtd;
		
	}
	
	@Override
	public String toString() {
		return nomeProduto +" R$ "+preco + " x"+qtd;
	}
}
