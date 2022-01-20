package arraysVsCollections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
	//LinkedHashSet<>() - ordem de insercao
	//TreeSet<>() - ordem alfabetica-numerica
	//HashSet<>() - ordem aleatória
		
		Set<String> alunos = new TreeSet<>();
		
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("Brenda");
		alunos.add("Aline");
		//adicionando pelo arquivo no github
		alunos.add("Matheus");
		//teste 2 adiionar pelo git
		alunos.add("Leonardo");
		
		//for(each)
		System.out.println("For(each)...");
		for(String nome: alunos) {
			System.out.println(nome);
		}
		
		//forEach()
		System.out.println("\nForEach()...");
		alunos.forEach(System.out::println);
	}
}
