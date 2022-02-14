package streamAPI;

public class Aluno {
	
	String nome;
	double nota1;
	double nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		
	}
	
	double calcularMedia() {
		double media = 0;
		media = (nota1+nota2)/2;
			
		return media;
	}
	
	String imprimirResultado() {
		String resultado = String.format("%s - %.1f - ", nome, calcularMedia());
		return resultado ;
	}

}
