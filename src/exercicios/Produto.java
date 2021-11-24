package exercicios;

public class Produto {
	String nome;
	double valor;
	int qtd = 1;
	
	//List<Produto> lista = new ArrayList<>();
	
	public Produto( String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String toString() {
		return   nome+" R$" + valor + " x"+ qtd;
	}


	public String calcularDesconto() {
		double precoFinal;
		
		if(qtd<=10) {
			//valor total
			precoFinal = valor;
			
		}else if(qtd>10 && qtd <=20) {
			//10%
			precoFinal = valor * (1 - 0.01);
		}else if(qtd>20 && qtd <=50) {
			//20%
			precoFinal = valor * (1 - 0.02);
		}else {
			//25%
			precoFinal = valor * (1 - 0.025);
		}
		return String.format("Total: R$%.2f",precoFinal*qtd);
	}
	
}
