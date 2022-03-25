package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	
	
	public static void main(String[] args) throws SQLException{
		
		Connection conexao = FabricaConexao.getConexao();
	
		String sql = "CREATE TABLE IF NOT EXISTS PESSOAS(\r\n"
				+ "	COD INT AUTO_INCREMENT PRIMARY KEY,\r\n"
				+ "	NOME VARCHAR(80) NOT NULL\r\n"
				+ "	);";

		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		conexao.close();
		System.out.println("Conexao finalizada!");
		
		
	}
}
