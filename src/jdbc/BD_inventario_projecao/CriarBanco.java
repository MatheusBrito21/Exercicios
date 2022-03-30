package jdbc.BD_inventario_projecao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException {
		
		//conecta ao banco
		Connection conexao = ConectarBD.getConexao(); 
		
		//interface que usa a conexao para executar um comando sql
		Statement stmt = conexao.createStatement();
		
		String sql = "CREATE DATABASE IF NOT EXISTS INVENTARIO";
		
		//executa o comando
		stmt.execute(sql);
		
		conexao.close();
		System.out.println("Conexao finalizada");
		
	}
}
