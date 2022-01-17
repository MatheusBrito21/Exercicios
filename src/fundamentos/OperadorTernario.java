package fundamentos;

import java.util.function.Function;
import java.util.function.Predicate;

public class OperadorTernario {
	public static void main(String[] args) {
		
		double nota = 7.1;
		//Atribuicao condicional
		//Se nota >= 7 ? true : false
		String resultado1 = nota >= 7 ?"Aprovado" : "Recuperação";
		
		//recebe um double e retorna um boolean
		Predicate<Double> resultado2 = n-> n>=7;
		//recebe um double e retorna uma string
		Function<Double, String> resultado3 = n-> n>=7 ?"Aprovado" : "Recuperação";
		
		
		
		System.out.println(resultado1);
		System.out.println(resultado2.test(nota));
		System.out.println(resultado3.apply(nota));
		
	}

}
