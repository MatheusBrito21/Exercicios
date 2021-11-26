package exercicios;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class CalcTemperatura {
	/*
	 * //Criar um programa que leia a temperatura em Fahrenheit e converta para
	 * Celsius.
	 * °C = (°F − 32) × 5/9 
	 */
	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		UnaryOperator<Double> converterF_C = f -> (f-32)*5/9;
		
		System.out.println("Informe a temperatura em Fahenheit:");
		
		double far = e.nextDouble();
		double celc = converterF_C.apply(far);
		e.close();
		
		System.out.println(String.format("%.1f°F = %.1f °C ", far,celc).replace(",", "."));
		
		
	}
}
