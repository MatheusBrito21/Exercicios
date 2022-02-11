package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AlunoTeste {
	
	
	public static void main(String[] args) {
		
		//Mostrar so os alunos aprovados
		//Calcular a media das notas finais
		
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Ana", 8.5));
		alunos.add(new Aluno("Amanda", 9.1));
		alunos.add(new Aluno("Augusto", 6.5));
		alunos.add(new Aluno("Pedro", 8.5));
		alunos.add(new Aluno("Liza", 7.3));
		
		
		//Filtar os aprovados
		Predicate<Aluno> aprovados = al -> al.nota>=7.0;
		
		alunos.stream()
		.filter(aprovados)
		.forEach(ap -> System.out.println(ap.nome));
		
		
		
	}

}
