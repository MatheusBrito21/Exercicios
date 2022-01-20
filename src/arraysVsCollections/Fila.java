package arraysVsCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//offer - add
		fila.offer("Peter");
		fila.offer("Tony");
		fila.offer("Rocky");
		fila.offer("Clint");
		
		//peek/Element- chama o proximo da fila sem remover
		fila.peek();
		fila.element();
		System.out.println("Peek - "+fila);
		System.out.println("Vazia "+fila.isEmpty());

		//poll/remove- chama o proximo da fila e remove
		fila.poll();
		System.out.println("\nPoll - "+fila);
		fila.poll();
		System.out.println("Poll - "+fila);
		fila.poll();
		System.out.println("Poll - "+fila);
		fila.poll();
		System.out.println(fila.poll());

	}

}
