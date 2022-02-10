package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Notebook", 2500));
		produtos.add(new Produto("Celular", 1999.90));
		produtos.add(new Produto("Tablet", 3000));
		produtos.add(new Produto("TV", 1499.90));
		
		
		//separar os produtos mais baratos
		Predicate<Produto> isCaro = p -> p.preco>=2000;
		
		//produtos.stream().filter(isCaro).forEach(pb-> System.out.println(pb.nome));
		
		//todos sao caros
		System.out.println(produtos.stream().allMatch(isCaro));
		//algum é caro
		System.out.println(produtos.stream().anyMatch(isCaro));
		//nenhum é caro
		System.out.println(produtos.stream().noneMatch(isCaro));
		
		
	}

}
