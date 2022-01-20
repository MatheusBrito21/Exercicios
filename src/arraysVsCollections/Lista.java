package arraysVsCollections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		
		List<String> alunos = new ArrayList<>();
		alunos.add("João");
		alunos.add("Maria"); 
		alunos.add("Brenda");
		alunos.add("Aline");
		
		alunos.forEach(System.out::println);
		
		System.out.println("\nAdd...");
		System.out.println(alunos.add("Pedro"));
		System.out.println(alunos.size());
		alunos.forEach(System.out::println);
		
		System.out.println("\nRemove...");
		System.out.println(alunos.remove("maria"));	
		System.out.println(alunos.size());
		alunos.forEach(System.out::println);
		
		
		System.out.println("\nget()...");
		System.out.println(alunos.get(2));
		
		System.out.println("\nContem...");
		System.out.println(alunos.contains("Pedro"));
		
		System.out.println("\nEquals...");
		System.out.println(alunos.get(1).equals("Aline"));
		System.out.println(alunos.get(1).equals("Maria"));
		
		System.out.println("\n"+ alunos.get(0)+" Termina com...");
		System.out.println("a -"+alunos.get(0).endsWith("a"));
		System.out.println("o -"+alunos.get(0).endsWith("o"));
		
		
	}

}
