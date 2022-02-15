package streamAPI;

import java.util.function.Consumer;

import javax.swing.JOptionPane;

public class AlunoTesteCadastro {
	public static void main(String[] args) {
		
		CadastroAluno cadastrar_aluno = new CadastroAluno();
//		CadastroAluno cadastrar_aluno1 = new CadastroAluno();
		
		Consumer<Aluno> imprimirCadastro = a -> System.out.println(a.nome);
		Consumer<Aluno> resultado = r -> System.out.println(r.imprimirResultado());
		
		String op;
		do {
			cadastrar_aluno.cadastrarAluno();
		 op = JOptionPane.showInputDialog("Deseja Cadastrar mais um aluno?S/Y");
		} while (op.equalsIgnoreCase("S"));
		
		CadastroAluno.cadastro.stream().forEach(imprimirCadastro);
		CadastroAluno.cadastro.stream().forEach(resultado);
		
	}
}
