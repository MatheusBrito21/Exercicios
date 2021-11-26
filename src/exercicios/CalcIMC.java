package exercicios;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class CalcIMC {
//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
//	IMC = Peso ÷ (Altura × Altura)
	public static void main(String[] args) {
		
		BinaryOperator<Double> calcIMC = (p,a) -> p/(Math.pow(a,2));
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Informe seu Peso(Kg):");
			double peso = e.nextDouble();
		System.out.println("Informe sua Altura(m):");
			double altura = e.nextDouble();
		e.close();
		
		double resultado = calcIMC.apply(peso, altura);
		
		System.out.printf("IMC:%.1f Kg",resultado);	
		
	}

}
