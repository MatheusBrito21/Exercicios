package exercicios;

import java.util.Scanner;

public class Baskara {
	
public static void main(String[] args) {
	double a=0;
	double b=0;
	double c=0;
	double x1,x2,delta;
	
	Scanner e = new Scanner(System.in);
	
	System.out.println("Calculadora de Equações do 2º Grau.");
	System.out.println("Digite os valores de a, b e c:\n");

	System.out.println("a = ");
	a = e.nextDouble();
	System.out.println("b = ");
	b = e.nextDouble();
	System.out.println("c = ");
	c = e.nextDouble();
	e.close();
	
	//baskara
	delta = (Math.pow(b, 2) - 4*a*c);
	//raiz de delta
	delta = Math.sqrt(delta);
	
	x1 = ((-b) + delta)/2*a;
	x2 = ((-b) - delta)/2*a;
	
	System.out.println(String.format(
			"\nDelta = %.1f\n"
			+ "X1 = %.1f\n"
			+ "X2 = %.1f\n", delta,x1,x2));
}

}
