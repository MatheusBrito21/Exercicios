package exercicios;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class CalcPow {
	/*
	 * // Criar um programa que leia um valor e apresente os resultados ao
	 * quadrado e ao cubo do valor.
	 */
	
	public static void main(String[] args) {
		UnaryOperator<Double> aoQuadrado = v-> Math.pow(v, 2);
		UnaryOperator<Double> aoCubo = v-> Math.pow(v, 3);
		
		Scanner e = new Scanner(System.in);
		System.out.println("Informe um valor inteiro:");
		double var = e.nextDouble();
		e.close();
		
		double r1 = aoQuadrado.apply(var);
		double r2 = aoCubo.apply(var);
		
		System.out.printf("Quadrado = %.0f \nCubo = %.0f",r1,r2);
		
		
	}
}
