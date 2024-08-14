package classesVSmetodos;

public class Desafio {
	//este � um atributo de instancia
	//so pode ser acessado por uma instancia de Desafio
	int a = 2;
	//atributo de Classe
	static int x = 4;
	
	public static void main(String[] args) {
		
		Desafio b = new Desafio();
		System.out.println(b.a);
		System.out.println(x);
	}

}
