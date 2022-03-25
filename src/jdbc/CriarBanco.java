package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException  {
		
		//Metodo getConexao retorna um DriverManager.getConnection(); 
		Connection conexao = FabricaConexao.getConexao();
		//O objeto usado para executar uma instrução 
		//SQL estática e retornar os resultados que ela produz.
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Conexao finalizada!");
		conexao.close();
	}
}	
