package streamAPI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CadastroAluno extends Aluno {

	static List<Aluno> cadastro = new ArrayList<>();

	void cadastrarAluno() {
		nome = JOptionPane.showInputDialog("Nome Aluno:");
		String s_nota1;
		s_nota1 = JOptionPane.showInputDialog("Nota 1:");
		String s_nota2;
		s_nota2 = JOptionPane.showInputDialog("Nome 2:");
		
		double nota1 = Double.parseDouble(s_nota1.replace(",", "."));
		double nota2 = Double.parseDouble(s_nota2.replace(",", "."));
		
		Aluno a = new Aluno(nome, nota1, nota2);
		cadastro.add(a);
	}
	
}
