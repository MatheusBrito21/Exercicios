package arraysVsCollections;

import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<>();
		
		livros.push("O Iluminado");
		livros.push("Star Wars");
		livros.push("Jogador N°1");
		livros.push("O Corpo fala");
		
		System.out.println("Topo da pilha....."+livros.peek()+"\n");
		for(String l: livros) {
			System.out.println(l.toUpperCase());
		}
		
		System.out.println("\nRetirar da Pilha...."+livros.pop());
		
		for(String l: livros) {
			System.out.println(l.toUpperCase());
		}
		
		System.out.println("\nBase da Pilha:"+livros.firstElement());
		System.out.println("\nTopo da Pilha:"+livros.lastElement());
	}
}
