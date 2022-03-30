package jdbc.BD_inventario_projecao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelas  {
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = ConectarBD.getConexao();
		//declaração
		Statement stmt = conexao.createStatement();
		
		String sql = "CREATE TABLE IF NOT EXISTS INV_MAQUINAS("
				+ "EP INT UNSIGNED NOT NULL,"
				+ "MARCA VARCHAR(50) NOT NULL,"
				+ "MODELO VARCHAR(30) NOT NULL,"
				+ "N_SERIE VARCHAR(50) NOT NULL,"
				+ "SETOR VARCHAR(50),"
				+ "MONITORES INT UNSIGNED,"
				+ "COLABORADOR VARCHAR(100),"
				+ "primary key (EP),"
				+ "unique key(n_serie)"
				+ ");";
		
		stmt.execute(sql);
		
		conexao.close();
		System.out.println("Finalizado!");
		
		
	}
}
