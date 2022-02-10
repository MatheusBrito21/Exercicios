package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(3,2,12,8,6,55,61,129);
		
		//converter em binario
		Function<Integer, String> toBinario = n -> Integer.toBinaryString(n);
		//inverter os numeros
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		//converter em inteiro
		Function<String, Integer> toInteger = b -> Integer.parseInt(b, 2);
		
		nums.stream()
		.map(toBinario)
		.map(inverter)
		.map(toInteger)
		.forEach(System.out::println);
			
	}
	
}
