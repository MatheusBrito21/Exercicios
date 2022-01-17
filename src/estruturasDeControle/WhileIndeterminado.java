package estruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		while(nota!= -1) {
			System.out.println("Digite a nota:");
			nota= e.nextDouble();
			
			if(nota<=10 && nota >=0) {
				somaDasNotas += nota;
				numeroDeNotas++;
			}
		}//while
		e.close();
		
		System.out.printf("A média das notas é %.2f",somaDasNotas/numeroDeNotas);
	}
}
