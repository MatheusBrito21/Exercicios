package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Ex4_DescontoProduto {

	/*
	 * Para cada produto informado (nome, preço e quantidade), escreva o nome do
	 * produto comprado e o valor total a ser pago, considerando que são oferecidos
	 * descontos pelo número de unidades compradas, segundo a tabela abaixo: a. Até
	 * 10 unidades: valor total b. de 11 a 20 unidades: 10% de desconto c. de 21 a
	 * 50 unidades: 20% de desconto d. acima de 50 unidades: 25% de desconto
	 */

	public static void main(String[] args) {
		
		//interface que recebe uma referencia para o metodo println
		Consumer<String> print = System.out::println;
		
		//criando a lista de produtos disponiveis
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Celular", 999.9));
		lista.add(new Produto("Tablet", 2999.9));
		lista.add(new Produto("Smart Watch", 419.9));
		lista.add(new Produto("TV", 1800));
		lista.add(new Produto("HomeTeater", 799.9));

		//for para imprimir a lista de produtos
		//identificados pelo index no array
		for(int i = 0; i < lista.size(); i++) {
			print.accept(i + " - " + lista.get(i));
		}

		//criando a lista de compras
		 List<Produto> listaCompra = new ArrayList<>();
		 //listaCompra.add(lista.get(0));
		 	Scanner e = new Scanner(System.in);
		 	
		 	int prodId;
		 	do {
		 		prodId = 0;
		 		System.out.println("Selecione um item da lista:");
		 			prodId = e.nextInt();
		 			
		 		if(prodId < 0 || prodId>(lista.size()-1)) {
		 			prodId = -1;
		 			print.accept("Produto não cadastrado");
		 		}else {
		 			
		 			System.out.println("Quantas unidades deseja comprar?");
		 			lista.get(prodId).qtd = e.nextInt();
		 			
		 			print.accept(lista.get(prodId).calcularDesconto());
		 			
		 			listaCompra.add(lista.get(prodId));
		 		}
		 	}while(prodId == -1);
		 		
		 	e.close();
		 
		//imprime lista de compras
		listaCompra.forEach(System.out::println);
		 

	}

}
