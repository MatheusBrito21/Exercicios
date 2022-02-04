package arraysVsCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> aprovados = new HashMap<>();
		
		aprovados.put(1, "Harry");
		aprovados.put(2, "Jack");
		aprovados.put(3, "Neo");
		aprovados.put(4, "Wade");
		
		System.out.println(aprovados.containsKey(5));
		System.out.println(aprovados.containsValue("Wade"));
		
		System.out.println(aprovados.keySet());
		System.out.println(aprovados.values());
		
		//chave...
		System.out.println("Chave...");
		for(Integer chave: aprovados.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("Valor...");
		for(String valor: aprovados.values()) {
			System.out.println(valor);
		}
		
		System.out.println("Chave/Valor...");
		for(Entry<Integer, String>registro : aprovados.entrySet()) {
			System.out.println(registro.getKey()+" "+ registro.getValue());
		}

	}

}
