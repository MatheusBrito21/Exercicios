package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AlunoTeste {
	
	
	public static void main(String[] args) {
		
		//Calcular a media das notas finais
		
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Ana", 8.5, 9.5));
		alunos.add(new Aluno("Amanda", 9.1, 6.0));
		alunos.add(new Aluno("Augusto", 6.5, 7));
		alunos.add(new Aluno("Pedro", 8.5,5));
		alunos.add(new Aluno("Liza", 7.3,10));
		
		
		Consumer<Aluno> resul = a -> System.out.println(a.imprimirResultado());
		
		alunos.stream().forEach(resul);
		
		
		
		
		
	}

}
