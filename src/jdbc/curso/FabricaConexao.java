package jdbc.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	public static Connection getConexao() {
		try {
			//Login do banco
			final String conexaoBD = "jdbc:mysql://localhost/CURSO_JAVA";
			final String  usuario = "root";
			final String senha = "314159265";
			//realiza a conexao
			return DriverManager.getConnection(conexaoBD, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	 
	}
}
