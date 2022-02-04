package exercicios.ex19;

public class Cliente {
	String nome;
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	String calcularCompra(ListaDeCompra lista) {
		double valorTotal = 0;
	
		for(Produto v: lista.listaDeCompra) {
			valorTotal+=(v.preco-(v.preco*v.desconto))*v.qtd;
		}
	return"\nValor Total R$"+ valorTotal;
	}
}
