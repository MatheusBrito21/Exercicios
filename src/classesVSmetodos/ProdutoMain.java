package classesVSmetodos;

public class ProdutoMain {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.nome = "Notebook HP";
		produto1.preco = 2500;
		
		//o valor do desconto nesse ponto é 0.1 conforme o atributo statico da classe
		System.out.println("Desconto:"+Produto.desconto);
		System.out.println(produto1.precoComDesconto());
		
		Produto produto2 = new Produto("Ipad", 3000);
		
		//para alterar o valor do atributo devemos acessá-lo pela classe Produto
		//pois é um atributo statico
		Produto.desconto = 0.5;
		System.out.println("Desconto:"+Produto.desconto);
		System.out.println(produto2.precoComDesconto());

		
	}

}
