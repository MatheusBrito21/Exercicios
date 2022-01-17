package fundamentos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		
		int num1 =5;
		int num2 =6;
		int num3 =10;
		
		int soma = num1+num2+num3;
		
		//operadores -> + - * /
		System.out.println(soma);
		
		//Ordem de precedência * / + -
		System.out.println(num1+ num2 * num3 / 2);
		System.out.println((num1 + num2) * num3/2);
		
		//resto da divisão %
		System.out.println(10%3);
		System.out.println(12%3);
	}
}
