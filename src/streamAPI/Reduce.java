package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Reduce {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Notebook", 2500));
		produtos.add(new Produto("Celular", 1999.90));
		produtos.add(new Produto("Tablet", 3000));
		produtos.add(new Produto("TV", 1499.90));
		
		
		Function<Produto, Double> valores = p -> p.preco;
		BinaryOperator<Double> somaTotal = (s,preco) -> s + preco;
		
		//metodo ifPresent
		produtos.stream().map(valores).reduce(somaTotal).ifPresent(System.out::println);
		
		//atribuindo a uma variável
		//o resultado é um OptionalDouble, por isso é necessário o uso do get();
		double total = produtos.stream().map(valores).reduce(somaTotal).get();
		System.out.printf("Total R$:%.2f",total);
		
	}

}
