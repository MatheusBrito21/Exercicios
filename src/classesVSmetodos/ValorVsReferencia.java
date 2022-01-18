package classesVSmetodos;

public class ValorVsReferencia {
	
	static void porValor(double numero) {
		numero++;
	}
	
	static void porRefeferencia(Produto produto) {
		produto.preco++;
	}
	
	public static void main(String[] args) {
		double num1 = 1;
		Produto p1 = new Produto("Caneta", 2);
	
		porValor(num1);
		porRefeferencia(p1);
		
		System.out.println(num1);
		System.out.println(p1.nome +" "+p1.preco);
		
		
		Produto p2 = p1;
		p2.nome = "Lapis";
		
		System.out.println(p2.nome +" "+p2.preco);

	}
}
