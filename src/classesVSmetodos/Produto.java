package classesVSmetodos;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.1;
	
	Produto(){
		
	}
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	double precoComDesconto(){
		return preco-(preco*desconto);
	}
	
}
