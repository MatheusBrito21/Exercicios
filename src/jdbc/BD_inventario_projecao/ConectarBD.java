package jdbc.BD_inventario_projecao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarBD {
	public static Connection getConexao(){
	try {
		final String conexao ="jdbc:mysql://localhost/inventario";
		final String user ="root"; 
		final String psw ="314159265"; 
		
		return DriverManager.getConnection(conexao, user, psw);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	 

}
