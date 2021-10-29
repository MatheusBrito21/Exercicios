package exercicios;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para formar sua tabuada:");
		
		int num,resultado;
		num = e.nextInt();
		
		e.close();
		
		for(int i = 1;i<=10;i++) {
			resultado = num*i;
			System.out.printf("\n%d x %d = %d",num,i,resultado);
		}
		
	}

}
