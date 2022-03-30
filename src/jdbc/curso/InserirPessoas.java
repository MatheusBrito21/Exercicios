package jdbc.curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirPessoas {
	public static void main(String[] args) throws SQLException {
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Informe o nome:");
		String nome = e.nextLine();
		e.close();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO PESSOAS (NOME) VALUES(?)";
		//metodo seguro para comandos sql
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("Conexao finalizada!");
		conexao.close();
		
		
		
	}
}
