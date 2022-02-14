package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class AlunoTeste {
	
	
	public static void main(String[] args) {
		
		//Mostrar so os alunos aprovados
		//Calcular a media das notas finais
		
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Ana", 8.5, 9.5));
		alunos.add(new Aluno("Amanda", 9.1, 6.0));
		alunos.add(new Aluno("Augusto", 6.5, 7));
		alunos.add(new Aluno("Pedro", 8.5,5));
		alunos.add(new Aluno("Liza", 7.3,10));
		
		
		alunos.stream().
		forEach(an -> System.out.println(an.nome +" Nota:"+ an.calcularMedia()));
		System.out.println("\n");
		
		
		//Filtar os aprovados
		//Predicate<Aluno> aprovados = al -> al.calcularMedia()>=7.0;
		//Function<Aluno, String> msg = ap -> ap.calcularMedia()>=7.0? "Aprovado": "Reprovado";
		Consumer<Aluno> resul = a -> a.imprimirResultado();
		
		alunos.stream().forEach(resul);
		
		
		
		
		
	}

}
