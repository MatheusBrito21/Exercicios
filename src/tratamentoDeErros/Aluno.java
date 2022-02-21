package tratamentoDeErros;

public class Aluno {
	
	String nome;
	double nota1;
	double nota2;
	
	public Aluno() {	
	}
	
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
	
	StringBuilder imprimirResultado() {
		String notaAluno = String.format("%s - %.1f - ", nome, calcularMedia());
		String statusAluno = calcularMedia()>=7?"Aprovado":"Reprovado"; 
		StringBuilder resulFinal = new StringBuilder();
		resulFinal.append(notaAluno).append(statusAluno);
		
		return resulFinal ;
	}

}
