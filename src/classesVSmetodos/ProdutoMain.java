package classesVSmetodos;

public class ProdutoMain {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook HP";
		p1.preco = 2500;
		
		//o valor do desconto nesse ponto é 0.1 conforme o atributo statico da classe
		System.out.println("Desconto:"+Produto.desconto);
		System.out.println(p1.precoComDesconto());
		
		Produto p2 = new Produto("Ipad", 3000);
		
		//para alterar o valor do atributo devemos acessá-lo pela classe Produto
		//pois é um atributo statico
		Produto.desconto = 0.5;
		System.out.println("Desconto:"+Produto.desconto);
		System.out.println(p2.precoComDesconto());

		
	}

}
