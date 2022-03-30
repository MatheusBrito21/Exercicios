package jdbc.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException{
		//string do driver JDBC
		//representa o local onde esta o banco de dados
		String stringDeConexao = "jdbc:mysql://localhost";
		String usuario = "root";
		String senha = "314159265";
		
		//interface que conecta ao BD
		Connection conexao = 
				DriverManager.getConnection(stringDeConexao, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}
}
