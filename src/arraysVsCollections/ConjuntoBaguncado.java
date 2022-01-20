package arraysVsCollections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Set conjunto = new HashSet();
		//add
		conjunto.add(1);
		conjunto.add("Marvel");
		conjunto.add('D');
		conjunto.add(false);
		conjunto.add(5.6);
		System.out.println("Size:"+conjunto.size()+"-"+conjunto);
		
		//remove
		conjunto.remove('D');
		System.out.println("Size:"+conjunto.size()+"-"+conjunto);
		
		//contains
		System.out.println(conjunto.contains("Marvel"));
		System.out.println(conjunto.contains('D'));
		
		Set conjunto2 = new HashSet();
		conjunto2.add("Sony");
		conjunto2.add('F');
		conjunto2.add(1);
		System.out.println("Size:"+conjunto2.size()+"-"+conjunto2);
		
		//união
		conjunto.addAll(conjunto2);
		System.out.println("Size:"+conjunto.size()+"-"+conjunto);
		
		//intersecçao
//		conjunto.retainAll(conjunto2);
//		System.out.println("Size:"+conjunto.size()+"-"+conjunto);
		
		System.out.println("\n"+"forEach...");
		conjunto.forEach(System.out::println);
		
	}

}
