package tratamentoDeErros;

public class ErroBasico {
	public static void main(String[] args) {
		
		Aluno a = null;
		
		try {
			imprimirNomeAluno(a);
		} catch (NullPointerException e) {
				System.out.println(e.getMessage());
		}
		
		try {
			
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
	
}
